package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    WebDriver driver;

    @BeforeMethod
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/imtiazahmed/IdeaProjects/Dec2021Seleniumproject2/src/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

    }
    @Test
    public void test1() throws InterruptedException {
        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "title validation success");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    @Test
    public void test2(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium book");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    @Test
    public void test3(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook pro");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    @Test
    public void test4(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("skippedLink");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    @Test
    public void test5(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    @Test
    public void test6(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung tv");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    @Test
    public void test7(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony tv");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    @Test
    public void test8(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("head phones");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    @Test
    public void test9(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i pad");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    @Test
    public void test10(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("airpod");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    }

