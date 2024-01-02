package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.ShadowRoot_Page;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static org.junit.Assert.*;
import static utilities.Driver.getDriver;


public class ShadowRoot_StepDef {

    ShadowRoot_Page page=new ShadowRoot_Page();
    @Given("teknosa sayfasına gider")
    public void teknosa_sayfasına_gider() {
        getDriver().get(ConfigReader.getProperty("teknosa"));
        page.kampanya.click();


        /*asagidaki kod ile shadow root yapisina sahip tag'in locatini searchContext objesine atiyoruz. Boylece elementin
        Shadow Dom try yapisina ulasiliyor
                    */
        SearchContext searchContext = getDriver().findElement(By.xpath("//efilli-layout-dynamic")).getShadowRoot();

        /*
        asagidaki kod click islemi yapilmak istenen elementi bulmak icin searchContext icindeki Shadow Dom
        icine bir element locate verilerek aranir ve bir webelemente atanir.
         */
        WebElement shadowElement = searchContext.findElement(By.cssSelector("div[data-name='Accept Button']"));

        shadowElement.click();
    }


    @Given("aras sayfasina gider")
    public void aras_sayfasina_gider() {
        getDriver().get(ConfigReader.getProperty("aras"));


//        WebElement acceptButton = (WebElement) ((JavascriptExecutor) getDriver())
//                .executeScript("return arguments[0].shadowRoot.querySelector('.banner__accept-button')", page.shadow);
//       ReusableMethods.clickByJavaScript(acceptButton);

        page.arasPopupList.click();

        ReusableMethods.bekle(5);



    }

    @Given("automationexercise sayfasina gider")
    public void automationexerciseSayfasinaGider() {
        //2. Navigate to url 'http://automationexercise.com'
        getDriver().get("http://automationexercise.com");

//        3. Verify that home page is visible successfully
        WebElement homePage = getDriver().findElement(By.xpath("//html"));
        assertTrue(homePage.isDisplayed());

        //try-catch alttan açılıp kapanan reklamı kapatmak icin shadow root (closed)
        try {
            getDriver().findElement(By.xpath("//div[@class='grippy-host']")).click();
            getDriver().findElement(By.xpath("//path[@stroke='#FAFAFA']")).click();
            Thread.sleep(2000);
        }catch (Exception s){

        }


//        4. Scroll down page to bottom
        Actions actions = new Actions(getDriver());
        WebElement subscription = getDriver().findElement(By.xpath("//h2[text()='Subscription']"));
        actions.scrollToElement(subscription).perform();

//        5. Verify 'SUBSCRIPTION' is visible
        assertTrue(subscription.isDisplayed());

//        6. Click on arrow at bottom right side to move upward
        //try-catch alttan açılıp kapanan reklamı kapatmak icin shadow root (closed)
        try {
            getDriver().findElement(By.xpath("//div[@class='grippy-host']")).click();
            getDriver().findElement(By.xpath("//path[@stroke='#FAFAFA']")).click();
            Thread.sleep(2000);
        }catch (Exception s){

        }
        getDriver().findElement(By.xpath("//a[@id='scrollUp']")).click();

//        7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

        WebElement text = getDriver().findElement(By.xpath("//h2[text()='Full-Fledged practice website for Automation Engineers']"));
        assertTrue(text.isDisplayed());
    }

}
