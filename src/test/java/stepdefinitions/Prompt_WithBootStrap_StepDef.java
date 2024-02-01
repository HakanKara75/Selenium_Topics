package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.ColorAssertion_Page;

import static org.junit.Assert.assertEquals;
import static utilities.Driver.getDriver;
import static utilities.ReusableMethods.assertPromptMessageWithBootStrap;

public class Prompt_WithBootStrap_StepDef {
    ColorAssertion_Page page=new ColorAssertion_Page();
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
        String expectedData="'.', '.com' üzerinde yanlış bir konumda kullanılmış.";
        String actualData= assertPromptMessageWithBootStrap(page.email);
        System.out.println("str = " + actualData);
        assertEquals(expectedData, actualData);

    }

}
