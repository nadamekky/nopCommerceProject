package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Date;

public class P01_register {

    //elements
    By register_link = By.cssSelector("a[class=\"ico-register\"]");
    By gender = By.id("gender-female");
    By FirstNameField = By.id("FirstName");
    By LastNameField = By.id("LastName");
    By DayOfBirth = By.name("DateOfBirthDay");
    By MonthOfBirth = By.name("DateOfBirthMonth");
    By YearOfBirth = By.name("DateOfBirthYear");
    By EmailField = By.id("Email");
    By PasswordField = By.id("Password");
    By ConfirmPasswordField = By.id("ConfirmPassword");
    By RegisterButton = By.id("register-button");
    By SuccessMsg = By.className("result");
    By SuccessMsgColor = By.className("result");




    //actions
    public WebElement click_register_link(){ return Hooks.driver.findElement(register_link); }
    public WebElement select_female_gender(){ return Hooks.driver.findElement(gender); }
    public WebElement EnterFirstName(){ return Hooks.driver.findElement(FirstNameField); }
    public WebElement EnterLastName(){ return Hooks.driver.findElement(LastNameField); }
    public WebElement SelectDayOfBirth(){
        Select select_day = new Select(Hooks.driver.findElement(DayOfBirth));
        select_day.selectByValue("10");

        return Hooks.driver.findElement(DayOfBirth);
    }
    public WebElement SelectMonthOfBirth(){
        Select select_Month = new Select(Hooks.driver.findElement(MonthOfBirth));
        select_Month.selectByValue("6");

        return Hooks.driver.findElement(MonthOfBirth);
    }
    public WebElement SelectYearOfBirth(){
        Select select_year = new Select(Hooks.driver.findElement(YearOfBirth));
        select_year.selectByValue("2000");

        return Hooks.driver.findElement(YearOfBirth);
    }
    public WebElement EnterEmail(){ return Hooks.driver.findElement(EmailField); }
    public WebElement EnterPassword(){ return Hooks.driver.findElement(PasswordField); }
    public WebElement EnterPassword2(){ return Hooks.driver.findElement(ConfirmPasswordField); }
    public WebElement ClickRegisterButton(){ return Hooks.driver.findElement(RegisterButton); }
    public WebElement SuccessMsgText(){ return Hooks.driver.findElement(SuccessMsg); }
    public WebElement SuccessMsgColor(){ return Hooks.driver.findElement(SuccessMsgColor); }

}


