import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase {
@Test
    void test1(){
        System.out.println("I am inside Test1");
    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumMavenNew\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/");

}
}
