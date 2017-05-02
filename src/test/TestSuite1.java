package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


/**
 * Created by mkrzyzy on 2017-04-30.
 */
public class TestSuite1 {

    private String baseUrl="https://www.volkswagen-car-net.com/portal/pl_PL/web/guest/login";

    private WebDriver driver=new ChromeDriver();

    @Before

    public void initializeBrowserAndTests(){
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

    }


    @Test

    public void Test1(){

        Assert.assertTrue("If browser opened with URL",new WebDriverWait(driver, 10).until(ExpectedConditions.urlMatches("https://www.volkswagen-car-net.com/portal/pl_PL/web/guest/login")) != null);

        Assert.assertTrue("The Login field should be available.",
                (new WebDriverWait(driver, 5)).until( ExpectedConditions.presenceOfElementLocated(By.id("_17_WAR_cored5portlet_login"))) != null);

        Assert.assertTrue("The Password field should be available.",
                (new WebDriverWait(driver, 5)).until( ExpectedConditions.presenceOfElementLocated(By.id("_17_WAR_cored5portlet_password"))) != null);

        driver.findElement(By.id("_17_WAR_cored5portlet_login")).sendKeys("testuservwtest@mailinator.com");
        driver.findElement(By.id("_17_WAR_cored5portlet_password")).sendKeys("Vwtest2017!");

        Assert.assertTrue("Login button should be available",new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.className("cn-primary-button"))) != null);

        driver.findElement(By.className("cn-primary-button")).click();

        Assert.assertTrue("The cookie bar should be available.",
                (new WebDriverWait(driver, 5)).until( ExpectedConditions.presenceOfElementLocated(By.cssSelector(".cn-cookie"))) != null);

        Assert.assertTrue("The guide should appear.",
                (new WebDriverWait(driver, 5)).until( ExpectedConditions.presenceOfElementLocated(By.cssSelector(".fade-in > div:nth-child(1)"))) != null);

        Assert.assertTrue("Button 'Skip guide' is present.",
                (new WebDriverWait(driver, 5)).until( ExpectedConditions.presenceOfElementLocated(By.className("cn-secondary-button")))!= null);

        Assert.assertTrue("Button 'Start guide' is present.",
                (new WebDriverWait(driver, 5)).until( ExpectedConditions.presenceOfElementLocated(By.className("cn-primary-button")))!= null);

        Assert.assertTrue("Button 'Right arrow' is present.",
                (new WebDriverWait(driver, 5)).until( ExpectedConditions.presenceOfElementLocated(By.className("vw-icon-arrow-right")))!= null);

        Assert.assertEquals("Text matches 'Witamy w Car-Net'", driver.findElement(By.xpath("//*[@id=\"cn\"]/body/cn-tutorial-power-layer/div/div/div/div[4]/cn-power-layer-body/div/div[2]/div[1]/div[1]/h3")).getText().toString(), "Witamy w Car-Net");

        //System.out.println(driver.findElement(By.xpath("//*[@id=\"cn\"]/body/cn-tutorial-power-layer/div/div/div/div[4]/cn-power-layer-body/div/div[2]/div[1]/div[1]/span")).getText().toString());

        Assert.assertEquals("Text matches 'Dziękujemy za wybranie'", driver.findElement(By.xpath("//*[@id=\"cn\"]/body/cn-tutorial-power-layer/div/div/div/div[4]/cn-power-layer-body/div/div[2]/div[1]/div[1]/span")).getText().toString(), "Dziękujemy za wybranie Car-Net.\nUruchom samouczek już teraz i poznaj Car-Net.");

        WebElement el = driver.findElement(By.xpath("//*[@id=\"cn\"]/body/cn-tutorial-power-layer/div/div/div/div[4]/cn-power-layer-body/div/div[2]/div[1]/div[4]/button[2]"));

        Actions ac = new Actions(driver);
        ac.moveToElement(el);
        ac.perform();
        try{
            Thread.sleep(2000);
        }
        catch (Exception ex){};

        ac.click(el);
        ac.build().perform();

        try{
            Thread.sleep(4000);
        }
        catch (Exception ex){};

        driver.findElement(By.className("vw-icon-arrow-left")).click();

        try{
            Thread.sleep(2000);
        }
        catch (Exception ex){};

        driver.findElement(By.className("vw-icon-arrow-right")).click();

        Assert.assertEquals("Text matches 'Twój volkswagen...'",driver.findElement(By.xpath("//*[@id=\"cn\"]/body/cn-tutorial-power-layer/div/div/div/div[4]/cn-power-layer-body/div/div[2]/div[2]/div[1]/h3")).getText().toString(),"Twój Volkswagen");

        Assert.assertEquals("Text matches 'Po zalogowaniu...'",driver.findElement(By.xpath("//*[@id=\"cn\"]/body/cn-tutorial-power-layer/div/div/div/div[4]/cn-power-layer-body/div/div[2]/div[2]/div[1]/span")).getText().toString(),"Po zalogowaniu się w portalu Car-Net zobaczysz swój pojazd oraz wszystkie ważne informacje na temat przebiegu, zasięgu oraz najbliższych terminów wizyt w serwisie.");

        Assert.assertEquals("Text matches 'Aby pojazd...'",driver.findElement(By.xpath("//*[@id=\"cn\"]/body/cn-tutorial-power-layer/div/div/div/div[4]/cn-power-layer-body/div/div[2]/div[2]/span")).getText().toString(),"Aby pojazd mógł wysyłać na portal aktualne dane, musi mieć aktywne połączenie z Internetem.");

        try{
            Thread.sleep(2000);
        }
        catch (Exception ex){};

        driver.findElement(By.className("vw-icon-arrow-left")).click();

        try{
            Thread.sleep(2000);
        }
        catch (Exception ex){};

        el = driver.findElement(By.xpath("//*[@id=\"cn\"]/body/cn-tutorial-power-layer/div/div/div/div[4]/cn-power-layer-body/div/div[2]/div[1]/div[4]/button[1]"));

        ac.moveToElement(el);
        ac.perform();
        try{
            Thread.sleep(2000);
        }
        catch (Exception ex){};

        ac.click(el);
        ac.build().perform();
        //driver.findElement(By.cssSelector("body > cn-tutorial-power-layer > div > div > a > span")).click();
        driver.findElement(By.xpath("//*[@id=\"11_WAR_cored5portlet\"]/div/div/div/cn-cookie-agreement/div/div/div/a/span")).click();


    }

}
