/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.issue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Edmundo
 */
public class BaseIssuesPage {
    protected WebDriver driver;
    
    public BaseIssuesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}