package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Cucumber_Hooks_Page {

    public Cucumber_Hooks_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[placeholder")
    public WebElement aramaKutusu;
    @FindBy(xpath = "//h1[normalize-space()='iran yapıştırıcısı']")
    public WebElement sonucText;
    @FindBy(css = "div[title='Kapat")
    public WebElement reklam;
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cookies;
}
