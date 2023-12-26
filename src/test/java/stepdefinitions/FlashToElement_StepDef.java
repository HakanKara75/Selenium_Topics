package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.tr.Ve;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.FlashToElement_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import static org.junit.Assert.assertTrue;


public class FlashToElement_StepDef {

    FlashToElement_Page page=new FlashToElement_Page();

    @Given("kullanici Amazon sayfasinda")
    public void kullanici_amazon_sayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
        page.aramaKutusu.sendKeys("Nutella");
        Actions act = new Actions(Driver.getDriver());
        WebElement elementLocator = Driver.getDriver().findElement(By.id("nav-search-submit-button"));
        ReusableMethods.flash(elementLocator, Driver.getDriver());
        elementLocator.click();


    }

    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {

    assertTrue(page.sonucYazisi.getText().contains("Nutella"));


}


    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

        Driver.closeDriver();
    }
    @Ve("Amazon'un Secimi yazan urunu tiklar")
    public void amazonUnSecimiYazanUrunuTiklar() {
        page.amazonunSecimi.click();
        ReusableMethods.bekle(3);
    }

}
