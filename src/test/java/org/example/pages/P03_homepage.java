package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class P03_homepage {

    By DropdownList = By.id("customerCurrency");
    By HoverOnComputers = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a");
    By ClickOnNotebooks = By.cssSelector("a[href=\"/notebooks\"]");
    By SearchField = By.id("small-searchterms");
    By SearchButton = By.cssSelector("button[class=\"button-1 search-box-button\"]");
    By ClickFacebookIcon = By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]");
    By ClickTwitterIcon = By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]");
    By ClickOnRssIcon = By.cssSelector("a[href=\"/news/rss/1\"]");
    By ClickOnYoutubeIcon = By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]");
    By ClickWishlistButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]");
    By SuccessMsg = By.cssSelector("div[class=\"bar-notification success\"]");
    By ClickWishlistTab = By.className("ico-wishlist");
    By QtyField = By.className("qty-input");



    public WebElement CurrencyDropdown(){ return Hooks.driver.findElement(DropdownList); }
    public List<WebElement> ProductPrice() { return Hooks.driver.findElements(By.className("prices")); }
    public WebElement Select_Computer() {
        WebElement computers = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(computers).perform();
        return Hooks.driver.findElement(HoverOnComputers);
    }
    public WebElement Select_Notebooks(){ return Hooks.driver.findElement(ClickOnNotebooks); }
    public WebElement Search(){ return Hooks.driver.findElement(SearchField); }
    public WebElement Search_Button(){ return Hooks.driver.findElement(SearchButton); }
    public List<WebElement> ProductList(){ return Hooks.driver.findElements(By.className("product-title"));}
    public List<WebElement> ProductItem(){ return Hooks.driver.findElements(By.className("product-item")); }
    public WebElement Sku(){ return Hooks.driver.findElement(By.className("overview")); }
    public String Current_URL() { return Hooks.driver.getCurrentUrl();}
    public WebElement GalaxySlider(){ return Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[2]"));}
    public WebElement iPhoneSlider(){ return Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[1]"));}
    public WebElement FacebookIcon(){ return Hooks.driver.findElement(ClickFacebookIcon); }
    public WebElement TwitterIcon(){ return Hooks.driver.findElement(ClickTwitterIcon); }
    public WebElement rssIcon(){ return Hooks.driver.findElement(ClickOnRssIcon); }
    public WebElement YoutubeIcon(){ return Hooks.driver.findElement(ClickOnYoutubeIcon); }
    public WebElement WishlistButton(){ return Hooks.driver.findElement(ClickWishlistButton);}
    public WebElement WishlistSuccessMsg(){ return Hooks.driver.findElement(SuccessMsg); }
    public WebElement WishlistTab(){ return Hooks.driver.findElement(ClickWishlistTab); }
    public WebElement qty(){ return Hooks.driver.findElement(QtyField); }
}