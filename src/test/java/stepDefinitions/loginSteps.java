package stepDefinitions;

import io.cucumber.java.en.*;

public class loginSteps {
    @Given("user Test here")
    public void verifyLoginPage(){

    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Step - user inside login page");
    }
    @When("user enters username and password")
    public void user_enters_user1_and_pass1() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Step - user enter username and password");
    }
    @When("clicks on login button")
    public void clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user click login button");
    }
    @Then("user is navigate to login page")
    public void user_is_navigate_to_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is navigating to after login page");
    }
}
