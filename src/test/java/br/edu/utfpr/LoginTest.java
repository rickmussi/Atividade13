package br.edu.utfpr;

import br.edu.utfpr.login.AddLoginPage;
import br.edu.utfpr.login.AddTarefaPage;
import br.edu.utfpr.login.FindLoginPage;
import br.edu.utfpr.login.FindTarefaPage;
import br.edu.utfpr.login.LoginPage;
import br.edu.utfpr.login.TarefasPage;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author andreendo
 */
public class LoginTest {

    private WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.gecko.driver", "C:\\wcd\\TestadorAPP\\geckodriver.exe");
        ///System.setProperty("webdriver.gecko.driver", "C:\\Java\\geckodriver.exe");//PC Luciano
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
    public void testLoginSucesso() {
        br.edu.utfpr.login.LoginPage loginPage = new LoginPage(driver);
        AddLoginPage login = new AddLoginPage(driver);
        FindLoginPage tes = new FindLoginPage(driver);
        login.setUserLogin("rovanni");
        login.setUserPassword("1234");
        login.clickBtnEntrar();

        assertTrue(tes.loginSucesso());
    }

    @Test
    public void testLoginErro() {
        br.edu.utfpr.login.LoginPage loginPage = new LoginPage(driver);
        AddLoginPage login = new AddLoginPage(driver);
        FindLoginPage tes = new FindLoginPage(driver);
        login.setUserLogin("rovanni");
        login.setUserPassword("");
        login.clickBtnEntrar();

        assertFalse(tes.loginSucesso());
    }

    @Test
    public void testCadastrarTarefa() {
        testLoginSucesso();
        br.edu.utfpr.login.TarefasPage tarefaPage = new TarefasPage(driver);
        AddTarefaPage tarefa = new AddTarefaPage(driver);
        FindTarefaPage tes = new FindTarefaPage(driver);
        tarefa.setTarefaTitulo("Teste");
        tarefa.setTarefaDescricao("Testando testes");
        tarefa.clickBtnCriar();
        assertTrue(tes.cadastroSucesso());
    }
}
