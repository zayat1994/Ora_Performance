package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.base.TestBase;
import org.example.pages.Login;

public class LoginStepDef{

    Login login;


    @Given("user is navigated to Mytools login page")
    public void userIsNavigatedToMytoolsLoginPage() {
        login = new Login();
        login.MytoolsLoginPage();
    }

    @When("user clicks on username field")
    public void userClicksOnUsernameField() {

        login.clickOnUsernameField();
    }

    @When("user enters username")
    public void userEntersUsername() {

        login.enterUsername(
                TestBase.properties.getProperty("username")
        );
    }

    @When("user clicks on password field")
    public void userClicksOnPasswordField() {

        login.clickOnPasswordField();
    }

    @When("user enters password")
    public void userEntersPassword() {
        login.enterPassword(TestBase.properties.getProperty("password"));
    }




    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
        login.clickOnLoginButton();
    }


    @When("User clicks on ORA")
    public void Open_ORA() throws InterruptedException {
        Thread.sleep(5000);
        login.clickOn_ORA();




    }
    @Then("New tab is opened")
    public void swich_ora() throws InterruptedException {
        login.Swich_tab();

        Thread.sleep(3000);
    }


    }

