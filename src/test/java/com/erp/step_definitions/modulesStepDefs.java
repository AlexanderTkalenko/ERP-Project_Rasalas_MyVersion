package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.LoginPage;
import com.erp.utilities.ConfigurationReader;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class modulesStepDefs {



    @Given("the user is on login page")
    public void the_user_is_oo_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env.url"));
    }

    LoginPage loginPage = new LoginPage();

    @Given("the user is logged in as POSmanager")
    public void the_user_is_logged_in_as_po_smanager() {
        loginPage.login(ConfigurationReader.getProperty("pos.manager.username"),ConfigurationReader.getProperty("pos.manager.password"));
    }

    BasePage basePage = new BasePage();


    @Then("verify access to all main modules - {int}")
    public void verifyAccessToAllMainModules(int numberModules) {
        Assert.assertEquals(basePage.modulesList.size(), numberModules);
    }
}
