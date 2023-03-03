package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RepairsPage {

    public RepairsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space()='Repairs']")
    public WebElement repairsPageItself;

    @FindBy(xpath = "")
    public List<WebElement> repairsOrderColumnsList;




}
