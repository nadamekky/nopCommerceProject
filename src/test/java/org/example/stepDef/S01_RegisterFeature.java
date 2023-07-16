package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.testng.asserts.SoftAssert;


public class S01_RegisterFeature {

     P01_register register = new P01_register();
     SoftAssert softAssert = new SoftAssert();
    @Given("user go to register page")
    public void User_go_to_register_page() { register.click_register_link().click(); }

    @When("user select gender type")
    public void userSelectGenderType() { register.select_female_gender().click(); }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String FirstName, String LastName) {
        register.EnterFirstName().sendKeys(FirstName);
        register.EnterLastName().sendKeys(LastName);
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        register.SelectDayOfBirth().click();
        register.SelectMonthOfBirth().click();
        register.SelectYearOfBirth().click();
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String Email) { register.EnterEmail().sendKeys(Email); }


    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String password, String ConfirmPassword) {
        register.EnterPassword().sendKeys(password);
        register.EnterPassword2().sendKeys(ConfirmPassword);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton () {
        register.ClickRegisterButton().click();
            }
     @Then("success message is displayed")
     public void successMessageIsDisplayed() {
        softAssert.assertTrue(register.SuccessMsgText().getText().contains("Your registration completed"));
        softAssert.assertEquals(register.SuccessMsgColor().getCssValue("color"),"rgba(76, 177, 124, 1)");
        softAssert.assertAll();
    }

}
