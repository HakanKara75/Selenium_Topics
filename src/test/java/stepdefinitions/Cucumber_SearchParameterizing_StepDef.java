package stepdefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import pages.Cucumber_SearchParameterizing_Page;
import utilities.*;


import static org.junit.Assert.assertTrue;

public class Cucumber_SearchParameterizing_StepDef {

    Cucumber_SearchParameterizing_Page page= new Cucumber_SearchParameterizing_Page();
    Faker faker= new Faker();
    String product="";

    @Given("arama kutusuna vazo yazilir")
    public void arama_kutusuna_vazo_yazilir() {
        ReusableMethods.visibleWait(ReusableMethods.webelementJavaScript("document.querySelector(\"#ccp---nb > div.cc-nb-main-container > div.cc-nb-buttons-container > button.cc-nb-reject\")"), 5);
        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#ccp---nb > div.cc-nb-main-container > div.cc-nb-buttons-container > button.cc-nb-reject\")");
        ReusableMethods.visibleWait(ReusableMethods.webelementJavaScript("document.querySelector(\"#wis-lightbox-244800 > img\")"), 5);
        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#wis-lightbox-244800 > img\")");
        ReusableMethods.visibleWait(page.miniReklam, 2);
        page.miniReklam.click();
        try{
    page.searchBox.sendKeys("Vazo", Keys.ENTER);
}catch (Exception e){}

    }

    @Given("ingilizce menu secilir")
    public void ingilizce_menu_secilir() {
//        ReusableMethods.wait(3);
//        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#ccp---nb > div.cc-nb-main-container > div.cc-nb-buttons-container > button.cc-nb-reject\")");
//       ReusableMethods.wait(3);
//        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#wis-lightbox-244800 > img\")");
//        ReusableMethods.wait(3);
           // page.reklam.click();
          //  page.coocies.click();
       //page.miniReklam.click();

       ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"body > div.pz-body-w.index-wrapper > div.header-wrapper > div.header-band-top > div > div > div > form:nth-child(3) > button\")");
        //page.english.click();

    }
    @Given("Arama kutusuna {string} yazilir")
    public void arama_kutusuna_yazilir(String string) {
         product= faker.commerce().productName();
        if(string.contains("<urun>")){
            try {
                page.searchBox.sendKeys(product, Keys.ENTER);

            }catch (Exception e){

            }
        }

    }
    @Then("sonuclarada {string} oldugu dogrulanir")
    public void sonuclarada_oldugu_dogrulanir(String string) {

        assertTrue(page.sonuc.getText().contains(product));
        assertTrue(page.login.get(0).getText().contains("Vazo"));
        Driver.closeDriver();

    }


}
