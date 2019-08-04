package testingui.diplomadoumss.org.manageloadpage;

import org.openqa.selenium.WebDriver;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

public class WebDriverManager {
   WebDriver driver;

    public Object getDriver() {
        driver= DriverManager.getInstance().getWebDriver();
        return driver;
    }

    public void setURL() {
        driver.get(PropertyAccesor.getInstance().getURL());
    }
}
