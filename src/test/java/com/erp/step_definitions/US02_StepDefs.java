package com.erp.step_definitions;

import com.erp.pages.RepairsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US02_StepDefs {

    RepairsPage repairsPage = new RepairsPage();

    @When("the user go to the Repairs page")
    public void the_user_go_to_the_repairs_page() {
        repairsPage.repairsPageItself.click();
    }

    @Then("the user should verify {int} columns of repair orders")
    public void the_user_should_verify_columns_of_repair_orders(Integer numberColumns) {
        Assert.assertTrue(repairsPage.repairsOrderColumnsList.size() == numberColumns);
    }




}
