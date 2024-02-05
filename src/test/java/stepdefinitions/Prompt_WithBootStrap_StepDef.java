package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.ColorAssertion_Page;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static utilities.Driver.getDriver;
import static utilities.ReusableMethods.assertPromptMessageWithBootStrap;


public class Prompt_WithBootStrap_StepDef {
    ColorAssertion_Page page = new ColorAssertion_Page();

    @And("email kutusuna yanlis mail girilir")
    public void emailKutusunaYanlisMailGirilir() {
        page.email.sendKeys("hakan@.com");
    }

    @And("devam et butonuna basilir")
    public void devamEtButonunaBasilir() {
        page.devamEt.click();
    }

    @Then("girilemediği prompt ile dogrulanir")
    public void girilemediğiPromptIleDogrulanir() {
        String expectedData = "\".\", \".com\" adı içinde yanlış bir konumda kullanılmış.";
        String actualData = assertPromptMessageWithBootStrap(page.email);
        System.out.println("str = " + actualData);
        //assertTrue( actualData.contains(expectedData));
        assertEquals(expectedData, actualData);

    }

    @And("click basic auth link")
    public void clickBasicAuthLink() {

    }

    @And("assert the prompt")
    public void assertThePrompt() {
        getDriver().manage().deleteAllCookies();
        String url="https://the-internet.herokuapp.com";
        String popupUrl="the-internet.herokuapp.com/basic_auth";
        getDriver().get(url);
        page.basicAuth.click();
        ReusableMethods.bekle(2);
        String username="admin";
        String password="admin";
        String expectedMessage="Congratulations! You must have the proper credentials.";
        getDriver().get("https://"+username+":"+password+"@"+popupUrl);
        String actualMessage = getDriver().findElement(By.cssSelector("div.example p")).getText().trim();

        assertEquals(expectedMessage, actualMessage);


    }


    @Given("kullanici herokuapp sitesine gider")
    public void kullaniciHerokuappSitesineGider() {
    }


}
