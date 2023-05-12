package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import baseconfig.DriverManager;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InspiracionPage {

    private WebDriver driver;

    /**
     * revisar constructor de clase - No permite utilizar anotaciones FindBy, además no permite utilizar atributo driver especificado en clase Page
     **/
    public InspiracionPage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(this.driver, this);
    }
    public void seleccionExpertos(){
        WebElement botonArticulos = driver.findElement(By.xpath("//*[@id=\"articulos\"]/span"));
        botonArticulos.click();
    }
    public void seleccionArticuloAnalista(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".eael-post-elements-readmore-btn[href='https://www.tsoftglobal.com/no-es-un-pajaro-no-es-un-avion-es-un-super-analista-qa/']")));
        WebElement botonArticuloSuperAnalista = driver.findElement(By.cssSelector(".eael-post-elements-readmore-btn[href='https://www.tsoftglobal.com/no-es-un-pajaro-no-es-un-avion-es-un-super-analista-qa/']"));
        botonArticuloSuperAnalista.click();
    }

}
