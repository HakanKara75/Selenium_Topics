package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class Disable_Ads_StepDef {

    @Given("close Ads")
    public void close_ads() {
        ChromeOptions opt=new ChromeOptions();
        //asagiya extensions'in yolu verilecek
        opt.addExtensions(new File("./Extensions/Adblock.crx"));

        WebDriver driver=new ChromeDriver(opt);
        driver.get("http://www.google.com");
    }
}
