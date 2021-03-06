package task5;

// Generated by Selenium IDE

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class YuliaTest {
  private WebDriver driver;
  private WebDriverWait wait;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    wait = new WebDriverWait(driver,20);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void yuliaTest() {
    driver.get("https://itea.ua/uk/");
    driver.manage().window().setSize(new Dimension(1366, 728));
    driver.findElement(By.linkText("Дитячі курси")).click();
    String actualTitle = driver.getTitle();
    String expectedTitle = "Комп'ютерні курси для дітей в Києві, курси програмування для дітей ITEAKiDS";
    assertEquals(actualTitle, expectedTitle);
  }
}
