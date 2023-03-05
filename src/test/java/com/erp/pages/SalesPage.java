package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalesPage {

    public SalesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[normalize-space()='Sales']")
    public WebElement salesPageItself;


    @FindBy(xpath = "//th[@class='o_column_sortable']")
    public List<WebElement> salesQuotationColumnsList;


    @FindBy(xpath = "//th[@class='o_list_record_selector']//input[@type='checkbox']")
    public WebElement quotationNumberCheckBoxButton;


    @FindBy(xpath = "//div[@class='o_checkbox']//input[@type='checkbox']")
    public List<WebElement> quotationNumbersCheckBoxesList;





}
