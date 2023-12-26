package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import pages.ShadowRoot_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class ShadowRoot_StepDef {

    ShadowRoot_Page page=new ShadowRoot_Page();
    @Given("teknosa sayfasına gider")
    public void teknosa_sayfasına_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("teknosa"));
        page.kampanya.click();


        /*asagidaki kod ile shadow root yapisina sahip tag'in locatini searchContext objesine atiyoruz. Boylece elementin
        Shadow Dom try yapisina ulasiliyor
                    */
        SearchContext searchContext = Driver.getDriver().findElement(By.xpath("//efilli-layout-dynamic")).getShadowRoot();

        /*
        asagidaki kod click islemi yapilmak istenen elementi bulmak icin searchContext icindeki Shadow Dom
        icine bir element locate verilerek aranir ve bir webelemente atanir.
         */
        WebElement shadowElement = searchContext.findElement(By.cssSelector("div[data-name='Accept Button']"));

        shadowElement.click();
    }


    @Given("aras sayfasina gider")
    public void aras_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("aras"));

//        /*asagidaki kod ile shadow root yapisina sahip tag'in locatini searchContext objesine atiyoruz. Boylece elementin
//        Shadow Dom try yapisina ulasiliyor
//                    */
//        SearchContext searchContext = Driver.getDriver().findElement(By.xpath("//efilli-layout-default[@class='efilli-layout-default']")).getShadowRoot();
//
//        /*
//        asagidaki kod click islemi yapilmak istenen elementi bulmak icin searchContext icindeki Shadow Dom
//        icine bir element locate verilerek aranir ve bir webelemente atanir.
//         */
//        WebElement hepsiniKabulEt = searchContext.findElement(By.xpath("//div[@class='banner__accept-button']"));
//
//        hepsiniKabulEt.click();
//        page.shadow.click();
//        page.hepsiniKabulEt.click();
//        ReusableMethods.bekle(5);
        page.arasPopupList.get(15).click();


    }
}
