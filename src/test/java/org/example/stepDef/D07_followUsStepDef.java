package org.example.stepDef;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class D07_followUsStepDef {

    P03_homepage homepage = new P03_homepage();

    @When("user click on facebook icon")
    public void userClickOnFacebookIcon() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        homepage.FacebookIcon().click();
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String url) throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(homepage.Current_URL().contains(url));
        Hooks.driver.switchTo().window(tabs.get(0));
        Hooks.driver.close();
    }

    @When("user click on twitter icon")
    public void userClickOnTwitterIcon() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        homepage.TwitterIcon().click();
    }

    @When("user click on rss icon")
    public void userClickOnRssIcon() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        homepage.rssIcon().click();
    }

    @When("user click on youtube icon")
    public void userClickOnYoutubeIcon() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        homepage.YoutubeIcon().click();
    }




}
