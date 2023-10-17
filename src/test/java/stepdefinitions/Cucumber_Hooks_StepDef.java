package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.Cucumber_Hooks_Page;
import utilities.ReusableMethods;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Cucumber_Hooks_StepDef {

    Cucumber_Hooks_Page page=new Cucumber_Hooks_Page();
    String sonuc="";

    @And("arama kutusuna iran yapıştırıcısı yazilir")
    public void aramaKutusunaIranYapıstırıcısıYazilir() {
        ReusableMethods.visibleWait(page.reklam, 7);
        page.reklam.click();
        ReusableMethods.visibleWait(page.cookies,2);
        page.cookies.click();
        ReusableMethods.visibleWait(page.aramaKutusu,2);
        page.aramaKutusu.sendKeys("iran yapıştırıcısı", Keys.ENTER);
    }
    @Then("sonuc sayfasinda {string} oldugu dogrulanir")
    public void sonuc_sayfasinda_oldugu_dogrulanir(String string) {
        if(string.contains("iran yapıştırıcısı")){
            System.out.println("expectedTitle = " + string);
            System.out.println("actualTitle = " + page.sonucText.getText());
            assertFalse(page.sonucText.getText().contains(string));
        }else
            System.out.println("expectedTitle = " + string);
        System.out.println("actualTitle = " + page.sonucText.getText());
        assertTrue(page.sonucText.getText().contains(string));
       // assertTrue("hakan".contains("actual") );
    }
    @When("sonuc sayfasindaki arama sonuc sayisi alinir")
    public void sonuc_sayfasindaki_arama_sonuc_sayisi_alinir() {
        sonuc= page.sonucText.getText().replaceAll("\\D", "");
        System.out.println("sonuc = " + sonuc);
    }
    @Then("{int} den az urunun ekranda goruntulendigi dogrulanir")
    public void denAzUrununEkrandaGoruntulendigiDogrulanir(Integer int1) {
        int sonucSayisi= Integer.parseInt(sonuc);
       int expected=int1;
        System.out.println("expected = " + expected);
        assertTrue(sonucSayisi==int1);


    }
}
