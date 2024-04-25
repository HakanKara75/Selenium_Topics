package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Hidden_Dropdown_Page {
    public Hidden_Dropdown_Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "(//input[@class='search-input'])[1]")
    public WebElement gratisSearchBox;

    @FindBy(xpath = "(//div[@id='results']//div)")
    public List<WebElement> gratisSearchedProduct;
    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[1]")
    public WebElement demoqaSelect;
    @FindBy(xpath = "//div[text()='NCR']")
    public WebElement ncr;

    @FindBy(xpath = "(//div[@id='results'])[1]")
    public WebElement results;
    @FindBy(xpath = "(//ul[@aria-label='ürün sonuçları'])[1]")
    public WebElement productList;
    @FindBy(xpath = "//div[contains(@style,'border: 1px solid')]")
    public WebElement advertisement;
}
