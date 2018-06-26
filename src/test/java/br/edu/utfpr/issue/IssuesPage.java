/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.issue;

import br.edu.utfpr.po.BasePage;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Edmundo
 */
public class IssuesPage extends BaseIssuesPage{

    public IssuesPage(WebDriver driver) {
        super(driver);
        driver.get("http://www.redmine.org/projects/redmine/issues");
    }    
}
