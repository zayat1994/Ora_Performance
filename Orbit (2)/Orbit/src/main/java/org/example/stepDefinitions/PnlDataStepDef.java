//package org.example.stepDefinitions;
//
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.testng.Assert;
//
//public class PnlDataStepDef {
//
//    PnlData pnlData;
//
//    @Then("the user should be navigated to the PNL Data page titled {string}")
//    public void theUserShouldBeNavigatedToThePNLDataPageTitled(String pageTitle) {
//        pnlData = new PnlData();
//        Assert.assertEquals(pnlData.getPageTitle(), pageTitle);
//    }
//
//    @When("user clicks on project name field")
//    public void userClicksOnProjectNameField() {
//        pnlData.clickOnProjectNameField();
//    }
//
//    @When("user enters project name {string}")
//    public void userEntersProjectName(String projectName) {
//        pnlData.enterProjectName(projectName);
//    }
//
//    @When("user clicks on project manager name field")
//    public void userClicksOnProjectManagerNameField() {
//        pnlData.clickOnProjectManagerNameField();
//    }
//
//    @When("user enters project manager name {string}")
//    public void userEntersProjectManagerName(String projectManagerName) {
//        pnlData.enterProjectManagerName(projectManagerName);
//    }
//
//    @When("user clicks on customer ICO field")
//    public void userClicksOnCustomerICOField() {
//        pnlData.clickOnCustomerICOField();
//    }
//
//    @When("user enters customer ICO {string}")
//    public void userEntersCustomerIC(String customerICO) throws Exception {
//        pnlData.enterCustomerICO(customerICO);
//    }
//
//    @Then("user should see the customer loading icon")
//    public void userShouldSeeTheCustomerLoadingIcon() {
//        Assert.assertTrue(pnlData.isCustomerLoadingIconVisible(), "Customer loading icon is not visible");
//    }
//
//    @Then("user should wait until the customer loading icon disappear")
//    public void userShouldWaitUntilTheCustomerLoadingIconDisappear() {
//        Assert.assertFalse(pnlData.customerIconNotVisible(), "Customer loading icon is still visible");
//    }
//
//    @When("user clicks on the first customer returned in the dropdown list")
//    public void userClicksOnTheFirstCustomerReturnedInTheDropdownList() {
//        pnlData.firstCustomerSelection();
//    }
//
//
//    @Then("user checks that the customer name for the entered customer ICO {string} is correct")
//    public void userChecksThatTheCustomerNameForTheEnteredCustomerICOIsCorrect(String customerICO) {
//        //pnlData.validateReturnedCustomerName(customerICO);
//        System.out.println("batatessssssssssssssssssss");
//        System.out.println(pnlData.getCustomerName());
//
//    }
//}
