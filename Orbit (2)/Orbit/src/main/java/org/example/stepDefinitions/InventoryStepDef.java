package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Utils.ORA_MAIN_VARIABLES;
import org.example.Utils.Wait;
import org.example.database.DatabaseConnection;
import org.example.pages.Inventory;

public class InventoryStepDef {
    Inventory inventory=new Inventory();
    ORA_MAIN_VARIABLES variables=new ORA_MAIN_VARIABLES();
    Wait wait=new Wait();
    DatabaseConnection databaseConnection = new DatabaseConnection();
    @Given("user clicks on Inventory")
    public void Open_Inventory()
    {
        inventory.Inventory_page_factory();
        variables.setStart_time();

        inventory.Click_Inventory();
        wait.implicitWait(20);
        variables.setFinish_time();
        variables.setMenuName("Inventory");
    }
    @Then("user is navigate to Inventory report")
    public void Inventory()
    {
        variables.setSlaKpi("Inventory");
        variables.setTimeElapsed();
        databaseConnection.Open_Connection();
    }
}
