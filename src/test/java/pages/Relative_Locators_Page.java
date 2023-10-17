package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Relative_Locators_Page {

    public Relative_Locators_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".slider-spot-universes-bar--visible > :nth-child(2)")
    public WebElement login;
    @FindBy(xpath = "//li[@class='layout-categories-category layout-categories-category--level-2']//a[@aria-label='PANTOLON, Yardımcı kategorileri aç']")
    public WebElement pantolon;
}
