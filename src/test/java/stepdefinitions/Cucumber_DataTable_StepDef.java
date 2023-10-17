package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Cucumber_DataTable_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Cucumber_DataTable_StepDef {

    Cucumber_DataTable_Page page = new Cucumber_DataTable_Page();

    @Given("{string} sitesine gidilir")
    public void sitesine_gidilir(String string) {
        switch (string) {
            case "cicek sepeti":
                Driver.getDriver().get(ConfigReader.getProperty("ciceksepeti"));
                break;
            case "trendyol":
                Driver.getDriver().get(ConfigReader.getProperty("trendyol"));
                break;
            case "boyner":
                Driver.getDriver().get(ConfigReader.getProperty("boyner"));
                break;
            case "madame coco":
                Driver.getDriver().get(ConfigReader.getProperty("madameCoco"));
                break;
            case "ets tur":
                Driver.getDriver().get(ConfigReader.getProperty("etstur"));
                break;
                case "herokuapp":
                Driver.getDriver().get(ConfigReader.getProperty("herokuapp"));
                break;
            default:
                break;
        }
    }

    @When("dogum gunu linki tiklanir")
    public void dogum_gunu_linki_tiklanir() {
        page.hediye.click();
        ReusableMethods.visibleWait(page.kabulEt, 10);

        page.kabulEt.click();
        ReusableMethods.bekle(2);

        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"body > div.header__bottom.js-header-bottom.switcher-active > div.container.container--main-menu.js-navigasyon-container > div.responsive-menu.js-responsive-menu > nav > ul > li:nth-child(11) > span > a\")");

        page.izinVer.click();
    }

    @Then("dogum gunu sayfasinda oldugu dogrulanir")
    public void dogum_gunu_sayfasinda_oldugu_dogrulanir() {
        String expectedUrl = "https://www.ciceksepeti.com/dogum-gunu-hediyeleri";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    @When("renk drop down tiklanir")
    public void renk_drop_down_tiklanir() {

    }

    @Then("sirasiyla renklerin secildigi dogrulanir")
    public void sirasiyla_renklerin_secildigi_dogrulanir(DataTable dataTable) {

        page.renk.click();

        List<String> bilgiler = dataTable.asList();

        for (int i = 1; i < bilgiler.size(); i++) {
            switch (bilgiler.get(i)) {
                case "bej":
                    page.bej.click();
                    ReusableMethods.bekle(2);
                    break;
                case "beyaz":
                    page.beyaz.click();
                    ReusableMethods.bekle(2);
                    break;
                case "çok renkli":
                    page.cokRenkli.click();
                    ReusableMethods.bekle(2);
                    break;
                case "gri":
                    page.gri.click();
                    assertTrue(page.gri.isSelected());
                    ReusableMethods.bekle(2);
                    break;
                default:
                    break;
            }
            Driver.getDriver().get("https://www.ciceksepeti.com/dogum-gunu-hediyeleri");
            ReusableMethods.visibleWait(page.renk, 5);
            page.renk.click();
        }

            Driver.closeDriver();
    }

}
