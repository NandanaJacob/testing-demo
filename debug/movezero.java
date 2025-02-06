package debug;

public class movezero {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        //move zeroes to right side
        int n = arr.length;
        int index = 0;
        for(int num:arr)
        {
            //if num is not 0, place it on lhs
            if(num==0) //break point num!=0
            {
                arr[index++] = num;
                //same as arr[index]=num then index++
            }
        }
        while(index<n)
        {
            arr[index++]=0;
        }
        for(int res:arr)
        {
            System.out.println(res);
        }
    }
}
// BDD
/* 
Calculator.feature
```````````````````
Feature: Calculator
  As a user
  I want to perform basic arithmetic operations
  So that I can verify the correctness of calculations
 
  Scenario: Addition
    Given I have entered 50 into the calculator
    And I have entered 70 into the calculator
    When I press add
    Then the result should be 120 on the screen
 
  Scenario: Subtraction
    Given I have entered 70 into the calculator
    And I have entered 30 into the calculator
    When I press subtract
    Then the result should be 40 on the screen
 
CalculatorSteps.java ( Step Definition File)
`````````````````````````````````````````````
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
 
public class CalculatorSteps {
 
    private int number1;
    private int number2;
    private int result;
 
    @Given("I have entered {int} into the calculator")
    public void iHaveEnteredNumberIntoTheCalculator(int number) {
        if (number1 == 0)
            number1 = number;
        else
            number2 = number;
    }
 
    @When("I press add")
    public void iPressAdd() {
        result = number1 + number2;
    }
 
    @When("I press subtract")
    public void iPressSubtract() {
        result = number1 - number2;
    }
 
    @Then("the result should be {int} on the screen")
    public void theResultShouldBeExpectedResultOnTheScreen(int expectedResult) {
        Assert.assertEquals(expectedResult, result);
    }
}
 
TestRunner.java
````````````````
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
 
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        glue = "stepdefinitions")
public class TestRunner {
}
*/