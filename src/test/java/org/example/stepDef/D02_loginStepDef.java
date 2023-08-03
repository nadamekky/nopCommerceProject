package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_login login = new P02_login();
    SoftAssert softAssert = new SoftAssert();

    @Given("user go to login page")
    public void UserGoToLoginPage() {
        login.LoginLink().click();
    }

    @When("user login with valid {string} and {string}")
    public void userLoginWithAnd(String email, String password) {
        login.Email().sendKeys(email);
        login.Password().sendKeys(password);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.LoginButton().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
         softAssert.assertTrue(login.CurrentURL().contains("https://demo.nopcommerce.com/"));
         softAssert.assertTrue(login.MyAccount().isDisplayed());
    }

    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String email, String password) {
        login.Email().sendKeys(email);
        login.Password().sendKeys(password);
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        softAssert.assertTrue(login.ErrorMessage().getText().contains("Login was unsuccessful."));
        softAssert.assertTrue(Color.fromString("rgba(228, 67, 75, 1)").asHex().equals("#e4434b"));
        softAssert.assertAll();
    }
}
