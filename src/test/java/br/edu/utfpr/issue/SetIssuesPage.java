/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.issue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Edmundo
 */
public class SetIssuesPage extends BaseIssuesPage {

    @FindBy(id = "add_filter_select")
    WebElement filter;

    @FindBy(xpath = "/html/body/div/div/div[1]/div[3]/div[2]/form[1]/div[2]/div/fieldset[1]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[1]/label")
    WebElement filtro_02;
    @FindBy(xpath = "//*[@id=\"cb_tracker_id\"]")
    WebElement checkFiltro_02;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[3]/div[2]/form[1]/div[2]/div/fieldset[1]/div/table/tbody/tr/td[1]/table/tbody/tr[3]/td[1]/label")
    WebElement filtro_03;
    @FindBy(xpath = "//*[@id=\"cb_priority_id\"]")
    WebElement checkFiltro_03;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[3]/div[2]/form[1]/div[2]/div/fieldset[1]/div/table/tbody/tr/td[1]/table/tbody/tr[4]/td[1]/label")
    WebElement filtro_04;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[3]/div[2]/form[1]/div[2]/div/fieldset[1]/div/table/tbody/tr/td[1]/table/tbody/tr[5]/td[1]/label")
    WebElement filtro_05;
  
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[3]/div[2]/form[1]/div[2]/div/fieldset[1]/div/table/tbody/tr/td[1]/table/tbody/tr[6]/td[1]/label")
    WebElement filtro_06;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[3]/div[2]/form[1]/div[2]/div/fieldset[1]/div/table/tbody/tr/td[1]/table/tbody/tr[7]/td[1]/label")
    WebElement filtro_07;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[3]/div[2]/form[1]/div[2]/div/fieldset[1]/div/table/tbody/tr/td[1]/table/tbody/tr[8]/td[1]/label")
    WebElement filtro_08;

    @FindBy(xpath = "/html/body/div/div/div[1]/div[3]/div[2]/form[1]/div[2]/p/a[2]")
    WebElement clearFiltro;

    public SetIssuesPage(WebDriver driver) {
        super(driver);
    }

    public SetIssuesPage AddFiltro(String filtroADD) {
        Select filtro = new Select(filter);
        filtro.selectByVisibleText(filtroADD);

        return this;
    }

    public SetIssuesPage setClear() {
        clearFiltro.click();

        return this;
    }

    public String vefificarFiltro_02() {
        return filtro_02.getText();
    }

    public Boolean vefificarFiltro_02_isCheck() {
        return checkFiltro_02.isSelected();
    }

    public String vefificarFiltro_03() {
        return filtro_03.getText();
    }

    public Boolean vefificarFiltro_03_isCheck() {
        return checkFiltro_03.isSelected();
    }

    public SetIssuesPage filtro_03_demarcarCheck() {
        checkFiltro_03.click();

        return this;
    }

    public String vefificarFiltro_04() {
        return filtro_04.getText();
    }

    public String vefificarFiltro_05() {
        return filtro_05.getText();
    }

    public String vefificarFiltro_06() {
        return filtro_06.getText();
    }

    public String vefificarFiltro_07() {
        return filtro_07.getText();
    }

    public String vefificarFiltro_08() {
        return filtro_08.getText();
    }
}
