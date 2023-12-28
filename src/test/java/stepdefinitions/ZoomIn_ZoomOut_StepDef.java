package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import pages.ZoomIn_ZoomOut_Page;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static utilities.Driver.getDriver;

public class ZoomIn_ZoomOut_StepDef {
    ZoomIn_ZoomOut_Page page= new ZoomIn_ZoomOut_Page();

    @Given("go to automod")
    public void go_to_automod() {
        getDriver().get(ConfigReader.getProperty("automod"));
        ReusableMethods.bekle(2);
    }
    @Given("zoom in the map")
    public void zoom_in_the_map() {
        ((JavascriptExecutor) getDriver()).executeScript("document.body.style.zoom='150%'");
        ReusableMethods.bekle(2);
    }
    @Given("zoom out the map")
    public void zoom_out_the_map() {
        ((JavascriptExecutor) getDriver()).executeScript("document.body.style.zoom='50%'");
        ReusableMethods.bekle(2);
    }
    @Given("click on zoom in the map")
    public void click_on_zoom_in_the_map() {
        page.zoomIn.click();
        page.zoomIn.click();
        page.zoomIn.click();
        ReusableMethods.bekle(2);
    }
    @Given("click on zoom out the map")
    public void click_on_zoom_out_the_map() {
        page.zoomOut.click();
        page.zoomOut.click();
        page.zoomOut.click();
        ReusableMethods.bekle(2);
    }


}
