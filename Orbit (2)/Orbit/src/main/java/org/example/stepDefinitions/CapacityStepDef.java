package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Utils.ORA_MAIN_VARIABLES;
import org.example.Utils.Wait;
import org.example.database.DatabaseConnection;
import org.example.pages.Capacity;

public class CapacityStepDef {
    Capacity capacity=new Capacity();
    ORA_MAIN_VARIABLES variables=new ORA_MAIN_VARIABLES();
    DatabaseConnection databaseConnection= new DatabaseConnection();
    Wait wait = new Wait();

    @Given("user clicks on Capacity")
    public void Click_Capacity()
    {
        capacity.Capacity_page_factory();
   variables.setMenuName("Capacity");
    capacity.Click_Capacity();
    }
@When("user clicks on Total Volume")
public void Open_Total_Volume()
{
    variables.setStart_time();
    capacity.Click_Total_Volume();
    wait.implicitWait(20);
    variables.setFinish_time();
}
@Then("user is navigated to Total Volume Capacity report")

public void Total_Volume()
{
    variables.setTimeElapsed();
    variables.setSlaKpi("Total Volume");
}
@When("user clicks on BW Usage")
    public void Open_BW_Usage()
    {
        variables.setStart_time();
        capacity.Click_BW_usage();
        wait.implicitWait(20);
        variables.setFinish_time();

    }
    @Then("user is navigated to BW Usage Capacity report")

    public void BW_Usage()
    {
        variables.setTimeElapsed();
        variables.setSlaKpi("BW Usage");
        databaseConnection.Open_Connection();
    }
@When("user clicks on Recurring Top 5 Sites")
    public void Open_Recruting()
    {
        variables.setStart_time();
        capacity.Click_Recurring();
        wait.implicitWait(20);
        variables.setFinish_time();


    }
@Then("user is navigated to Recurring Top 5 Sites Capacity report")
    public void Recruting()
    {
        variables.setTimeElapsed();
        variables.setSlaKpi("Recurring Top 5 Sites");
        wait.implicitWait(20);
        databaseConnection.Open_Connection();

    }

}
