package com.erp.step_definitions;

import com.erp.pages.DashBoard;
import com.erp.pages.LoginPage;
import com.erp.utilities.ConfigurationReader;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env.url"));
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username = null;
        String password = null;

        if (userType.equalsIgnoreCase("posmanager")) {
            username = ConfigurationReader.getProperty("pos.manager.username");
            password = ConfigurationReader.getProperty("pos.manager.password");

        } else if (userType.equalsIgnoreCase("crmmanager")) {
            username = ConfigurationReader.getProperty("crm.manager.username");
            password = ConfigurationReader.getProperty("crm.manager.password");

        } else if (userType.equalsIgnoreCase("salesmanager")) {
            username = ConfigurationReader.getProperty("sales.manager.username");
            password = ConfigurationReader.getProperty("sales.manager.password");

        } else if (userType.equalsIgnoreCase("inventorymanager")) {
            username = ConfigurationReader.getProperty("inventory.manager.username");
            password = ConfigurationReader.getProperty("inventory.manager.password");

        } else if (userType.equalsIgnoreCase("expensesmanager")) {
            username = ConfigurationReader.getProperty("expenses.manager.username");
            password = ConfigurationReader.getProperty("expenses.manager.password");
        }

        //send username and password and login
        new LoginPage().login(username, password);
    }

    LoginPage loginPage = new LoginPage();

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {

        loginPage.login(username, password);
    }

    DashBoard dashBoard = new DashBoard();

    @Then("account holder name should be {string}")
    public void accountHolderNameShouldBe(String expectedIndicator) {

        String actualIndicator = dashBoard.userName_dashboard.getText();

        Assert.assertEquals(actualIndicator, expectedIndicator);
    }

    @Given("the user logged in with {string} user type")
    public void theUserLoggedInWithUserType(String user) {
    }

    @Then("verify the {string} user type is logged in")
    public void verifyTheUserTypeIsLoggedIn(String userType) {
        String actualType = dashBoard.userName_dashboard.getText();
        Assert.assertTrue(actualType.toLowerCase().contains(userType.toLowerCase()));
    }


    @When("the user is login using {string} and {string}")
    public void theUserIsLoginUsingAnd(String userName, String password) {
        loginPage.txt_userName.sendKeys(userName);
        loginPage.txt_password.sendKeys(password);
        loginPage.btn_login.click();
    }
}
