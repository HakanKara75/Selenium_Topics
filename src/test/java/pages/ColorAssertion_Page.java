package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ColorAssertion_Page {
    public ColorAssertion_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='new-badge'])[1]")
    public WebElement yeni;
    @FindBy(xpath = "//button[contains(@type, 'submit')]")
    public WebElement devamEt;
    @FindBy(xpath = "//input[contains(@class, 'string email')]")
    public WebElement email;
    @FindBy(xpath = "//a[contains(@href, '/basic')]")
    public WebElement basicAuth;
}
