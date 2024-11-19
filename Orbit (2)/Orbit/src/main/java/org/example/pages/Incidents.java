package org.example.pages;

import org.example.Utils.Wait;
import org.example.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Incidents {

    Wait wait= new Wait();
    public void Incidents_page_factory()
    {
        PageFactory.initElements(TestBase.getDriver(), this);

    }
    public @FindBy(xpath = "//a[@id='navbarDropdownIncidents']")
    WebElement Incidents;

    public @FindBy(xpath = "//a[normalize-space()='GTTR']")
    WebElement GTTR;
    public @FindBy(xpath = "//a[normalize-space()='Incident Types']")
    WebElement Incident_types;

    public @FindBy(xpath = "//a[normalize-space()='DTTR']")
    WebElement DTTR;

    public void Click_Incidents()
    {
        wait.implicitWait(20);
        Incidents.click();
        wait.implicitWait(20);

    }

    public void Click_GTTR()
    {
        wait.implicitWait(20);
        GTTR.click();
        wait.implicitWait(20);
    }

    public void Click_DTTR()
    {
        wait.implicitWait(20);
        DTTR.click();
        wait.implicitWait(20);
    }
    public void Click_Incident_types()
    {
        wait.implicitWait(20);
        Incident_types.click();
        wait.implicitWait(20);
    }


}
