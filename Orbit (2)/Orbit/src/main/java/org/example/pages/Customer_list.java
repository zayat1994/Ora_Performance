package org.example.pages;

import org.example.Utils.Wait;
import org.example.base.TestBase;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Customer_list {
    Wait wait= new Wait();
    public void Customers_page_factory()
    {
        PageFactory.initElements(TestBase.getDriver(), this);

    }
    public @FindBy(xpath = "//div[@id='dropdownMenuButton']")
    WebElement Customer_drop_down;
    @FindBy(xpath = "//a[normalize-space()='The Goodyear Tire and Rubber Company']")
    WebElement The_Goodyear_customer;
    @FindBy(xpath = "//a[@class='dropdown-item dropdown-item-title']")
    WebElement Select_Customer;
    @FindBy(xpath = "//a[normalize-space()='MMG Australia Limited']")
    WebElement MMG_Australia;
    @FindBy(xpath = "//a[normalize-space()='Reporting']")
    public WebElement Reporting;
    @FindBy(xpath = ("//a[normalize-space()='Dashboard']"))
    WebElement Dashboard;
    public void click_Dashboard()
    {
        wait.implicitWait(20);
        Dashboard.click();
    }
    public void clickOnCustomer_drop_down()
    {
        Customer_drop_down.click();
    }
    public void Select_customer()
    {
        Select_Customer.click();

    }
    public void Click_ThegoodYear()
    {
        The_Goodyear_customer.click();

    }

    public void MMG_Customer()
    {
        MMG_Australia.click();
    }

    public void Reporting_click()
    {
        Reporting.click();
        wait.implicitWait(10);

    }


}
