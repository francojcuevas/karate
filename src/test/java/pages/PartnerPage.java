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

import java.beans.Visibility;
import java.time.Duration;

public class PartnerPage {
    private WebDriver driver;

    /**
     * revisar constructor de clase - No permite utilizar anotaciones FindBy, además no permite utilizar atributo driver especificado en clase Page
     **/
    public PartnerPage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    public void clickAtlassian(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/section[4]/div/div/div[2]/div/div/div/div/div/a/div")));
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/section[4]/div/div/div[2]/div/div/div/div/div/a/div")).click();
    }
    public void dirigirseASitioAttlasianReconocimiento(){driver.get("https://www.tsoftglobal.com/partners/partners-atlassian/premio-atlassian-partner-of-the-year-2019/");}
}
