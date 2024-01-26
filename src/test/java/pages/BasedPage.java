package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

public class BasedPage {
     /* Declaración de una variable estática 'driver' de tipo WebDriver
     Esta variable va a ser compartida por todas las instancias de BasePage y sus subclases */
    protected static WebDriver driver;
    /* Declaración |de una variable de instancia 'wait' de tipo WebDriverWait.
     Se inicializa inmediatamente con una instancia dew WebDriverWait utilizando el 'driver' estático
     WebDriverWait se usa para poner esperas explícitas en los elementos web */
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    
    /* Configura el WebDriver para Chrome usando WebDriverManager.
     WebDriverManager va a estar descargando y configurando automáticamente el driver del navegador */
    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();   //Inicializa la variable estática 'driver' con una instancia de ChromeDriver
    }

    public BasedPage(WebDriver driver) {
        BasedPage.driver = driver;
            }
        public static void navigateTo(String url) { //Este es el constructor de BasePage que acepta un objeto WebDriver como argumento.
            driver.get(url);
        }

        public static void closeBrowser() {
            driver.quit();
        }

        private WebElement fElementind(String locator) {
            return  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
        }

        public void clickElement(String locator) {
            fElementind(locator).click();
        }

        public void write(String locator, String keysToSend){
            fElementind(locator).clear();//limpia si hay algo escrito
            fElementind(locator).sendKeys(keysToSend);
        }

        public void dropDownSelect(String locator, String value){
            Select dropdown = new Select(fElementind(locator));

            dropdown.selectByValue(value);
        }

        public void dropDownIndex(String locator, String index){
            Select dropdown = new Select(fElementind(locator));

            dropdown.selectByValue(index);
        }
        
        public int dropDownSize(String locator, String size){
            Select dropdown = new Select(fElementind(locator));

            List<WebElement> options = dropdown.getOptions();

            return options.size();
        }
    } 

