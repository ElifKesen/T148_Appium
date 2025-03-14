package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KiwiPage {

   public KiwiPage(){
       PageFactory.initElements((WebDriver)Driver.getAndroidDriver(),this);
   }
   @FindBy(xpath = "(//*[@class='android.widget.Button'])[4]")
    public WebElement misafirButonu;

    @FindBy(xpath = "//*[@text='Return']")
    public WebElement returnButonu;

    @FindBy(xpath = "//*[@text='One way']")
    public WebElement oneWayButonu;

    @FindBy(xpath = "//*[@text='From:']")
    public WebElement fromButonu;

    @FindBy(xpath = "//*[@content-desc='Clear All']")
    public WebElement silmeButonu;

    @FindBy(xpath = "//*[@class='android.widget.EditText']")
    public WebElement ulkemetinKutusuu;

    @FindBy(xpath = "(//*[@class='android.widget.Button'])[2]")
    public WebElement kalkisVarisUlkesiButonu;

    @FindBy(xpath = "//*[@text='Choose']")
    public WebElement secButonu;

    @FindBy(xpath="//*[@text='To:']")
    public WebElement tobutonu;

    @FindBy(xpath="//*[@text='Departure:']")
    public WebElement tarihbutonu;

    @FindBy(xpath="//*[@text='Set date']")
    public WebElement setDatebutonu;

   @FindBy(xpath="/(//*[@text='Search'])[1]")
   public WebElement searchbutonu;

 @FindBy(xpath="//*[@text='Best']")
 public WebElement bestbutonu;

 @FindBy(xpath="//*[@text='Cheapest']")
 public WebElement enUcuzbutonu;

 @FindBy(xpath="//*[@text='Stops']")
 public WebElement Stopbutonu;

 @FindBy(xpath="//*[@text='Nonstop']")
 public WebElement nonStopbutonu;

 @FindBy(xpath = "(//*[@class='android.widget.TextView'])[12]")
 public  WebElement fiyatBilgisi;









}
