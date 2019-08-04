package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import testingui.diplomadoumss.org.manageloadpage.TestContext;

public class HomePageSteps {
    private final TestContext testContext;

    public HomePageSteps(TestContext testContext){
        this.testContext = testContext;
    }


    @Given("^I have n things in my belly$")
    public void iHaveNThingsInMyBelly() {
        testContext.setCredetial();
    }

    @When("^Login \"([^\"]*)\" and \"([^\"]*)\"$")
    public void loginAnd(String user, String password) throws Throwable {
        testContext.login(user,password);
    }

    @Then("^The user should be \"([^\"]*)\"$")
    public void theUserShouldBe(String exp) throws Throwable {
        Assert.assertEquals(testContext.getUser(),exp);
    }
}
