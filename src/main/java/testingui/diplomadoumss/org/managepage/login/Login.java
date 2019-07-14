package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Login extends BasePage {

    @FindBy(css = "input[name='email']")
    private WebElement emailTextField;
    @FindBy(css = "input[name='password']")
    private WebElement passwordTextField;

    @FindBy(css = "button.btn-primary")
    private WebElement buttonLogin;

    public void seCredential (String email, String password)
    {
        emailTextField.clear();
        emailTextField.sendKeys(email);
        emailTextField.sendKeys(Keys.TAB);
        passwordTextField.clear();
        passwordTextField.sendKeys(password);
        passwordTextField.sendKeys(Keys.TAB);
        buttonLogin.click();

    }

}
