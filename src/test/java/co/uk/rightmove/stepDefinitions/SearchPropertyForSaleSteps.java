package co.uk.rightmove.stepDefinitions;

import co.uk.rightmove.pages.BasePage;
import co.uk.rightmove.pages.HomePage;
import co.uk.rightmove.pages.SearchCriteriaPage;
import co.uk.rightmove.pages.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class SearchPropertyForSaleSteps extends BasePage {
    HomePage homepage = new HomePage(driver);
    SearchCriteriaPage searchCriteriaPage = new SearchCriteriaPage(driver);
    SearchResultPage searchResultPage = new SearchResultPage(driver);
    @Given("I navigate to the homepage")
    public void i_navigate_to_the_homepage() {

    launchURL();

    }
    @When("I enter {string} in the search field")
    public void i_enter_in_the_search_field(String location) {

        homepage.enterLocation(location);
    }
    @And("I accept all cookies")
    public void acceptAllCookies() {

        homepage.clickAcceptCookies();
    }

    @When("I click on the For sale button")
    public void i_click_on_the_for_sale_button() {

        homepage.clickForSaleButton();
    }

    @When("I ensure that the search criteria is displayed")
    public void i_ensure_that_the_search_criteria_is_displayed() {
    boolean res = searchCriteriaPage.IsSearchCriteriaPageDisplayed();
    Assert.assertTrue(res);
    }

    @When("I select radius {string} of the location")
    public void i_select_radius_of_the_location(String radius) {
    searchCriteriaPage.selectSearchRadius(radius);
    }

    @When("I select minimum price of {string}")
    public void i_select_minimum_price_of(String minPrice) {
    searchCriteriaPage.selectMinimumPrice(minPrice);
    }

    @When("I select maximum price of {string}")
    public void i_select_maximum_price_of(String string) {

    }

    @When("I select minimum number of bedrooms as {string}")
    public void i_select_minimum_number_of_bedrooms_as(String string) {

    }

    @When("I select maximum number of bedrooms as {string}")
    public void i_select_maximum_number_of_bedrooms_as(String maxBedrooms) {
    searchCriteriaPage.selectMaxBedrooms(maxBedrooms);
    }

    @When("I select {string} as property type")
    public void i_select_as_property_type(String property) {
    searchCriteriaPage.selectPropertyType(property);

    }

    @When("I select {string} as added to site option")
    public void i_select_as_added_to_site_option(String string) {

    }

    @When("I click on {string} button")
    public void i_click_on_button(String string) {
    searchCriteriaPage.clickFindPropertyButton();

    }

    @When("I verify that search result page is displayed")
    public void i_verify_that_search_result_page_is_displayed() {
    boolean res = searchResultPage.isSearchResultPageDisplayed();
    Assert.assertTrue(res);
    }

    @When("I click on the second result")
    public void i_click_on_the_second_result() {
    searchResultPage.clickSecondProperty();
    }


    @Then("the details of the selected property are displayed")
    public void theDetailsOfTheSelectedPropertyAreDisplayed() {
    }


}
