package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import support.Utils;

public class MessagePage extends Utils {

    WebDriver driver;

    public By name_field = By.cssSelector("#contact-us-form > div:nth-child(2) > input");
    public By message_field = By.id("message");
    public By upload_field =  By.cssSelector("#contact-us-form > div:nth-child(6) > input");
    public By subject_field =  By.cssSelector("#contact-us-form > div:nth-child(4) > input");

    public By email_field = By.cssSelector("#contact-us-form > div:nth-child(3) > input");

    public By submit_button = By.cssSelector("#contact-us-form > div:nth-child(7) > input");

    public MessagePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarMessage(){
        driver.get("https://automationexercise.com/contact_us");
        waitElementBePresent(message_field, 20);
    }
    public void preencherNome(String nome){
        driver.findElement(subject_field).sendKeys(nome);
    }
    public void preencherAssunto(String assunto){
        driver.findElement(name_field).sendKeys(assunto);
    }

    public void preencheEmail(String email) {
        driver.findElement(email_field).sendKeys(email);
    }

    public void preencheMensagem(String message) {
        driver.findElement(message_field).sendKeys(message);
    }

    public void uploadFile(String caminhoArquivo) {
        driver.findElement(upload_field).sendKeys(caminhoArquivo);
    }

    public void click_submit() {
        driver.findElement(submit_button).click();
    }

}
