package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import testingui.diplomadoumss.org.managepage.examen.NasaPage;

public class ExamenStepdefs {
    private NasaPage nasa = new NasaPage();
    @And("^Click NASA API Listing$")
    public void clickNASAAPIListing() {
      nasa.clickNASAAPI();
    }

    @And("^Second Click NASA API Listing$")
    public void secondClickNASAAPIListing() {
        nasa.clickNASAAPI();
    }


    @And("^click Earth$")
    public void clickEarth() {
        nasa.clickEarth();
    }

    @And("^click Imagery$")
    public void clickImagery() {
    }


}
