package test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Acer on 03/09/2017.
 */
public class MyStepdefs {
    HomePage homePage = new HomePage();

    @Given("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {
        homePage.checkUrlAndTitle();
        homePage.setGotoRegistration();


    }

    @When("^he enter his valid detail for registration$")
    public void he_enter_his_valid_detail_for_registration() throws Throwable {
        homePage.enterValidDetailForRegistration();

    }

    @Then("^he able to register successfully$")
    public void he_able_to_register_successfully() throws Throwable {
        homePage.checkRegistrationSuccessfulMsg();

    }
    }

