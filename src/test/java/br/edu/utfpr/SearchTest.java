package br.edu.utfpr;

import br.edu.utfpr.search.FindSearchPage;
import br.edu.utfpr.search.SearchPage;
import br.edu.utfpr.search.SetSearchPage;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author andreendo
 */
public class SearchTest {

    private WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.gecko.driver", "C:\\wcd\\TestadorAPP\\geckodriver.exe");
    }

    @Before
    public void before() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void after() {
        //driver.close();
    }

    @Test
    public void testFiltroALL() {
        SearchPage searchPage = new SearchPage(driver);

        FindSearchPage findSearchPage = new FindSearchPage(driver);
        SetSearchPage setSearchPage = findSearchPage.goToSetSearch();
        SetSearchPage filtro = setSearchPage.setBusca("VERIFICAR TODOS OS FILTROS MARCADOS");
                        filtro.buscar();

        assertTrue(filtro.veficarFiltroAll());

    }
    
     @Test
    public void testSeApenasFiltroProjetos() {
        SearchPage searchPage = new SearchPage(driver);

        FindSearchPage findSearchPage = new FindSearchPage(driver);
        SetSearchPage setSearchPage = findSearchPage.goToSetSearch();
        SetSearchPage filtro = setSearchPage.setBusca("APENAS FILTRO DE PROJETO");
                        filtro.buscar();
                        filtro.clickIssue();
                        filtro.clickNews();
                        filtro.clickDocumento();
                        filtro.clickAlteracoes();
                        filtro.clickPaginaWiki();
                        filtro.clickMesagem();

        assertTrue(filtro.veficarApenasfiltroProjeto());

    }
}
