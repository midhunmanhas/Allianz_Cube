package Hackathon;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import io.cucumber.messages.Messages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolsQAHomePageSteps {

      WebDriver driver =null;

ToolsQAPage tool = new ToolsQAPage(driver);
Elements sample = new Elements();

    @Given("The User open the Tools QA Page successfully")
    public void HomePage(){
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumMavenNew\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/");
    }
    @When("The User click on Form Section")
    public void FormSection(){
sample.click(tool.form());

    }
    @And("The User Click on Practice Forms")
    public void PracticeForm(){
sample.click(tool.PracticeForm());
    }
}
