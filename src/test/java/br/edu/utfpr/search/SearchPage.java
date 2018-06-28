/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.search;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author Edmundo
 */
public class SearchPage extends BaseSearchPage{

    public SearchPage(WebDriver driver) {
        super(driver);
        driver.get("http://demo.redmine.org");
    }    
}
