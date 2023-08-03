package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Date;

public class P01_register {

    By ClickRegisterLink = By.cssSelector("a[class=\"ico-register\"]");
    By SelectGender = By.id("gender-female");
    By FirstNameField = By.id("FirstName");
    By LastNameField = By.id("LastName");
    By EmailField = By.id("Email");
    By PasswordField = By.id("Password");
    By ConfirmPasswordField = By.id("ConfirmPassword");
    By ClickRegisterButton = By.id("register-button");
    By SuccessMsg = By.className("result");
    By SuccessMsgColor = By.className("result");



    public WebElement RegisterLink(){ return Hooks.driver.findElement(ClickRegisterLink); }
    public WebElement GenderType(){ return Hooks.driver.findElement(SelectGender); }
    public WebElement FirstName(){ return Hooks.driver.findElement(FirstNameField); }
    public WebElement LastName(){ return Hooks.driver.findElement(LastNameField); }
    public WebElement DayOfBirth(){ return Hooks.driver.findElement(By.name("DateOfBirthDay")); }
    public WebElement MonthOfBirth(){ return Hooks.driver.findElement(By.name("DateOfBirthMonth")); }
    public WebElement YearOfBirth(){ return Hooks.driver.findElement(By.name("DateOfBirthYear")); }
    public WebElement Email(){ return Hooks.driver.findElement(EmailField); }
    public WebElement Password(){ return Hooks.driver.findElement(PasswordField); }
    public WebElement ConfirmPassword(){ return Hooks.driver.findElement(ConfirmPasswordField); }
    public WebElement RegisterButton(){ return Hooks.driver.findElement(ClickRegisterButton); }
    public WebElement SuccessMsgText(){ return Hooks.driver.findElement(SuccessMsg); }
    public WebElement SuccessMsgColor(){ return Hooks.driver.findElement(SuccessMsgColor); }

}


