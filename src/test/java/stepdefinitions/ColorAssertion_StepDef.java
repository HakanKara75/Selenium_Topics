package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.Color;
import pages.ColorAssertion_Page;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class ColorAssertion_StepDef {
    ColorAssertion_Page page= new ColorAssertion_Page();
    @Given("kullanici Trendyol sayfasina gider")
    public void kullaniciTrendyolSayfasinaGider() {
        getDriver().get(ConfigReader.getProperty("trendyol"));
    }

    @Then("cok satanlar linki yanindaki yeni ikonunun kirmizi oldugunu dogrular")
    public void cokSatanlarLinkiYanindakiYeniIkonununKirmiziOldugunuDogrular() {
        //Elementin beklenen renk degerini gir
        String expectedRgbColorCode="#dc2e2e";
        System.out.println("expectedRgbColorCode = " + expectedRgbColorCode);

        String backgroundColor= page.yeni.getCssValue("background-color");

        Color color= Color.fromString(backgroundColor);
        String actualRgbColorCode= color.asHex();
        System.out.println("actualRgbColorCode.asHex() = " + actualRgbColorCode);

        assertEquals(expectedRgbColorCode, actualRgbColorCode);

        getDriver().close();

    }
}
