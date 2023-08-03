package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.testng.Assert;

public class D05_hoverCategoriesStepDef {
    P03_homepage homepage = new P03_homepage();

    @When("user should hover on one category")
    public void userShouldHoverOnOneCategory() { homepage.Select_Computer(); }

    @And("user need to select a sub category")
    public void userNeedToSelectASubCategory() { homepage.Select_Notebooks().click(); }

    @Then("opening sub-category page")
    public void openingSubCategoryPage() {
        Assert.assertTrue(homepage.Current_URL().contains("notebooks"));
    }
}
