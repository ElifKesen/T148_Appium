package tests.day03;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KiwiPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class Kiwi {
    AndroidDriver<AndroidElement>driver= Driver.getAndroidDriver();

    KiwiPage page=new KiwiPage();

    @Test
    public void Kiwitest() throws InterruptedException {

        // uygulamanin yuklendigi dogrulanir
        Assert.assertTrue(driver.isAppInstalled("com.skypicker.main"));

        //uygulamanin basariyla acildigi dogrulanir
        Thread.sleep(2000);
        Assert.assertTrue(page.misafirButonu.isDisplayed());

        // misafir olarak devam et e tiklanir
        Thread.sleep(2000);
        page.misafirButonu.click();

        // ardindan gelecek olan 3 adimda da yesil butona basilarak devam edilir
        Thread.sleep(2000);
/*
        TouchAction action=new TouchAction<>(driver);
        for (int i = 0; i < 3; i++) {
            action.press(PointOption.point(550,2060)).release().perform();

 */
        for (int i = 0; i < 3; i++) {
            ReusableMethods.koordinatTiklamaMethodu(550,2060,300);
        }

     // Trip type,one way olarak secilir
        Thread.sleep(2000);
        page.returnButonu.click();
        page.oneWayButonu.click();

       // kalkis ulkesi secenegine tiklanir ve default olan ulke kaldirilir
        Thread.sleep(2000);
        page.fromButonu.click();
        Thread.sleep(2000);
        page.silmeButonu.click();


        // kalkis yapilacak ulke/sehir girilir ve sec e tiklanir
        page.ulkemetinKutusuu.click();

        if (driver.isKeyboardShown()){
            driver.getKeyboard().pressKey("Ankara");
        }else {
            page.ulkemetinKutusuu.sendKeys("Ankara");
            }

        Thread.sleep(2000);
        page.kalkisVarisUlkesiButonu.click();
        Thread.sleep(2000);
        page.secButonu.click();


       // varis ulkesi secenegine tiklanir ve gidilecek ulke girilir
        Thread.sleep(2000);
        page.tobutonu.click();

        if (driver.isKeyboardShown()){
            driver.getKeyboard().pressKey("Frankfurt");
        }else {
            page.ulkemetinKutusuu.sendKeys("Frankfurt");
        }

        Thread.sleep(2000);
        page.kalkisVarisUlkesiButonu.click();
        Thread.sleep(2000);
        page.secButonu.click();

      // gidis tarihi 28 Mart olarak secilir ve set date e tiklanir
        page.tarihbutonu.click();
        Thread.sleep(2000);

       ReusableMethods.koordinatTiklamaMethodu(800,1400,300);
        /*
        TouchAction action=new TouchAction<>(driver);
        action.press(PointOption.point(560,1490)).
                waitAction(WaitOptions.waitOptions(Duration.ofMillis(300))).
                moveTo(PointOption.point(800,400)).release().perform();
        //300 msn iken 2 mayis secti

        ReusableMethods.koordinatTiklamaMethodu(803,1400,500);
         */

        Thread.sleep(2000);
        page.setDatebutonu.click();

        // search butonuna tiklanir
        Thread.sleep(2000);
        page.searchbutonu.click();

        // en ucuz ve aktarmasiz filtrelemeleri yapilir
        page.bestbutonu.click();
        page.enUcuzbutonu.click();
        page.Stopbutonu.click();
        page.nonStopbutonu.click();

        // gelen bilet fiyati kaydedilir ve kullanicin telefonuna sms olarak gonderilir
        String fiyatBilgisi=page.fiyatBilgisi.getText();
        driver.sendSMS("11111222","Sectiginiz biletin fiyat bilgisi"+fiyatBilgisi);




    }




}
