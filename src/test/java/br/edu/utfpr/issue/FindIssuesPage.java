/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.issue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Edmundo
 */
public class FindIssuesPage extends IssuesPage {

    @FindBy(xpath = "/html/head/title")
    WebElement title;

    WebDriver dr;

    public FindIssuesPage(WebDriver driver) {
        super(driver);
        dr = driver;
    }

    public WebElement getTitle() {
        return title;
    }

    public SetIssuesPage goToSetIssues() {
        //btnEnviar.click();

        return new SetIssuesPage(driver);
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
