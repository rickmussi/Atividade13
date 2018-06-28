/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.login;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author Luciano Rovanni <luciano at luciano.rovanni>
 */
public class TarefasPage extends BasePage{
    public TarefasPage(WebDriver driver) {
        super(driver);
        driver.get("https://demo.redmine.org/projects/redmine/issues/new");
    }      
}
