package testingui.diplomadoumss.org.managepage.examen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;

public class NasaPage extends BasePage {

    @FindBy(css = "#tocify-header1 > li:nth-child(1) > a")
    private WebElement nasaAPI;
    @FindBy(css = "#tocify-header8 > li > a")
    private WebElement earth;
//    @FindBy(css = "")
//    private WebElement bookingLink;
//    @FindBy(css = "")
//    private WebElement bookingLink;
//    @FindBy(css = "")
//    private WebElement bookingLink;



    public  void clickNASAAPI(){
        Event.clickWebElement(nasaAPI);
    }

    public  void clickEarth(){
        Event.clickWebElement(earth);
    }

}
