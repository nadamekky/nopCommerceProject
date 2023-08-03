package org.example.stepDef;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homepage homepage = new P03_homepage();

    @When("user click on the dropdown list and select {string} currency")
    public void userClickOnTheDropdownListAndSelectCurrency(String arg0) {
        Select EuroCurrency = new Select(homepage.CurrencyDropdown());
        EuroCurrency.selectByVisibleText("Euro");
    }

    @Then("user check the currency of all products")
    public void userCheckTheCurrencyOfAllProducts() {
        for ( int i=0 ; i< homepage.ProductPrice().size(); i++){
            //String price = homepage.ProductPrice().get(i).getText();
            Assert.assertTrue(homepage.ProductPrice().get(i).getText().contains("€"));
        }
    }
}
