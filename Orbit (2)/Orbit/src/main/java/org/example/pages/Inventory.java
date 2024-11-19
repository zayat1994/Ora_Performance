package org.example.pages;

import org.example.Utils.Wait;
import org.example.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inventory {
    Wait wait=new Wait();

    public void Inventory_page_factory()
    {
        PageFactory.initElements(TestBase.getDriver(), this);

    }
//    @FindBy(xpath = "//a[@class='nav-link']")
//    WebElement Inventory;
    @FindBy(partialLinkText = "Inventory")
    WebElement Inventory;
    

    public void Click_Inventory()
    {
        wait.implicitWait(20);
        Inventory.click();

    }

}
