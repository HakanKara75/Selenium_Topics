package utilities;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pages.US04_US05_Dean_Ekleme_Guncelleme_Silme_Modulu;

import java.time.Duration;

import static utilities.ReusableMethods.clickByJavaScript;

public class US04_US05_Methods extends US04_05 implements US04_05_Methods {
    US04_US05_Dean_Ekleme_Guncelleme_Silme_Modulu kisi=new US04_US05_Dean_Ekleme_Guncelleme_Silme_Modulu();

    /**
     *
     */
    @Override
    public void addDeanClick() {

            try {
                ReusableMethods.bekle(2);
                kisi.menu.click();
                ReusableMethods.bekle(2);
                kisi.deanManagement.click();
                ReusableMethods.bekle(2);
            } catch (Exception e) {

            }
    }

    /**
     *
     */
    @Override
    public void loginMethod() {

    }

    @Override
    public void milisaniyeBekle() {

    }

    @Override
    public void loginMethod(String username, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("manageUrl"));
        kisi.login.click();

        switch (username) {
            case "adminUsername":
                kisi.username.sendKeys(ConfigReader.getProperty("adminUsername"));
                break;
            case "deanUsername":
                kisi.username.sendKeys(ConfigReader.getProperty("deanUsername"));
                break;
            case "viceDeanUsername":
                kisi.username.sendKeys(ConfigReader.getProperty("viceDeanUsername"));
                break;
            case "teacherUsername":
                kisi.username.sendKeys(ConfigReader.getProperty("teacherUsername"));
                break;
            case "studentUsername":
                kisi.username.sendKeys(ConfigReader.getProperty("studentUsername"));
                break;

            default:
                break;

        }

        kisi.password.sendKeys(ConfigReader.getProperty(password));

        //login.uyeGirisKismiLoginButton.click();
        clickByJavaScript(kisi.uyeGirisKismiLoginButton);
    }


        public void alertWait1(WebElement alert){
            Wait<WebDriver> wait = new FluentWait<>(Driver.getDriver()).
                    withTimeout(Duration.ofSeconds(3)).//Fluent wait için max. süreyi belirtir
                            pollingEvery(Duration.ofSeconds(1)).//Her bir saniyede webelementi kontrol eder
                            withMessage("Ignore Exeption").//zorunlu değil
                            ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.visibilityOf(alert));
        }
        public void alertWait2() throws InterruptedException {
            int count = 0;
            while (count<10)
            {
                try
                {
                    Driver.getDriver().switchTo().alert();
                    break;
                }
                catch (Exception error)
                {
                    Thread.sleep(100);
                }
                count++;
            }
        }

    /**
     *
     */
    @Override
    public void deanBolumuGiris() {
        kisi.menu.click();
        kisi.deanManagement.click();
    }

    public void milisaniyeBekle(int milisaniye){
            try {
                Thread.sleep(milisaniye);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

