package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class D01_RegisterStepDef {

     P01_register register = new P01_register();
     SoftAssert softAssert = new SoftAssert();
    @Given("user go to register page")
    public void userGoToRegisterPage() { register.RegisterLink().click(); }

    @When("user select gender type")
    public void userSelectGenderType() { register.GenderType().click(); }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String firstName, String lastName) {
        register.FirstName().sendKeys(firstName);
        register.LastName().sendKeys(lastName);
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        Select dayOfBirth = new Select(register.DayOfBirth());
        Select monthOfBirth = new Select(register.MonthOfBirth());
        Select yearOfMonth = new Select(register.YearOfBirth());
        dayOfBirth.selectByValue("10");
        monthOfBirth.selectByValue("6");
        yearOfMonth.selectByValue("2000");
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String Email) { register.Email().sendKeys(Email); }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String password, String confirmPassword) {
        register.Password().sendKeys(password);
        register.ConfirmPassword().sendKeys(confirmPassword);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton () {
        register.RegisterButton().click();
            }

     @Then("success message is displayed")
     public void successMessageIsDisplayed() {
        softAssert.assertTrue(register.SuccessMsgText().getText().contains("Your registration completed"));
        softAssert.assertEquals(register.SuccessMsgColor().getCssValue("color"),"rgba(76, 177, 124, 1)");
        softAssert.assertAll();
    }

}
