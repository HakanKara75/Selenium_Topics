package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Hidden_Dropdown_Page;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class Hidden_Dropdown_StepDef {
    Hidden_Dropdown_Page page= new Hidden_Dropdown_Page();

    String expected="Kantaron";
    @Given("gratise gidilir")
    public void gratiseGidilir() {
        getDriver().get("https://www.gratis.com/");
    }

    @And("searchboxa kantaron girilir")
    public void searchboxaKantaronGirilir() {
        page.gratisSearchBox.sendKeys(expected);

    }

    @Then("onerilen ilk urunun kantaron sampuan oldugu dogrulanir")
    public void onerilenIlkUrununKantaronSampuanOlduguDogrulanir() {
        String actual=ReusableMethods.getTextWithJavaScriptXpath("(//div[@id='results']//div)[1]");
        ReusableMethods.bekle(1);
        System.out.println("actual = " + actual);
        assertTrue(actual.contains(expected));
    }

    @Given("demoqa sitesine gidilir")
    public void demoqaSitesineGidilir() {
        getDriver().get(ConfigReader.getProperty("demoqa"));
    }

    @When("State and Cityde NCR secilir")
    public void stateAndCitydeNCRSecilir() {
        ReusableMethods.scrollToElementWithWebElement(page.advertisement);
        ReusableMethods.bekle(1);
        page.demoqaSelect.click();
        page.ncr.click();
        ReusableMethods.bekle(1);

    }

    @Then("NCR secildigi dogrulanir")
    public void ncrSecildigiDogrulanir() {
        String expected="NCR";
        String actual =page.demoqaSelect.getText();
        assertEquals(expected, actual);
    }
}
