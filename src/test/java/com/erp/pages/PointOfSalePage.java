package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PointOfSalePage {

    public PointOfSalePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@class='oe_menu_toggler']//span[@class='oe_menu_text'][normalize-space()='Point of Sale']")
    public WebElement pointOfSalePage;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[8]/ul[1]/li[1]/a[1]/span[1]")
    public WebElement ordersButton;


    @FindBy(xpath = "//th[@class='o_list_record_selector']//input[@type='checkbox']")
    public WebElement orderReferenceCheckBox;


    @FindBy(xpath = "//button[normalize-space()='Action']")
    public WebElement actionButton;



    @FindBy(xpath = "//div[@class='o_content']//input[@type='checkbox']")
    public List<WebElement> orderReferenceCheckBoxList;


    @FindBy(xpath = "//div[@class='btn-group o_dropdown open']//li")
    public List<WebElement> actionOptionsList;



}
