/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author Mussi
 */
public class CadastroPage extends BasePage{

    public CadastroPage(WebDriver driver) {
        super(driver);
        driver.get("http://demo.redmine.org/account/register");
    }    
}
