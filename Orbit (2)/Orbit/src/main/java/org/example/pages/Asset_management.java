package org.example.pages;

import org.example.Utils.Wait;
import org.example.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Asset_management {
Wait wait=new Wait();
    public void Asset_management_PageFactory()
    {
        PageFactory.initElements(TestBase.getDriver(), this);

    }

    @FindBy(xpath ="//a[normalize-space()='Generic Processes']" )
    WebElement Generic_Process;
    @FindBy(linkText = "Asset Management")
    WebElement Asset_Management_btn;


    @FindBy (linkText = "Overview")
    WebElement Overview;
    public void Click_Generic_Process()
    {      wait.implicitWait(60);

        wait.waitUntilElementPresenceXpath(Generic_Process);
        Generic_Process.click();

    }

    public void Click_Asset_Management()
    {
        Asset_Management_btn.click();

    }
    public void Click_Overview()
    {

        Overview.click();
    }



}


