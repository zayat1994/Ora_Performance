package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Utils.ORA_MAIN_VARIABLES;
import org.example.pages.Asset_management;

public class Asset_managementStepDef {

  ORA_MAIN_VARIABLES variables=new ORA_MAIN_VARIABLES();
  Asset_management assetManagement=new Asset_management();


@When("user clicks on generic process")
  public void click_Generic_process()
  {

      assetManagement.Click_Generic_Process();

  }
@When("user click on Asset Management")
  public void open_assetManagement()
  {
      assetManagement.Click_Asset_Management();

  }
@Then("user is navigated to overview")
  public void Overview_Tab()
  {

      variables.Swichframe_js();
      assetManagement.Click_Overview();

  }


}
