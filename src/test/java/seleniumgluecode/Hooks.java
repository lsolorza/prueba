package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {

    private static WebDriver driver;
    private static int numberOfCase = 0;
    private DriverManager driverManager;

    @Before
    public void setUp(){
        numberOfCase ++;
        System.out.println("Se esta ejecutando el escenario nro:" + numberOfCase);
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver =driverManager.getDriver();
        driver.get("http://santander-jud.eastus.cloudapp.azure.com/CL2.Santander/Emerix.Ui/#!/app/login");
        driver.manage().window().maximize();


    }

    @After
    public void tearDown(){
        System.out.println("El escenario nro:" + numberOfCase+ " Se ejecuto correctamente");
        driverManager.quitDriver();

    }
     public static WebDriver getDriver(){

      return driver;
    }
}
