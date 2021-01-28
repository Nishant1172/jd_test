package com.jd.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import com.jd.pages.homePage;

public class searchStep {
    private com.jd.pages.homePage homePage = new homePage();
    private WebDriver driver;
    @Given("^i am on a homepage$")
    public void i_am_on_a_homepage() {
        homePage.openBrowser();
    }

    @When("^i do search for a product \"([^\"]*)\"$")
    public void i_do_search_for_a_product(String arg1){
        homePage.doSearch("Nike Boot");
        homePage.searchItem();

    }
    @Then("^i should be see a respective product$")
    public void i_should_be_see_a_respective_product() {
        homePage.selectSize();
        homePage.addToBasket();
        homePage.closeBrowser();
    }
}
