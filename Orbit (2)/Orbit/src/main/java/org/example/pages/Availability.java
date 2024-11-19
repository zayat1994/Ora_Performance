package org.example.pages;

import org.example.Utils.Wait;
import org.example.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Availability {
    public void SiteAvailability_Page_Factory() {
        PageFactory.initElements(TestBase.getDriver(), this);
        TestBase.loadCredentialsPropertyFile();
    }
    Wait wait=new Wait();
    @FindBy (xpath = "//a[@id='navbarDropdownAvailabilitySLA']")
    WebElement Availability_SLA;
    @FindBy(xpath = "//a[normalize-space()='Site Availability']")
    WebElement Site_Availability;
    @FindBy(xpath = "//a[normalize-space()='Site Availability Trend']")
    WebElement Site_AvailabilityTrend;
    @FindBy(xpath = "//a[normalize-space()='Path Availability']")
    WebElement Path_Availability;


    public void Click_Availability_SLA()

    {        wait.implicitWait(10);

        Availability_SLA.click();

    }
    public void Click_Site_Availability()
    {
        Site_Availability.click();
    }
    public void Click_Site_Availability_Trend()
    {
        wait.implicitWait(10);
        Site_AvailabilityTrend.click();

    }

    public void Click_Path_Availability()
    {
        wait.implicitWait(10);
        Path_Availability.click();
    }


}
