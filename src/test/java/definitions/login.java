package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static support.TestContext.getDriver;

public class login {
    @When("I navigate to login page")
    public void iNavigateToLoginPage() {
        getDriver().get("http://ask-stage.portnov.com/#/login");
    }

    @And("I click on Sign in button")
    public void iClickOnSignInButton() {
        getDriver().findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
    }
}
