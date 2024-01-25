package pages;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import java.time.Duration;
public class GalaTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        //Inicializa el driver para chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private void sleepForSeconds(int seconds) { //otra forma de agregar el sleep
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } 
    
    @Test
    public void navegamosgala() {
        //Abre la pagina de galavail
        driver.get("https://develop.galavail.com/galavail-web/login.xhtml");
        //Espera hasta que el elemento este visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']")));
        wait.until(ExpectedConditions.urlToBe("https://develop.galavail.com/galavail-web/login.xhtml"));
        sleepForSeconds(5);
    }
        

    @AfterMethod
    public void tearDown() {
        //Cierra el navegador
       if (driver != null){
        driver.quit();
       }
        
    }
    

}
