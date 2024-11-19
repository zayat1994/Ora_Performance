package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.api.internal.Utils;
import jdk.jshell.execution.Util;
import org.example.Utils.ORA_MAIN_VARIABLES;
import org.example.Utils.Wait;
import org.example.base.TestBase;
import org.example.database.DatabaseConnection;
import org.example.pages.Customer_list;
import org.example.pages.Reporting_Dashboard;

public class Customer_StepDef

{
    DatabaseConnection databaseConnection=new DatabaseConnection();
    Customer_list customerList=new Customer_list();
    Wait wait=new Wait();
    Reporting_Dashboard reportingDashboard=new Reporting_Dashboard();
    ORA_MAIN_VARIABLES variable=new ORA_MAIN_VARIABLES();


    @Given("user is navigated to ORA")
    public void check_ora_page() throws InterruptedException {

//        customerList.Customers_page_factory();
//        variable.Menu_name="Dashboard";
//        variable.Report_type="Reporting";
//        System.out.println("sssssssss"+TestBase.driver.getTitle());
//
//        // wait.waitUntilElementIsVisible(customerList.Customer_drop_down,3);
//       wait.waitUntilElementIsVisible(reportingDashboard.Dashboard_btn,4000);


    }
    @Given("user clicks on customer list")
    public void Customer_drop_down() throws InterruptedException {
        Thread.sleep(3000);
        customerList.Customers_page_factory();


        System.out.println("sssssssss"+TestBase.driver.getTitle());
        customerList.clickOnCustomer_drop_down();
        Thread.sleep(5000);

    }
    @When("user clicks on select customer list")
    public void Select_Customer()
    {
        customerList.Select_customer();

    }
    @When("user selects the customer the goodyear")
    public void Thegoodyear() throws InterruptedException {
        wait.implicitWait(10);
        variable.setStart_time();
        customerList.Click_ThegoodYear();
        variable.setICO01(8106);

    }
    @Then("user is navigated to the selected customer")
    public void Home_page() throws InterruptedException {
        wait.implicitWait(10);
        customerList.Reporting_click();
        customerList.click_Dashboard();
        wait.implicitWait(10);

        variable.setFinish_time();
variable.setReport_type("Reporting");
variable.setMenuName("Dashboard");
variable.setSlaKpi("Dashboard");

variable.setTimeElapsed();


        databaseConnection.Open_Connection();



    }

}
