package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import support.Utils;

public class MessagePage extends Utils {

    WebDriver driver;

    public By subject_field = By.id("id_contact");
    public By message_field = By.id("message");
    public By upload_field = By.id("fileUpload");
    public By email_field = By.id("email");

    public By submit_button = By.id("submitMessage");

    public MessagePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarMessage(){
        driver.get("https://automationexercise.com/login");
        waitElementBePresent(message_field, 20);
    }

    public void selecionaAssunto(String assunto){
        Select select_assunto = new Select(driver.findElement(subject_field));
        select_assunto.selectByVisibleText(assunto);
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
