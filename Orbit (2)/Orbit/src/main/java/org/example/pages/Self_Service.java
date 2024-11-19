package org.example.pages;

import org.example.Utils.ORA_MAIN_VARIABLES;
import org.example.Utils.Wait;
import org.example.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Self_Service {
    Wait wait=new Wait();
    ORA_MAIN_VARIABLES variables=new ORA_MAIN_VARIABLES();
    public void Self_Service_page_factory()
    {

        PageFactory.initElements(TestBase.getDriver(), this);

    }
    @FindBy(xpath = "//div[@id='navbarSupportedContent']//a[@id='navbarDropdown']")
    WebElement SelfService;
    @FindBy(xpath = "//a[normalize-space()='Report Publication']")
    WebElement Report_Publication;
    @FindBy(xpath = "//a[normalize-space()='Data Quality']")
    WebElement Data_Quality;
    @FindBy(xpath = "//a[@class='dropdown-item current-page']")
    WebElement Data_Qaulity_Incidents;
    @FindBy(xpath = "//a[@routerlink='/ORA/Self-Service-Site-Availability']")
    WebElement Data_Quality_SiteAvailability;
    @FindBy(xpath = "//a[@routerlink='/ORA/Self-Service-Path-Availability']")
    WebElement Data_Qaility_PathAvailability;
    @FindBy(xpath = "//a[normalize-space()='Path Performance']")
    WebElement Data_Quality_Path_Performance;
    @FindBy(xpath = "//a[normalize-space()='Bulk Operations']")
    WebElement Data_Quality_BulkOperations;
    @FindBy(xpath = "//a[@class='dropdown-item'][normalize-space()='Incidents']")
    WebElement Data_Quality_BulkOperations_Incidents;
    @FindBy(xpath = "//a[normalize-space()='Manage TopoSite']")
    WebElement Manage_TopoSite;
    @FindBy(xpath = "//a[normalize-space()='Threshold Management']")
    WebElement Threshold_Management;
    @FindBy(xpath = "//a[@routerlink='/ORA/Self-Service-Site-Availability-Configuration']")
    WebElement Threshold_Management_SiteAvailability;
    @FindBy(xpath = "//a[@routerlink='/ORA/Self-Service-Path-Availability-Configuration']")
    WebElement Threshold_Management_PathAvailability;
    @FindBy(xpath = "//a[@routerlink='/ORA/Self-Service-Path-Performance-Configuration']")
    WebElement Threshold_Management_PathPerformance;
    @FindBy(xpath = "//a[@routerlink='/ORA/Self-Service-GTTR-Configuration']")
    WebElement Threshold_Management_GTTR;
    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[8]/div/div[2]/a[5]")

    WebElement Threshold_Management_BulkOperations;
    @FindBy(xpath = "//a[@routerlink='/ORA/self-service/bulk-target-value-edit/site-availability']")
    WebElement Threshold_Management_BulkOperations_SiteAvailability;
    @FindBy(xpath = "//a[@routerlink='/ORA/self-service/bulk-target-value-edit/path-availability']")
    WebElement Threshold_Management_BulkOperations_PathAvailability;
    @FindBy(xpath = "//a[@routerlink='/ORA/self-service/bulk-target-value-edit/path-performance']")
    WebElement Threshold_Management_BulkOperations_PathPerformance;
    @FindBy(xpath = "//a[@routerlink='/ORA/self-service/bulk-target-value-edit/gttr']")
    WebElement Threshold_Management_BulkOperations_GTTR;
    @FindBy(xpath = "//a[@routerlink='/ORA/self-service/bulk-target-value-edit/dttr']")
    WebElement Threshold_Management_BulkOperations_DTTR;
    @FindBy(xpath = "//a[normalize-space()='Executive Report']")
    WebElement Executive_Report;
    @FindBy(xpath = "//a[normalize-space()='B2G Microsoft']")
    WebElement B2G_Microsoft;
    @FindBy(xpath = "//a[normalize-space()='Reporting as a Service']")
    WebElement RAAS;

    public void Click_SelfService()
    {
        wait.implicitWait(20);
        SelfService.click();
    }
    public void Click_Report_Publication()
    {
        wait.implicitWait(20);
        Report_Publication.click();
    }
    public void Click_Data_Quality()
    {
        wait.implicitWait(20);
        Data_Quality.click();

    }
    public void Click_Data_Qaulity_Incidents()
    {
        wait.implicitWait(60);
        Data_Qaulity_Incidents.click();

    }
    public void Click_Data_Quality_SiteAvailability()
    {
        wait.implicitWait(20);
        Data_Quality_SiteAvailability.click();
    }
    public void Click_Data_Qaility_PathAvailability()
    {
        wait.implicitWait(20);
        Data_Qaility_PathAvailability.click();

    }
    public void Click_Data_Quality_Path_Performance()
    {
        wait.implicitWait(20);
        Data_Quality_Path_Performance.click();

    }
    public void Click_Data_Quality_BulkOperations()
    {

        wait.implicitWait(20);
        variables.Scroll_Down_Element(Data_Quality_BulkOperations);
        Data_Quality_BulkOperations.click();

    }
    public void Click_Data_Quality_BulkOperations_Incidents()
    {
        wait.implicitWait(20);
        variables.Scroll_Down_Element(Data_Quality_BulkOperations_Incidents);
        Data_Quality_BulkOperations_Incidents.click();

    }
    public void Click_Manage_TopoSite()
    {
        wait.implicitWait(20);
        variables.Scroll_Down_Element(Manage_TopoSite);
        Manage_TopoSite.click();
    }
    public void Click_Threshold_Management()
    {
        wait.implicitWait(20);
        variables.Scroll_Down_Element(Threshold_Management);
        Threshold_Management.click();

    }

    public void Click_Threshold_Management_SiteAvailability()
    {
        wait.implicitWait(20);
        variables.Scroll_Down_Element(Threshold_Management_SiteAvailability);

        Threshold_Management_SiteAvailability.click();

    }
    public void Click_Threshold_Management_PathAvailability()
    {
        wait.implicitWait(20);
        variables.Scroll_Down_Element(Threshold_Management_PathAvailability);

        Threshold_Management_PathAvailability.click();
    }
    public void Click_Threshold_Management_PathPerformance()
    {
        wait.implicitWait(20);
        variables.Scroll_Down_Element(Threshold_Management_PathPerformance);

        Threshold_Management_PathPerformance.click();
    }
    public void Click_Threshold_Management_GTTR()
    {
        wait.implicitWait(20);
        variables.Scroll_Down_Element(Threshold_Management_GTTR);

        Threshold_Management_GTTR.click();


    }
    public void Click_Threshold_Management_BulkOperations()
    {

//        wait.implicitWait(20);
//        variables.Scroll_Down_Element(Threshold_Management_BulkOperations);
//        variables.Scroll_Down_Element(Executive_Report);
//        variables.Scroll_Down();

        Threshold_Management_BulkOperations.click();

    }
    public void Click_Threshold_Management_BulkOperations_SiteAvailability()
    {
        wait.implicitWait(20);
        variables.Scroll_Down_Element(Threshold_Management_BulkOperations_SiteAvailability);

        Threshold_Management_BulkOperations_SiteAvailability.click();
    }
    public void Click_Threshold_Management_BulkOperations_PathAvailability()
    {
        wait.implicitWait(20);
        variables.Scroll_Down_Element(Threshold_Management_BulkOperations_PathAvailability);

        Threshold_Management_BulkOperations_PathAvailability.click();
    }
    public void Click_Threshold_Management_BulkOperations_PathPerformance()
    {
        wait.implicitWait(20);
        variables.Scroll_Down_Element(Threshold_Management_BulkOperations_PathPerformance);

        Threshold_Management_BulkOperations_PathPerformance.click();
    }
    public void Click_Threshold_Management_BulkOperations_GTTR()
    {
        wait.implicitWait(20);
        variables.Scroll_Down_Element(Threshold_Management_BulkOperations_GTTR);

        Threshold_Management_BulkOperations_GTTR.click();
    }
    public void Click_Threshold_Management_BulkOperations_DTTR()
    {
        wait.implicitWait(20);
        variables.Scroll_Down_Element(Threshold_Management_BulkOperations_DTTR);
variables.Scroll_Down();
        Threshold_Management_BulkOperations_DTTR.click();
    }
    public void Click_Executive_Report()
    {
        wait.implicitWait(20);
        variables.Scroll_Down_Element(Executive_Report);

        Executive_Report.click();
    }
    public void Click_B2G_Microsoft()
    {
        wait.implicitWait(20);
        variables.Scroll_Down_Element(B2G_Microsoft);

        B2G_Microsoft.click();
    }
    public void Click_RAAS()
    {
        wait.implicitWait(20);
        variables.Scroll_Down_Element(RAAS);

        RAAS.click();
    }

}
