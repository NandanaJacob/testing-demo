package layers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginBDD {

    private String username;
    private String password;
    private String errorMessage;
    private boolean isLoggedIn;

    // Assuming we have a mock database of valid users
    private final String VALID_USERNAME = "user123";
    private final String VALID_PASSWORD = "password123";
    private final String INVALID_ERROR_MESSAGE = "Invalid username or password";

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
        if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
            isLoggedIn = true;
        } else {
            isLoggedIn = false;
            errorMessage = INVALID_ERROR_MESSAGE;
        }
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
