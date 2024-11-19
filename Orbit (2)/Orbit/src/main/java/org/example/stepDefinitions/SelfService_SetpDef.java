package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Utils.ORA_MAIN_VARIABLES;
import org.example.Utils.Wait;
import org.example.database.DatabaseConnection;
import org.example.pages.Self_Service;

public class SelfService_SetpDef {
    Self_Service selfService = new Self_Service();
    ORA_MAIN_VARIABLES variables = new ORA_MAIN_VARIABLES();
    Wait wait = new Wait();
    DatabaseConnection databaseConnection = new DatabaseConnection();

    @Given("user clicks on Self Service")
    public void SelfService_btn() {
        selfService.Self_Service_page_factory();
        selfService.Click_SelfService();
        variables.setMenuName("Self Service");


    }

    @When("user click on Reporting Publication")
    public void Open_Reporting_Publication() {
        variables.setStart_time();
        selfService.Click_Report_Publication();
        wait.implicitWait(20);
        variables.setFinish_time();
    }

    @Then("user is navigated to Reporting Publication")
    public void Reporting_Publication() {
        variables.setTimeElapsed();
        variables.setSlaKpi("Reporting Publication");
        databaseConnection.Open_Connection();
    }

    @When("user click on Data Quality")
    public void DataQuality_btn() {
        wait.implicitWait(20);
        selfService.Click_Data_Quality();
    }

    @When("user clicks on Incidents Data Quality")
    public void Open_Incidents_DataQuality() {
        variables.setStart_time();
        selfService.Click_Data_Qaulity_Incidents();
        wait.implicitWait(20);
        variables.setFinish_time();

    }

    @Then("user is navigated to Incidents Data Quality")
    public void Incidents_DataQuality() {
        variables.setTimeElapsed();
        variables.setSlaKpi("Incidents");
        databaseConnection.Open_Connection();
    }

    @When("user click on Site Availability Data Quality")
    public void Open_SiteAvailability_DataQuality() {
        variables.setStart_time();
        selfService.Click_Data_Quality_SiteAvailability();
        wait.implicitWait(20);
        variables.setFinish_time();
    }

    @Then("user is navigated to Site Availability Data Quality")
    public void SiteAvailability_DataQuality() {
        variables.setTimeElapsed();
        variables.setSlaKpi("Site Availability");
        databaseConnection.Open_Connection();
    }

    @When("user click on Path Availability Data Quality")

    public void Open_Path_Availability_Data_Quality() {
        variables.setStart_time();
        selfService.Click_Data_Qaility_PathAvailability();
        wait.implicitWait(20);
        variables.setFinish_time();

    }

    @Then("user is navigated to Path Availability Data Quality")

    public void Path_Availability_Data_Quality() {
        variables.setTimeElapsed();
        variables.setSlaKpi("Path Availability");
        databaseConnection.Open_Connection();
    }

    @When("user click on Path Performance Data Quality")
    public void Open_Path_Performance_DataQuality() {
        variables.setStart_time();
        selfService.Click_Data_Quality_Path_Performance();
        wait.implicitWait(20);
        variables.setFinish_time();

    }

    @Then("user is navigated to Path Performance Data Quality")

    public void Path_Performance_DataQuality() {
        variables.setTimeElapsed();
        variables.setSlaKpi("Path Performance");
        databaseConnection.Open_Connection();
    }

    @When ("user click on Data Quality Bulk Operations")
    public void DataQualityBulkOperation_btn()
    {          

        selfService.Click_Data_Quality_BulkOperations();
    }
    @When ("user clicks Bulk Operations Incidents")
    public void Open_Data_Quality_BulkOperations_Incidents()
    {
         

        variables.setStart_time();
        selfService.Click_Data_Quality_BulkOperations_Incidents();
        wait.implicitWait(20);
        variables.setFinish_time();

    }
    @Then ("user is navigated toData Quality Bulk Operations Incidents")

public void Data_Quality_BulkOperations_Incidents()
    {
         

        variables.setTimeElapsed();
        variables.setSlaKpi("Incidents");
        databaseConnection.Open_Connection();

    }

    @When("user click on Manage Toposite")

    public void Open_Manage_Toposite()
    {
         

        variables.setStart_time();
        selfService.Click_Manage_TopoSite();
        wait.implicitWait(20);
        variables.setFinish_time();
    }


    @Then("user is navigated to Manage Toposite")
public void Manage_Toposite()
    {
         

        variables.setTimeElapsed();
        variables.setSlaKpi("Manage Toposite");
        databaseConnection.Open_Connection();

    }

    @When ("user Threshold Management")
    public void ThresholdManagement_btn()
    {
         

        selfService.Click_Threshold_Management();

    }
    @When ("user clicks on Threshold Management Site Availability")

    public void Open_Threshold_Management_Site_Availability()
    {
         

        variables.setStart_time();
        selfService.Click_Threshold_Management_SiteAvailability();
        wait.implicitWait(20);
        variables.setFinish_time();



    }
    @Then ("user is navigated to Threshold Management Site Availability")
    public void Threshold_Management_Site_Availability()
    {
         

        variables.setSlaKpi("Site Availability");
        variables.setTimeElapsed();
        databaseConnection.Open_Connection();
    }

    @When ("user clicks on Threshold Management Path Availability")
    public void Open_Threshold_Management_Path_Availability()
    {
         

        variables.setStart_time();
        selfService.Click_Threshold_Management_PathAvailability();
        wait.implicitWait(20);
        variables.setFinish_time();
    }
    @Then ("user is navigated to Threshold Management Path Availability")
    public void Threshold_Management_Path_Availability()
    {
         

        variables.setTimeElapsed();
        variables.setSlaKpi("Path Availability");
        databaseConnection.Open_Connection();

    }
    @When ("user clicks on Threshold Management Path Performance")
    public void Open_Threshold_Management_Path_Performance()
    {
         

        variables.setStart_time();
        selfService.Click_Threshold_Management_PathPerformance();
        wait.implicitWait(20);
        variables.setFinish_time();

    }
    @Then ("user is navigated to Threshold Management Path Performance")
public void Threshold_Management_Path_Performance()
    {
         

        variables.setSlaKpi("Path Performance");
        variables.setTimeElapsed();
        databaseConnection.Open_Connection();
    }

    @When ("user clicks on Threshold Management GTTR")
    public void Open_Threshold_Management_GTTR()
    {
         
         

        variables.setStart_time();
        selfService.Click_Threshold_Management_GTTR();
        wait.implicitWait(20);
        variables.setFinish_time();

    }
    @Then ("user is navigated to Threshold Management GTTR")
public void Threshold_Management_GTTR()
    {
         

        variables.setTimeElapsed();
        variables.setSlaKpi("GTTR");
        databaseConnection.Open_Connection();
    }

    @When ("user clicks on Threshold Management Bulk Operations")
    public void Threshold_Management_Bulk_Operations_btn()
    {
         variables.Scroll_Down();

        selfService.Click_Threshold_Management_BulkOperations();

    }
    @When("user click on Threshold Management Bulk Operations Site Availability")
    public void Open_Threshold_Management_Bulk_Operations_Site_Availability()
    {
         

        variables.setStart_time();
        selfService.Click_Threshold_Management_BulkOperations_SiteAvailability();
        wait.implicitWait(20);
        variables.setFinish_time();

    }
    @Then ("user is navigated to Threshold Management Bulk Operations Site Availability")
    public void Threshold_Management_Bulk_Operations_Site_Availability()
    {  
        variables.setTimeElapsed();
        variables.setSlaKpi("Site Availability");
        databaseConnection.Open_Connection();

    }

    @When ("user click on Threshold Management Bulk Operations Path Availability")
    public void Open_Threshold_Management_Bulk_Operations_Path_Availability()
    {variables.Scroll_Down();
        variables.setStart_time();
        selfService.Click_Threshold_Management_BulkOperations_PathAvailability();
        wait.implicitWait(20);
        variables.setFinish_time();



    }
    @Then ("user is navigated to Threshold Management Bulk Operations Path Availability")
    public void Threshold_Management_Bulk_Operations_Path_Availability()
    {
         

        variables.setTimeElapsed();
        variables.setSlaKpi("Path Availability");
        databaseConnection.Open_Connection();

    }

    @When("user click on Threshold Management Bulk Operations Path Performance")

  public void Open_Threshold_Management_Bulk_Operations_Path_Performance()
    {variables.Scroll_Down();
        variables.setStart_time();
        selfService.Click_Threshold_Management_BulkOperations_PathPerformance();
        wait.implicitWait(20);
        variables.setFinish_time();
    }
    @Then ("user is navigated to Threshold Management Bulk Operations Path Performance")
    public void Threshold_Management_Bulk_Operations_Path_Performance()
    {         

        variables.setTimeElapsed();
        variables.setSlaKpi("Path Performance");
        databaseConnection.Open_Connection();

    }

    @When("user click on Threshold Management Bulk Operations GTTR")

    public void Open_Threshold_Management_Bulk_Operations_GTTR()
    {variables.Scroll_Down();
        variables.setStart_time();
        selfService.Click_Threshold_Management_BulkOperations_GTTR();
        wait.implicitWait(20);
        variables.setFinish_time();
    }
    @Then("user is navigated to Threshold Management Bulk Operations GTTR")
    public void Threshold_Management_Bulk_Operations_GTTR()
    {
         
         

        variables.setTimeElapsed();
        variables.setSlaKpi("GTTR");
        databaseConnection.Open_Connection();

    }
    @When("user click on Threshold Management Bulk Operations DTTR")
    public void Open_Threshold_Management_Bulk_Operations_DTTR()
    {
         
        variables.setStart_time();
        selfService.Click_Threshold_Management_BulkOperations_DTTR();
        wait.implicitWait(20);
        variables.setFinish_time();
    }

    @Then("user is navigated to Threshold Management Bulk Operations DTTR")

    public void Threshold_Management_Bulk_Operations_DTTR()
    {
         

        variables.setTimeElapsed();
        variables.setSlaKpi("DTTR");
        databaseConnection.Open_Connection();

    }
    @When("user click on Executive Report")

    public void Open_Executive_Report()
    {variables.Scroll_Down();
        variables.setStart_time();
        selfService.Click_Executive_Report();
        wait.implicitWait(20);
        variables.setFinish_time();
    }
    @Then ("user is navigated to Executive Report")

    public void Executive_Report()
    {
         

        variables.setTimeElapsed();
        variables.setSlaKpi("Executive Report");

        databaseConnection.Open_Connection();
    }

    @When ("user click on B2G Microsoft")
    public void Open_B2G_Microsoft()
    {variables.Scroll_Down();
        variables.setStart_time();
        selfService.Click_B2G_Microsoft();
        wait.implicitWait(20);
        variables.setFinish_time();
    }


    @Then ("user is navigated to B2G Microsoft")
    public void B2G_Microsoft()
    {
         

        variables.setTimeElapsed();
        variables.setSlaKpi("B2G Microsoft");

        databaseConnection.Open_Connection();
    }

    @When ("user click on RAAS")

    public void Open_RAAS()
    {variables.Scroll_Down();
        variables.setStart_time();
        selfService.Click_RAAS();
        wait.implicitWait(20);
        variables.setFinish_time();
    }
    @Then ("user is navigated to RAAS")

    public void RAAS()
    {         

        variables.setTimeElapsed();
        variables.setSlaKpi("RAAS");

        databaseConnection.Open_Connection();
    }
}
