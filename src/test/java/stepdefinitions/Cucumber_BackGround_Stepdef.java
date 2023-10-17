package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Cucumber_Background_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


import static org.junit.Assert.assertEquals;

public class Cucumber_BackGround_Stepdef {
    Cucumber_Background_Page page=new Cucumber_Background_Page();
    String expectedUrl="";
    @Given("ets tur sitesine gidilir")
    public void etsTurSitesineGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("etstur"));
        expectedUrl = Driver.getDriver().getCurrentUrl();

    }

    @And("login butonu ustune gidilir")
    public void loginButonuUstuneGidilir() {
        ReusableMethods.moveToElementWithAction(page.login);

    }

    @When("giris butonuna basilir")
    public void girisButonunaBasilir() {
        ReusableMethods.visibleWait(page.giris, 10);
        page.giris.click();

    }

    @And("eposta girilir")
    public void epostaGirilir() {
        ReusableMethods.visibleWait(page.email, 10);
        page.email.sendKeys("hakan@gmail.com");

    }

    @And("password girilri")
    public void passwordGirilri() {
        ReusableMethods.visibleWait(page.password, 10);
        page.password.sendKeys("524353443");

    }

    @When("giris yap butonuna basilir")
    public void girisYapButonunaBasilir() {
        ReusableMethods.visibleWait(page.girisYap, 10);
        page.girisYap.click();

    }

    @Then("sayfaya gidilemedigi dogrulanir")
    public void sayfayaGidilemedigiDogrulanir() {

        String actualUrl= Driver.getDriver().getCurrentUrl();
        assertEquals("hakan",actualUrl);
        Driver.closeDriver();

    }

    @And("soyad girilir")
    public void soyadGirilir() {

        page.soyad.sendKeys("gsfdgdfg");
        ReusableMethods.visibleWait(page.soyad, 10);
    }

    @And("uye ol butonuna basilir")
    public void uyeOlButonunaBasilir() {
        page.uyeOl.click();
        ReusableMethods.visibleWait(page.uyeOl, 10);
    }

    @And("ad girilir")
    public void adGirilir() {

        page.ad.sendKeys("gdfsdfg");
    }

    @And("uyelik icin eposta girilir")
    public void uyelikIcinEpostaGirilir() {
    page.eposta.sendKeys("haklf@gmail.com");
    }

    @And("ceptelefonu girilir")
    public void ceptelefonuGirilir() {
        page.ceptel.sendKeys("436453647");

    }

    @And("uyelik icin password girilir")
    public void uyelikIcinPasswordGirilir() {
        page.sifre1.sendKeys("4545677788");
    }

    @And("password yeniden girlir")
    public void passwordYenidenGirlir() {
        page.sifre2.sendKeys("4545677788");
    }

    @And("kullanim sartlari checkbox secilir")
    public void kullanimSartlariCheckboxSecilir() {
        page.kullanim.click();
    }

    @And("kampanyalara checkbox secilir")
    public void kampanyalaraCheckboxSecilir() {
        page.firsat.click();
    }

    @When("uyelik sayfasinda uye ol butonuna basilir")
    public void uyelikSayfasindaUyeOlButonunaBasilir() {
        page.uyelikUyeOl.click();

    }


}
