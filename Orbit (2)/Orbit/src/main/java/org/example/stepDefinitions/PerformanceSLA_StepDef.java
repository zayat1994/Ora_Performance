package org.example.stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Utils.ORA_MAIN_VARIABLES;
import org.example.Utils.Wait;
import org.example.database.DatabaseConnection;
import org.example.pages.PerformanceSLA;

public class PerformanceSLA_StepDef {
    ORA_MAIN_VARIABLES variables =new ORA_MAIN_VARIABLES();
    Wait wait=new Wait();
    DatabaseConnection databaseConnection=new DatabaseConnection();
    PerformanceSLA performanceSLA=new PerformanceSLA();

    @Given("user clicks on Performance SLA")
    public void Click_Performance()
    {
        performanceSLA.PerformanceSLA_page_factory();

        performanceSLA.Click_PerformanceSLA();
         variables.setMenuName("Performance SLA");


    }
    @When("user clicks on RTD")
    public void Open_RTD()
    {
        variables.setStart_time();
        performanceSLA.Click_RTD();
        wait.implicitWait(20);
        variables.setFinish_time();

    }
    @Then("user is navigated to RTD report")
    public void RTD()
    {
        variables.setSlaKpi("RTD");
        variables.setTimeElapsed();
        databaseConnection.Open_Connection();

    }
    @When("user clicks on PLR")
    public void Open_PLR()
    {
        variables.setStart_time();
        performanceSLA.Click_PLR();
        wait.implicitWait(20);
        variables.setFinish_time();

    }
@Then("user is navigated to PLR report")
    public void PLR()
    {
        variables.setTimeElapsed();
        variables.setSlaKpi("PLR");
        databaseConnection.Open_Connection();
    }
@When("user clicks on JITTER")
    public void Open_JITTER()
    {
     variables.setStart_time();
     performanceSLA.Click_Jitter();
     wait.implicitWait(20);
     variables.setFinish_time();
    }
@Then("user is navigated to JITTER report")
    public void JITTER()
    {
        variables.setTimeElapsed();
        variables.setSlaKpi("JITTER");
        databaseConnection.Open_Connection();


    }



}
