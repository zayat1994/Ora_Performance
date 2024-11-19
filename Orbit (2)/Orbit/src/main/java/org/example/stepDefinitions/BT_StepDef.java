package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Utils.ORA_MAIN_VARIABLES;
import org.example.Utils.Wait;
import org.example.database.DatabaseConnection;
import org.example.pages.BT;

import java.util.Date;

public class BT_StepDef {

    ORA_MAIN_VARIABLES variables=new ORA_MAIN_VARIABLES();
    Wait wait=new Wait();
    DatabaseConnection databaseConnection=new DatabaseConnection();
    BT bt =new BT();


    @Given("user clicks on Analytics")

public void Analytics()
{
bt.Analytics_page_factory();

bt.Click_Analytics();
variables.setReport_type("Analytics");

}
    @When ("user clicks on Communication and Collaboration")

    public void Communication_Collaboration()
{
    variables.setStart_time();
    bt.Click_Communication_Collaboration();




}
    @When("user clicks on BT")
    public void openBT()
    {
        bt.Click_BT();
//        variables.Swich_Iframe();
  variables.Swich_Iframe(bt.iframe1, bt.iframe2);
//        variables.Swichframe_js();
    }
    @When("user clicks on Global Traffic")

public void Open_GlobalTraffic()
{
    bt.Click_GlobalTraffic();
    variables.setFinish_time();

}

    @Then("user is navigated to Global Traffic")

public void GlobalTraffic()
{
    variables.setTimeElapsed();
    variables.setSlaKpi("BT Global Traffic");
    databaseConnection.Open_Connection();


}


}
