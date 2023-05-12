package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import baseconfig.DriverManager;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TsoftPage {

    private WebDriver driver;

    /**
     * revisar constructor de clase - No permite utilizar anotaciones FindBy, además no permite utilizar atributo driver especificado en clase Page
     **/
    public TsoftPage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(this.driver, this);
    }
    public void clickEventos(){

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/section[3]/div/div/div[1]/div/div/div/div/div/a/img")).click();
    }

    public void dirigirseASitioEventos(){
        driver.get("https://www.tsoftglobal.com/eventos/");
    }
    public void dirigirseASitioWebInspiracion(){
        driver.get("https://www.tsoftglobal.com/tsoft-inspiracion/");
    }
    public void dirigirseASitioPartners(){
        driver.get("https://www.tsoftglobal.com/partners/");
    }
    public void dirigirseASitioWeb(){
        driver.get("https://www.tsoftglobal.com/");
    }
}
