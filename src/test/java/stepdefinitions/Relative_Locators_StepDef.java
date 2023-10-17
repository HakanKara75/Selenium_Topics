package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import pages.Relative_Locators_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class Relative_Locators_StepDef {

    Relative_Locators_Page page= new Relative_Locators_Page();

    @Given("go to zara")
    public void goToZara() {
        Driver.getDriver().get("https://www.zara.com/tr/");

    }

    @And("click to erkek link")
    public void clickToErkekLink() {
        page.login.click();
          }

    @And("click to jean button")
    public void clickToJeanButton() {
        ReusableMethods.visibleWait(page.pantolon, 10);
        WebElement jean= Driver.getDriver().findElement(RelativeLocator.with(By.tagName("label")).toRightOf(page.pantolon));
//WebElement selectedRadioButton = driver.findElement(RelativeLocator.with(By.tagName("label")).toRightOf(yesRadioButton));
//
//WebElement selectedRadioButton2 = driver.findElement(RelativeLocator.with(By.tagName("label")).toLeftOf(impressiveRadioButton));
        //WebElement selectedRadioButton3 = driver.findElement(RelativeLocator.with(By.tagName("label")).above(yesRadioButton));
        //
        //WebElement selectedRadioButton4 = driver.findElement(RelativeLocator.with(By.tagName("label")).below(yesRadioButton));
        jean.click();
    }
}
