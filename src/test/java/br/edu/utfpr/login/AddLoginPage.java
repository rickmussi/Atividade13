/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Luciano Rovanni <luciano at luciano.rovanni>
 */
public class AddLoginPage extends BasePage {

    @FindBy(id = "username")
    WebElement userName;

    @FindBy(id = "password")
    WebElement userPassword;

    @FindBy(name = "login")
    WebElement btnEntrar;

    public AddLoginPage(WebDriver driver) {
        super(driver);
    }

    public AddLoginPage setUserLogin(String pUserLogin) {
        userName.clear();
        userName.sendKeys(pUserLogin);

        return this;
    }

    public AddLoginPage setUserPassword(String pUserPassword) {
        userPassword.clear();
        userPassword.sendKeys(pUserPassword);

        return this;
    }



    public ListLoginPage clickBtnEntrar() {
        btnEntrar.click();
        return new ListLoginPage(driver);
    }
}
