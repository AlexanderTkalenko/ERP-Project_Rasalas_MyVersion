package com.erp.step_definitions;

import com.erp.pages.SalesPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US10_StepDefs {

    SalesPage salesPage = new SalesPage();

    @And("the user is select all the quotation by clicking \"Quotation Number\" checkbox")
    public void theUserIsSelectAllTheQuotationByClickingCheckbox() {
        salesPage.quotationNumberCheckBoxButton.click();

        for (WebElement each : salesPage.quotationNumbersCheckBoxesList){
            Assert.assertTrue(each.isSelected());
        }

        System.out.println(salesPage.quotationNumbersCheckBoxesList.size());



    }



}
