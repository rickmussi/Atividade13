/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Edmundo
 */
public class SetSearchPage extends BaseSearchPage {

    @FindBy(id = "q")
    WebElement filtro;

    @FindBy(id = "search-input")
    WebElement filtro_input;

    @FindBy(id = "issues")
    WebElement issues;

    @FindBy(id = "news")
    WebElement news;

    @FindBy(id = "documents")
    WebElement documento;

    @FindBy(id = "changesets")
    WebElement alteracoes;

    @FindBy(id = "wiki_pages")
    WebElement wikiPag;

    @FindBy(id = "messages")
    WebElement mensagem;

    @FindBy(id = "projects")
    WebElement projetos;

    public SetSearchPage(WebDriver driver) {
        super(driver);
    }

    public SetSearchPage setBusca(String filtroADD) {
        filtro.sendKeys(filtroADD);
        return this;
    }

    public SetSearchPage buscar() {
        filtro.submit();
        return this;
    }

//    public String verficarFiltroAvancado() {
//        String valorFiltro = filtro_input.getText();
//        System.out.println(">>>>>>>>>" + valorFiltro);
//        return valorFiltro;
//    }
    public SetSearchPage clickIssue() {
        issues.click();
        return this;
    }

    public SetSearchPage clickNews() {
        news.click();
        return this;
    }

    public SetSearchPage clickDocumento() {
        documento.click();
        return this;
    }

    public SetSearchPage clickAlteracoes() {
        alteracoes.click();
        return this;
    }

    public SetSearchPage clickPaginaWiki() {
        wikiPag.click();
        return this;
    }

    public SetSearchPage clickMesagem() {
        mensagem.click();
        return this;
    }

    public SetSearchPage clickProjetos() {
        projetos.click();
        return this;
    }

    public boolean veficarFiltroAll() {
        if (issues.isSelected()
                && news.isSelected()
                && documento.isSelected()
                && alteracoes.isSelected()
                && wikiPag.isSelected()
                && mensagem.isSelected()
                && projetos.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean veficarApenasfiltroProjeto() {
        if (
                !issues.isSelected()
                && !news.isSelected()
                && !documento.isSelected()
                && !alteracoes.isSelected()
                && !wikiPag.isSelected()
                && !mensagem.isSelected()
                &&projetos.isSelected()) {
            return true;
        } else {
            return false;
        }
    }
}
