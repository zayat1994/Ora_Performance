package org.example.pages;

import org.example.Utils.ORA_MAIN_VARIABLES;
import org.example.Utils.Wait;
import org.example.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PerformanceSLA {

    Wait wait = new Wait();

    public void PerformanceSLA_page_factory()
    {

        PageFactory.initElements(TestBase.getDriver(), this);

    }

    @FindBy(xpath = "//a[@id='navbarDropdownPerformanceSLA']")
    WebElement PerformanceSla;
    @FindBy(xpath = "//a[normalize-space()='Round Trip Delay']")
    WebElement RTD;
    @FindBy(xpath = "//a[normalize-space()='Packet Loss Ratio']")
    WebElement PLR;
    @FindBy(xpath = "//a[normalize-space()='Jitter']")
    WebElement Jitter;

    public void Click_PerformanceSLA()
    {
        wait.implicitWait(20);
        PerformanceSla.click();

    }
    public void Click_RTD()
    {
        wait.implicitWait(20);
        RTD.click();

    }
    public void Click_Jitter()
    {
        wait.implicitWait(20);
        Jitter.click();
    }
public void Click_PLR()
{
    wait.implicitWait(20);
    PLR.click();

}
}
