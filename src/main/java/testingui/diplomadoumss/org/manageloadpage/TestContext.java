package testingui.diplomadoumss.org.manageloadpage;


import testingui.diplomadoumss.org.managepage.login.Login;

public class TestContext {
    private WebDriverManager webDriverManager;


    public TestContext(){
        webDriverManager = new WebDriverManager();
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }


    public void setCredetial() {
        webDriverManager.getDriver();
        webDriverManager.setURL();
    }

    public void login(String user, String password) {
        Login login= new Login();
        login.setEmail(user);
        login.setPassword(password);
        login.clickLoginButton();
    }

    public String getUser() {
        Login login= new Login();
       return   login.getUser();
    }
}
