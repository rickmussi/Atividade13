/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Luciano Rovanni <luciano at luciano.rovanni>
 */
public class AddTarefaPage extends BasePage {

    @FindBy(id = "issue_tracker_id")
    WebElement tarefaTipo;

    @FindBy(id = "issue_subject")
    WebElement tarefaTitulo;

    @FindBy(id = "issue_description")
    WebElement tarefaDescricao;

    @FindBy(name = "issue_status_id")
    WebElement tarefaSituacao;

    @FindBy(name = "issue_priority_id")
    WebElement tarefaPrioridade;

    @FindBy(name = "commit")
    WebElement tarefaBtnCriar;

    public AddTarefaPage(WebDriver driver) {
        super(driver);
    }

    public AddTarefaPage setTarefaTipo(String pTarefaTipo) {
        tarefaTipo.findElement(By.id(pTarefaTipo));
        return this;
    }

    public AddTarefaPage setTarefaTitulo(String pTarefaTitulo) {
        tarefaTitulo.clear();
        tarefaTitulo.sendKeys(pTarefaTitulo);
        return this;
    }
    public AddTarefaPage setTarefaDescricao(String pTtarefaDescricao) {
        tarefaDescricao.clear();
        tarefaDescricao.sendKeys(pTtarefaDescricao);
        return this;
    }    

    public ListLoginPage clickBtnCriar() {
        tarefaBtnCriar.click();
        return new ListLoginPage(driver);
    }
}
