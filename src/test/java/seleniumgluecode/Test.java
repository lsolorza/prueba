package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Type;

public class Test {

    private ChromeDriver driver;

    @Given("^El usaurio se encuentra en la página de de Emerix$")
    public void el_usaurio_se_encuentra_en_la_página_de_de_Emerix() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://santander-jud.eastus.cloudapp.azure.com/CL2.Santander/Emerix.Ui/#!/app/login");
        driver.manage().window().maximize();
    }

    @When("^Ingresar Usuario Y contraseña se presiona botón Iniciar sesión$")
    public void ingresar_Usuario_Y_contraseña_se_presiona_botón_Iniciar_sesión() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("lsolorza");
        WebElement password  = driver.findElement(By.name("password"));
        password.sendKeys("Solorza.2020");
    }

    @Then("^donde se desplegará el selector de módulos$")
    public void donde_se_desplegará_el_selector_de_módulos() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement submit = driver.findElement(By.cssSelector(".btn-success"));
        submit.click();




    }
}
