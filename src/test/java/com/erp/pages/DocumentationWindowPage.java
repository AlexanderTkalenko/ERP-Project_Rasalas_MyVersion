package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentationWindowPage {

    public DocumentationWindowPage(){
        PageFactory.initElements(Driver.getDriver(), this );
    }


    @FindBy(xpath = "//h1[text()='Odoo Documentation']")
    public WebElement odooDocMessage;


    @FindBy(xpath = "//section//h2//a[text()='User Docs']")
    public WebElement topicUserDocs;

    @FindBy(xpath = "//h2[@class='border-top pt-4']//a[@href='developer.html'][normalize-space()='Developer']")
    public WebElement topicDeveloper;

    @FindBy(xpath = "//h2[@class='border-top pt-4 pt-lg-0']//a[@href='administration.html'][normalize-space()='Install and Maintain']")
    public WebElement topicInstallAndMaintain;

    @FindBy(xpath = "//h2[@class='border-top pt-4']//a[@href='contributing.html'][normalize-space()='Contributing']")
    public WebElement topicContribute;



}
