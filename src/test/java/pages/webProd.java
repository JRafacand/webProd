package pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class webProd {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //Inicializa el driver para chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void navegamosgala() {
        //Abre la pagina de google
        driver.get("galavail.com");
        //Imprime el titulo de la pagina
        System.out.println("Titulo de la pagina: " + driver.getTitle());
        }

    @AfterMethod
    public void tearDown() {
        //Cierra el navegador
       if (driver != null){
        driver.quit();
       }
        
    }
    

}
