package org.example.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D06_homeSlidersStepDef {

    P03_homepage homepage = new P03_homepage();
    SoftAssert softAssert = new SoftAssert();


    @When("user click on the first slider")
    public void userClickOnTheFirstSlider() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        homepage.GalaxySlider().click();
    }
    @Then("user should be directed to Nokia page")
    public void userShouldBeDirectedToNokiaPage() {
        softAssert.assertTrue(homepage.Current_URL().contains("nokia-lumia-1020"));
        //softAssert.assertEquals("https://demo.nopcommerce.com/" , " https://demo.nopcommerce.com/nokia-lumia-1020");
    }

    @When("user click on the second slider")
    public void userClickOnTheSecondSlider() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homepage.iPhoneSlider().click();
    }

    @Then("user should be directed to iPhone page")
    public void userShouldBeDirectedToIPhonePage() {
        softAssert.assertTrue(homepage.Current_URL().contains("nopcommerce.com/iphone-6"));
    }

}
