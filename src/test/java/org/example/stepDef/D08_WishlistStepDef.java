package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class D08_WishlistStepDef {

    P03_homepage homepage = new P03_homepage();
    SoftAssert softAssert = new SoftAssert();
    @When("user clicks on wishlist button")
    public void userClicksOnWishlistButton() throws InterruptedException { homepage.WishlistButton().click(); }

    @Then("user check that success message appeared")
    public void userCheckThatSuccessMessageAppeared() {
        softAssert.assertTrue(homepage.WishlistSuccessMsg().getText().contains("The product has been added"));
        String ActualColor = homepage.WishlistSuccessMsg().getCssValue("background-color");
        String ColorHex = Color.fromString(ActualColor).asHex();
        softAssert.assertTrue(ColorHex.equals("#4bb07a"));
    }

    @And("user clicks on wishlist tab")
    public void userClicksOnWishlistTab() throws InterruptedException {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(3000);
        homepage.WishlistTab().click();
    }

    @Then("user check the quantity")
    public void userCheckTheQuantity() {
        int quantity = Integer.parseInt(homepage.qty().getAttribute("value"));
        softAssert.assertTrue(quantity>0);
        softAssert.assertAll();

    }


}
