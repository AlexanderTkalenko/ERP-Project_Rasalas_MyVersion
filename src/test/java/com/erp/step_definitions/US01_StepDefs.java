package com.erp.step_definitions;

import com.erp.pages.SalesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US01_StepDefs {

    SalesPage salesPage = new SalesPage();

    @When("the user go to the Sales page")
    public void the_user_go_to_the_sales_page() {
        salesPage.salesPageItself.click();
    }


    @Then("the user should verify {int} columns of quotation")
    public void the_user_should_verify_columns_of_quotation(int numberColumns) {

        Assert.assertEquals(salesPage.salesQuotationColumnsList.size(), numberColumns);

    }





}
