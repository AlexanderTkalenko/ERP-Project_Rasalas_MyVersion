package com.erp.step_definitions;

import com.erp.pages.DashBoard;
import com.erp.pages.DocumentationWindowPage;
import com.erp.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US06_StepDefs {

    DashBoard dashBoard = new DashBoard();
    DocumentationWindowPage docPage = new DocumentationWindowPage();

    @When("the user click on username dashboard")
    public void the_user_click_on_username_dashboard() {
        dashBoard.userName_dashboard.click();
    }
    @When("the user click on Documentation button")
    public void the_user_click_on_documentation_button() {
        dashBoard.documentationButton.click();
    }
    @Then("the user should be able to see \"Odoo Documentation\" message in a new window")
    public void the_user_should_be_able_to_see_message() {
       String mainWindow = Driver.getDriver().getWindowHandle();

        for (String each : Driver.getDriver().getWindowHandles()){
            Driver.getDriver().switchTo().window(each);
        }

        String actualMessage = docPage.odooDocMessage.getText();

        Assert.assertTrue(actualMessage.equalsIgnoreCase("Odoo Documentation"));


    }


    @Then("the user should be able to see 4 main document topics \\(User Docs, Developer, Install and Maintain, Contribute)")
    public void theUserShouldBeAbleToSeeMainDocumentTopicsUserDocsDeveloperInstallAndMaintainContribute() {
        for (String each : Driver.getDriver().getWindowHandles()){
            Driver.getDriver().switchTo().window(each);
        }

        String actualUserDocs = docPage.topicUserDocs.getText();
        String actualDeveloper = docPage.topicDeveloper.getText();
        String actualInstallAndMaintain= docPage.topicInstallAndMaintain.getText();
        String actualContribute = docPage.topicContribute.getText();


        Assert.assertEquals(actualUserDocs, "User Docs");
        Assert.assertEquals(actualDeveloper,"Developer");
        Assert.assertEquals(actualInstallAndMaintain, "Install and Maintain");
        Assert.assertEquals(actualContribute, "Contribute");


    }
}
