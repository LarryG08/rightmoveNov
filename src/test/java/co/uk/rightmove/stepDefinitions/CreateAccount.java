package co.uk.rightmove.stepDefinitions;

import co.uk.rightmove.pages.BasePage;
import co.uk.rightmove.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount extends BasePage {
    HomePage homepage = new HomePage(driver);


    @When("I click on sign in or create an account")
    public void i_click_on_sign_in_or_create_an_account() {
        homepage.clickSignInOrCreateAccountButton();

    }

    @When("I enter my {string}")
    public void i_enter_my(String string) {

    }

    @When("I click on continue button")
    public void i_click_on_continue_button() {

    }

    @When("checked the stay signed in box")
    public void checked_the_stay_signed_in_box() {

    }

    @When("I click create account button")
    public void i_click_create_account_button() {

    }

    @Then("Your communication preferences page should diplay")
    public void your_communication_preferences_page_should_diplay() {

    }
}
