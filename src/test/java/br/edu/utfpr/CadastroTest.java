package br.edu.utfpr;

import br.edu.utfpr.issue.FindIssuesPage;
import br.edu.utfpr.issue.IssuesPage;
import br.edu.utfpr.issue.SetIssuesPage;
import br.edu.utfpr.po.AddCadastroPage;
import br.edu.utfpr.po.CadastroPage;
import br.edu.utfpr.po.FindCadastroPage;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author andreendo
 */
public class CadastroTest {

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
        driver.close();
    }

    @Test
    public void testSuccessfulCadastro() {
        br.edu.utfpr.po.CadastroPage cadastroPage = new CadastroPage(driver);

        FindCadastroPage findCadastroPage = new FindCadastroPage(driver);
        AddCadastroPage addCadastroPage = findCadastroPage.goToAddCadastro();
        AddCadastroPage cad = addCadastroPage.setUserFirstName("Joao")
                .setUserLastName("Da Silva")
                .setUserPassword("1234")
                .setUserPasswordConfirma("1234")
                .setUserEmail("joao12@hotmail.com")//mudar sempre o email para conseguir realizar o cadastro
                .setUserLogin("joao12")//mudar sempre o login para conseguir realizar o cadastro
                .setUserCustom("Joao");

        addCadastroPage.clickFindButton();

        assertTrue(findCadastroPage.gravadoSucesso());
    }

    @Test
    public void testErroCadastro() {
        br.edu.utfpr.po.CadastroPage cadastroPage = new CadastroPage(driver);

        FindCadastroPage findCadastroPage = new FindCadastroPage(driver);
        AddCadastroPage addCadastroPage = findCadastroPage.goToAddCadastro();
        AddCadastroPage cad = addCadastroPage.setUserFirstName("Ricardo")
                .setUserLastName("Mussi")
                .setUserPassword("1234")
                .setUserPasswordConfirma("1234")
                .setUserEmail("rickmussi@hotmail.com")
                .setUserLogin("rickmussi")
                .setUserCustom("rickmussi");

        addCadastroPage.clickFindButton();

        assertFalse(findCadastroPage.gravadoSucesso());
    }

    @Ignore
    @Test
    public void testTituloPageCadastro() {
        br.edu.utfpr.po.CadastroPage cadastroPage = new CadastroPage(driver);
        FindCadastroPage findCadastroPage = new FindCadastroPage(driver);
        AddCadastroPage addCadastroPage = findCadastroPage.goToAddCadastro();
        assertEquals("Cadastre-se", findCadastroPage.getTitle());
    }
}