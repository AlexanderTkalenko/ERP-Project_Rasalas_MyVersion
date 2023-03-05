package com.erp.step_definitions;

import com.erp.pages.PointOfSalePage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US05_StepDefs {


    PointOfSalePage pointOfSalePage = new PointOfSalePage();

    @When("the user click to Point os Sales module")
    public void the_user_click_to_point_os_sales_module() {
        pointOfSalePage.pointOfSalePage.click();
    }
    @When("the user click to orders")
    public void the_user_click_to_orders() {
        pointOfSalePage.ordersButton.click();
    }
    @When("the user checking the Order reference")
    public void the_user_checking_the_order_reference() {
        pointOfSalePage.orderReferenceCheckBox.click();
    }
    @Then("all the orders should be checked")
    public void all_the_orders_should_be_checked() {

        //pointOfSalePage.orderReferenceCheckBoxList.remove(0);
        //pointOfSalePage.orderReferenceCheckBoxList.remove(0);


        for (WebElement each : pointOfSalePage.orderReferenceCheckBoxList){
            Assert.assertTrue(each.isSelected());
        }

        System.out.println(pointOfSalePage.orderReferenceCheckBoxList.size());
    }





}
