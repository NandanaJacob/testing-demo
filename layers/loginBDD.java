package layers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginBDD {

    private String username;
    private String password;
    private String errorMessage;
    private boolean isLoggedIn = false;

    // Assuming we have a mock database of valid users
   //suppose the database is a list[][] of usernames, password 
   //for example:
   
    String[][] database = {
        {"user1", "pass1"},
        {"user2", "pass2"},
        {"user3", "pass3"}
    };
    

    @Given("I have entered a valid username {string}")
    public void iHaveEnteredAValidUsername(String username) {
        this.username = username;
    }

    @Given("I have entered an incorrect username {string}")
    public void iHaveEnteredAnIncorrectUsername(String username) {
        this.username = username;
    }

    @Given("I have entered a correct password {string}")
    public void iHaveEnteredACorrectPassword(String password) {
        this.password = password;
    }

    @Given("I have entered an incorrect password {string}")
    public void iHaveEnteredAnIncorrectPassword(String password) {
        this.password = password;
    }

    @When("I press the login button")
    public void iPressTheLoginButton() {
        boolean usernameExists = false;
        for (String[] user : database) {
            if (user[0].equals(username)) {  // Check if username matches
                usernameExists = true;
                if (user[1].equals(password)) {  // Check if password matches
                    isLoggedIn = true;
                    return;
                } else {
                    errorMessage = "Incorrect password";
                    break;
                }
            }
        }
    
        // If username doesn't exist or password is incorrect
        if (!usernameExists) {
            errorMessage = "Invalid username";
        }
    
        // If the login fails
        isLoggedIn = false;
    }

    @Then("I should be logged in successfully")
    public void iShouldBeLoggedInSuccessfully() {
        Assert.assertTrue("Login should be successful", isLoggedIn);
    }

    @Then("I should see an error message {string}")
    public void iShouldSeeAnErrorMessage(String expectedMessage) {
        Assert.assertEquals("Error message should match", expectedMessage, errorMessage);
    }
}
/*
 * Feature: Login Feature

  As a user,
  I want to log in with my credentials,
  So that I can access my account.

  Scenario: Successful Login
    Given I have entered a valid username "user123"
    And I have entered a correct password "password123"
    When I press the login button
    Then I should be logged in successfully

  Scenario: Invalid Username
    Given I have entered an invalid username "wrongUser"
    And I have entered a password "password123"
    When I press the login button
    Then I should see an error message "Invalid username or password"

  Scenario: Incorrect Password
    Given I have entered a valid username "user123"
    And I have entered an incorrect password "wrongPassword"
    When I press the login button
    Then I should see an error message "Invalid username or password"





     private final String VALID_USERNAME = "user123";
    private final String VALID_PASSWORD = "password123";
    private final String INVALID_ERROR_MESSAGE = "Invalid username or password";

 */