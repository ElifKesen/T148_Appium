package tests.day03;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KiwiPage;
import utilities.Driver;
import utilities.ReusableMethods;

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
// kalkis ulkesi secenegine tiklanir ve default olan ulke kaldirilir
// varis ulkesi secenegine tiklanir ve gidilecek ulke girilir
// gidis tarihi 28 Mart olarak secilir ve set date e tiklanir
// search butonuna tiklanir
// en ucuz ve aktarmasiz filtrelemeleri yapilir
// gelen bilet fiyati kaydedilir ve kullanicin telefonuna sms olarak gonderilir

    }




}
