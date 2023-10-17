package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LocateWithNormalizeSpace_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class LocateWithNormalizeSpace_StepDef {

    LocateWithNormalizeSpace_Page search=new LocateWithNormalizeSpace_Page();
    String string1="";

    @Given("madame coco sitesine gidilir")
    public void madame_coco_sitesine_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("cocoUrl"));
        search.cerez.click();
        search.reklam.click();
    }


    @Then("sonuclarda vazo oldugu dogrulanir")
    public void sonuclarda_vazo_oldugu_dogrulanir() {
       List<WebElement> products= Driver.getDriver().findElements(By.cssSelector("a[class='product-item__name']"));
        for (int i = 0; i < products.size(); i++) {
            assertTrue(products.get(i).getText().contains("vazo"));

        }
        Driver.closeDriver();
    }

    @Given("arama kutusuna {string} yazilir")
    public void arama_kutusuna_yazilir(String string) {


    }
    @Then("sonuclarda {string} oldugu dogrulanir")
    public void sonuclarda_oldugu_dogrulanir(String string) {

        //ReusableMethods.alertDismiss();
        List<WebElement> products= Driver.getDriver().findElements(By.cssSelector("a[class='product-item__name']"));
        for (int i = 0; i < products.size(); i++) {
            assertTrue(products.get(i).getText().contains(string1));

        }
        Driver.closeDriver();
    }


}
