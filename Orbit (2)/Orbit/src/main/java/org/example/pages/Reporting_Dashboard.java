package org.example.pages;

import org.example.Utils.Wait;
import org.example.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class Reporting_Dashboard {
    Wait wait=new Wait();
    public @FindBy(xpath = "///*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")
    WebElement Dashboard_btn;
public @FindBy(xpath = "/html")
WebElement Dashboard_page;

    public void Click_Dashboard_Tab()
    {        TestBase.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        wait.waitUntilElementIsVisible(Dashboard_btn,20);

        Dashboard_btn.click();
        TestBase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //me7tag a7ot 7aga testana lama el page tb2a loaded

// me7tag a calculate el time w a7oto f float 3alashan ba3d kda a3melo save fel db 
    }
}
