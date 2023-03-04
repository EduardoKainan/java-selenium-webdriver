package pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {

    WebDriver driver;

    private By name = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=text]:nth-child(2)");

    private By create_email_field = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)");
    private By create_email_button = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarTelaLogin(){
        driver.get("https://automationexercise.com/login");
        waitElementBePresent(create_email_field, 20);
    }
    public void preencherName(){
        driver.findElement(name).sendKeys(getRandomEmail());
    }

    public void preencherCampoEmail(){
        driver.findElement(create_email_field).sendKeys(getRandomEmail());
    }

    public void clicarCriarContaBotao(){
        driver.findElement(create_email_button).click();
    }

}
