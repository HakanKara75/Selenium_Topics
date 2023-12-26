package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ShadowRoot_Page {

    public ShadowRoot_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "ins-editable-button-1580496494")
    public WebElement kampanya;
    @FindBy(css = "div[class='popup-close']")
    public WebElement arasPopup;
    @FindBy(xpath = "//efilli-layout-default[@class='efilli-layout-default']")
    public WebElement shadow;
    @FindBy(xpath = "//div[@class='banner__accept-button']")
    public WebElement hepsiniKabulEt;
    @FindBy(css = "svg[xmlns='http://www.w3.org/2000/svg']")
    public List<WebElement> arasPopupList;
}
