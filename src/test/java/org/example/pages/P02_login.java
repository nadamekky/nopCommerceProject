package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {


    //elements
    By ClickLoginLink = By.className("ico-login");
    By EmailField = By.id("Email");
    By PasswordField = By.id("Password");
    By ClickLoginButton = By.cssSelector("button[class=\"button-1 login-button\"]");
    By UnsuccessfulLoginMsg = By.cssSelector("[class=\"message-error validation-summary-errors\"]");
    By MyAccountLink = By.className("ico-account");


    //actions
    public WebElement LoginLink(){ return Hooks.driver.findElement(ClickLoginLink); }
    public WebElement Email(){ return Hooks.driver.findElement(EmailField); }
    public WebElement Password(){ return Hooks.driver.findElement(PasswordField); }
    public WebElement LoginButton(){ return Hooks.driver.findElement(ClickLoginButton); }
    public WebElement ErrorMessage(){ return Hooks.driver.findElement(UnsuccessfulLoginMsg); }
    public String CurrentURL(){ return Hooks.driver.getCurrentUrl(); }
    public WebElement MyAccount(){ return Hooks.driver.findElement(MyAccountLink); }

    }
