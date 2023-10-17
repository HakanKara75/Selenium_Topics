package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Cucumber_ScenarioOutline_Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Cucumber_ScenarioOutline_StepDef {
    Cucumber_ScenarioOutline_Pages page=new Cucumber_ScenarioOutline_Pages();

    @Given("boyner sitesine gidilir")
    public void boynerSitesineGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("boyner"));
    }

    @When("login ikonu ustune gidilir")
    public void loginIkonuUstuneGidilir() {
        ReusableMethods.moveToElementWithAction(page.login);


    }

    @And("uye ol linki tiklanir")
    public void uyeOlLinkiTiklanir() {
        page.uyeOl.click();

    }

    @Then("uyelik sayfasinda oldugu dogrulanir")
    public void uyelikSayfasindaOlduguDogrulanir() {
        //String expectedText= "Boyner dünyasına hoş geldin";
        assertTrue(page.sayfaTitle.isDisplayed());
       // assertTrue(page.sayfaTitle.getText().contains(expectedText));
    }


    @And("uyelik sayfasinda ad bolumune {string} girilir")
    public void uyelikSayfasindaAdBolumuneGirilir(String arg0) {

        page.ad.sendKeys(arg0);
    }

    @And("uyelik sayfasinda email bolumune{string} girilir")
    public void uyelikSayfasindaEmailBolumuneGirilir(String arg0) {
        page.email.sendKeys(arg0);
    }

    @And("uyelik sayfasinda sifre bolumune{string} girilir")
    public void uyelikSayfasindaSifreBolumuneGirilir(String arg0) {

        page.sifre.sendKeys(arg0);
    }

    @And("uyelik sayfasinda ceptelefonu bolumune{string} girilir")
    public void uyelikSayfasindaCeptelefonuBolumuneGirilir(String arg0) {
        page.ceptelefonu.sendKeys(arg0);
    }

    @And("uyelik sayfasinda uyelik metni checkboxa {string} checkbox secilir")
    public void uyelikSayfasindaUyelikMetniCheckboxaCheckboxSecilir(String arg0) {
        page.uyelikSozlesmesi.click();

    }

    @And("uyelik sayfasinda riza metni checkboxa{string} checkbox secilir")
    public void uyelikSayfasindaRizaMetniCheckboxaCheckboxSecilir(String arg0) {
        page.rizaMetni.click();
    }

    @And("uye ol butonu tiklanir")
    public void uyeOlButonuTiklanir() {
        page.uyeOlButon.click();
    }

    @Then("uye olunamadigi dogrulanir")
    public void uyeOlunamadigiDogrulanir() {
        String expectedUrl="https://www.boyner.com.tr/uyelik?type=uye-ol";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
        Driver.closeDriver();

    }


    @And("eposta kismina eposta girilir")
    public void epostaKisminaEpostaGirilir() {
        page.email.sendKeys("hakandenememail@gmail.com");

    }

    @And("sifre girilir")
    public void sifreGirilir() {
        page.sifre.sendKeys("123hakan.");
    }

    @And("giris yap butonu tiklanir")
    public void girisYapButonuTiklanir() {
        ReusableMethods.clickJSElementWithJavaScript("querySelector(\"#header-container > div.header-top_root__YsOJt > div > div > div.header-top_headerTopIcon___SR_X > div > div:nth-child(1) > div > div > a > button\")");
    }

    @Then("giris yapildigi dogrulanir")
    public void girisYapildigiDogrulanir() {
        String expectedText="HAKAN";
        String actualText=ReusableMethods.getTextWithJavaScriptXpath("//div[@class='user-cart-active_cartBox__UNYC4']/span").replace("[^HAKAN]","");
        System.out.println("actualText = " + actualText);
        assertTrue(actualText.contains(expectedText));
        Driver.closeDriver();

    }

    @And("uyelik icin giris yap butonu tiklanir")
    public void uyelikIcinGirisYapButonuTiklanir() {
        page.girisYap.click();
    }
}
