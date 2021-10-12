package Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Class for Webelements
 */
public class ToolsQAPage {
    WebDriver driver;
    By Form = By.name("//h5[contains(text(),'Forms')]");
    By PracticeForm = By.name("//span[contains(text(),'Practice Form')]");

    public ToolsQAPage(WebDriver driver){
        this.driver=driver;
    }
    public void form(){
        driver.findElement(Form);
    }
    public void PracticeForm(){
        driver.findElement(PracticeForm);
    }
}
