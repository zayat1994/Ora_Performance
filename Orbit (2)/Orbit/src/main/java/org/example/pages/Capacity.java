package org.example.pages;

import org.example.Utils.Wait;
import org.example.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Capacity {
    Wait wait =new Wait();

    public void Capacity_page_factory()
    {

        PageFactory.initElements(TestBase.getDriver(), this);

    }
    @FindBy(xpath = "//a[@id='navbarDropdownCapacity']")
    WebElement Capacity;

    @FindBy(xpath = "//a[normalize-space()='Total Volume']")
    WebElement Total_Volume;
    @FindBy(xpath = "//a[normalize-space()='Bandwidth Usage']")
    WebElement BW_usage;

    @FindBy(xpath = "//a[normalize-space()='Recurring Top 5 Sites']")

    WebElement Recurring_Top_5_Sites;

    public void Click_Total_Volume()
    {
        wait.implicitWait(20);
        Total_Volume.click();
    }


    public void Click_Capacity()
    {
        wait.implicitWait(20);
        Capacity.click();

    }

    public void Click_BW_usage()
    {
        wait.implicitWait(20);
        BW_usage.click();

    }
    public void Click_Recurring()
    {
        wait.implicitWait(20);
        Recurring_Top_5_Sites.click();

    }

}
