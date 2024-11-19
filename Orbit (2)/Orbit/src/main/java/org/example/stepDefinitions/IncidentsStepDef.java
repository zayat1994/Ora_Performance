package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Utils.ORA_MAIN_VARIABLES;
import org.example.Utils.Wait;
import org.example.database.DatabaseConnection;
import org.example.pages.Incidents;

public class IncidentsStepDef {
    Incidents incidents=new Incidents();
    ORA_MAIN_VARIABLES variables=new ORA_MAIN_VARIABLES();
    DatabaseConnection databaseConnection=new DatabaseConnection();
    Wait wait=new Wait();
    @Given("user clicks on Incidents")
    public void Click_Incidents()
    {
        incidents.Incidents_page_factory();
        variables.setMenuName("Incidents");
        incidents.Click_Incidents();

    }
    @When("user clicks on GTTR")
    public void Open_GTTR()
    {
        variables.setStart_time();
        incidents.Click_GTTR();
        wait.implicitWait(10);
        variables.setFinish_time();

    }
    @Then("user is navigated to GTTR report")
    public void GTTR()
    {
        variables.setSlaKpi("GTTR");
        variables.setTimeElapsed();
        databaseConnection.Open_Connection();

    }
    @When("user clicks on DTTR")
    public void Open_DTTR()
    {
        variables.setStart_time();
        incidents.Click_DTTR();
        wait.implicitWait(10);
        variables.setFinish_time();
    }
@Then("user is navigated to DTTR report")
    public void DTTR()
    {
        variables.setSlaKpi("DTTR");
        variables.setTimeElapsed();
        databaseConnection.Open_Connection();

    }
    @When("user clicks on Incident Types")
    public void Open_Incident_types()
    {
        variables.setStart_time();
        incidents.Click_Incident_types();
        wait.implicitWait(10);
        variables.setFinish_time();
    }
    @Then("user is navigated toIncident Types report")
    public void Incident_types()
    {
        variables.setSlaKpi("Incident_Types");
        variables.setTimeElapsed();
        databaseConnection.Open_Connection();

    }



}
