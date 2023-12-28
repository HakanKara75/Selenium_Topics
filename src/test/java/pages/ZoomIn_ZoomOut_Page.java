package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZoomIn_ZoomOut_Page {

    public ZoomIn_ZoomOut_Page() {
            PageFactory.initElements(Driver.getDriver(),this);
        }
    @FindBy(css = "a[title='Zoom in']")
    public WebElement zoomIn;
    @FindBy(css = "a[title='Zoom out']")
    public WebElement zoomOut;
}
