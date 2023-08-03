package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {

     P03_homepage homepage = new P03_homepage();
     SoftAssert softAssert = new SoftAssert();

    @When("user enter product data {string}")
    public void userEnterProductData(String product) { homepage.Search().sendKeys(product); }

    @And("user click on search button")
    public void userClickOnSearchButton(){
        homepage.Search_Button().click();
        softAssert.assertTrue(homepage.Current_URL().contains("https://demo.nopcommerce.com/search?q="));
        softAssert.assertAll();
    }

    @Then("user should see result about the {string}")
    public void userShouldSeeResultAboutThe(String productName) {
       for (int i=0 ; i < homepage.ProductList().size(); i++) {
           softAssert.assertTrue(homepage.ProductList().get(i).getText().toLowerCase().contains(productName));
       }
    }

    @And("user clicks on product")
    public void userClicksOnProduct() {
           homepage.ProductItem().get(0).click();
    }

    @Then("user check sku of product {string}")
    public void userCheckSkuOfProduct(String sku) {
        softAssert.assertTrue(homepage.Sku().getText().contains(sku));
    }
}
