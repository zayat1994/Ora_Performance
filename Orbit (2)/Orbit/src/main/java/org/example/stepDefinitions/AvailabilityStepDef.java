package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Utils.ORA_MAIN_VARIABLES;
import org.example.Utils.Wait;
import org.example.base.TestBase;
import org.example.database.DatabaseConnection;
import org.example.pages.Availability;

public class AvailabilityStepDef {
    Availability availability=new Availability();
    ORA_MAIN_VARIABLES variables=new ORA_MAIN_VARIABLES();
Wait wait=new Wait();
DatabaseConnection databaseConnection=new DatabaseConnection();
@Given("user clicks on Availability SLA")
    public void Click_Availability()
    {

        availability.SiteAvailability_Page_Factory();
        System.out.println("Titile= "+TestBase.driver.getTitle());
        variables.setMenuName("Availability SLA");
        availability.Click_Availability_SLA();



    }
    @When ("user clicks on Site Availability")

    public void  Open_Site_availability()
    {
        variables.setStart_time();
        availability.Click_Site_Availability();
        wait.implicitWait(10);

        variables.setFinish_time();




    }
    @Then("user is navigated to Site Availability report")
    public void Site_Availability_page()
    {

        variables.setSlaKpi("Site Availability");
        variables.setTimeElapsed();
        databaseConnection.Open_Connection();
    }

    @When("user clicks on Site Availability Trend")
    public void Open_SiteAvailabilityTrend()
    {
        variables.setStart_time();
        availability.Click_Site_Availability_Trend();
        wait.implicitWait(20);
        variables.setFinish_time();

    }
    @Then("user is navigated to Site Availability Trend report")
    public void SiteAvailabilityTrend()
    {
        variables.setTimeElapsed();
        variables.setSlaKpi("Site Availability Trend");
        databaseConnection.Open_Connection();

    }
    @When("user clicks on Path Availability")
    public void OpenPathAvailability()
    {
        variables.setStart_time();
        availability.Click_Path_Availability();
        wait.implicitWait(20);
        variables.setFinish_time();


    }
    @Then("user is navigated to Path Availability report")
    public void PathAvailability()
    {
        variables.setTimeElapsed();
        variables.setSlaKpi("Path Availability");
        databaseConnection.Open_Connection();
    }

}
