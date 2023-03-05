package com.erp.step_definitions;

import com.erp.pages.RepairsPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US11_StepDes {

    RepairsPage repairsPage = new RepairsPage();


    @And("the user is select all the repair orders by clicking \"Repair Reference\" checkbox")
    public void theUserIsSelectAllTheRepairOrdersByClickingCheckbox() {

        repairsPage.repairReferenceCheckBox.click();

        for (WebElement each : repairsPage.repairRefAllCheckBoxesList){

            Assert.assertTrue(each.isSelected());
        }


    }

}
