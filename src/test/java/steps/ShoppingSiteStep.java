package steps;

import Base.BaseUtil;
import com.aventstack.extentreports.GherkinKeyword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;

import static Base.BaseUtil.Driver;
import static Base.BaseUtil.scenarioDef;

public class ShoppingSiteStep {

    private BaseUtil base;
    public ShoppingSiteStep (BaseUtil base){ this.base = base; }

    @Given("I am on the automation practice online shop site")
    public void onShoppingSite() throws Throwable{
        //Creating step inside the extent test "scenario def"
        //   scenarioDef.createNode(new GherkinKeyword("Given"), "I navigate to the login page");

        System.out.println("Navigate to the Homepage");
        base.Driver.navigate().to("http://automationpractice.com/index.php");
       // Assert.assertEquals("http://automationpractice.com/index.php", Driver.getCurrentUrl());
        throw new cucumber.api.PendingException();
    }

    @When("I click on casual dresses")
    public void i_click_on_casual_dresses() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click dress tab");
        HomePage homePage = new HomePage(base.Driver);
        homePage.clickDressTab();

        throw new cucumber.api.PendingException();
    }

    @And("I add the printed dress to my cart")
    public void i_add_the_printed_dress_to_my_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @And("click on proceed to checkout")
    public void click_on_proceed_to_checkout() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("I can see the printed dress in my cart")
    public void i_can_see_the_printed_dress_in_my_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
