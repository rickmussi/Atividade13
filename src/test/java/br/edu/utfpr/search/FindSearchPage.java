/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Edmundo
 */
public class FindSearchPage extends SearchPage {

    @FindBy(xpath = "/html/head/title")
    WebElement title;

    WebDriver dr;

    public FindSearchPage(WebDriver driver) {
        super(driver);
        dr = driver;
    }

    public WebElement getTitle() {
        return title;
    }

    public SetSearchPage goToSetSearch() {
        //btnEnviar.click();

        return new SetSearchPage(driver);
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
