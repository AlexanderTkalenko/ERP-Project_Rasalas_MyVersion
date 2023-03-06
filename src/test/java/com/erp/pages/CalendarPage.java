package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarPage {

    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[normalize-space()='Calendar']")
    public WebElement calendarPageItself;


    @FindBy(xpath = "//div[@class='fc-slats']//span")
    public List<WebElement> timeLine0_23List;





}
