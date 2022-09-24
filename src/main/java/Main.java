import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.swing.*;
import java.time.Duration;


//Napisati program koji na sajtu:
//http://automationpractice.com
//dodaje najmanje 3 proizvoda u cart, nastavlja do cart-a, izbacuje jedan proizvod, a drugom povecava kolicinu za 1.

public class Main {

    //Napisati program koji na sajtu:
    //http://automationpractice.com
    //dodaje najmanje 3 proizvoda u cart, nastavlja do cart-a,
    // izbacuje jedan proizvod, a drugom povecava kolicinu za 1.

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Destop PC\\IdeaProjects\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor scroll = (JavascriptExecutor) driver;


        driver.get("http://automationpractice.com/index.php");
        scroll.executeScript("window.scrollBy(0,500)");



        WebElement proizvod1 = driver.findElement(By.xpath("//*[@id='homefeatured']/li[1]/div/div[2]"));
        proizvod1.click();
        Actions hover1 = new Actions(driver);
        hover1.moveToElement(proizvod1);
        WebElement add1 = driver.findElement(By.xpath("//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]"));
        add1.click();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/span"))).click();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




        WebElement proizvod2 = driver.findElement(By.xpath("//*[@id='homefeatured']/li[2]/div/div[2]"));
        proizvod2.click();
        Actions hover2 = new Actions(driver);
        hover2.moveToElement(proizvod2);
        WebElement add2 = driver.findElement(By.xpath("//*[@id='homefeatured']/li[2]/div/div[2]/div[2]/a[1]"));
        add2.click();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/span"))).click();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        WebElement proizvod3 = driver.findElement(By.xpath("//*[@id='homefeatured']/li[3]/div/div[2]"));
        proizvod3.click();
        Actions hover3 = new Actions(driver);
        hover3.moveToElement(proizvod3);
        WebElement add3 = driver.findElement(By.xpath("//*[@id='homefeatured']/li[3]/div/div[2]/div[2]/a[1]"));
        add3.click();
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a"))).click();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




        WebElement skiniProizvod = driver.findElement(By.xpath("//*[@id=\"cart_quantity_down_2_7_0_0\"]"));
        skiniProizvod.click();

        WebElement dodajProizvod = driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_3_13_0_0\"]"));
        dodajProizvod.click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();





    }
}
