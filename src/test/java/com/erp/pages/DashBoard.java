package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashBoard {

    public DashBoard(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement btn_logOut;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement userName_dashboard;

    @FindBy(xpath = "//a[@data-menu='documentation']")
    public WebElement documentationButton;


}
