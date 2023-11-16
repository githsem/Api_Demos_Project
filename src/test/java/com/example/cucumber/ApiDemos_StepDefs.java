package com.example.cucumber;

import static com.example.utils.MobileUtilities.*;

import static com.example.utils.Driver.*;

import com.example.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static com.example.utils.Locators.*;

public class ApiDemos_StepDefs {

    protected WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    protected int number;

    @Given("The user is on the start page")
    public void theUserIsOnTheStartPage() throws InterruptedException {
        Thread.sleep(2000);
        clickWithText("Continue");
        Thread.sleep(2000);
        clickWithText("OK");
        Thread.sleep(2000);
        clickWithText("OK");
        clickWithText("API Demos");
    }

    @When("The user swipes and clicks {string}")
    public void theUserSwipesAndClicks(String str) {
        getDriver().hideKeyboard();
        swipeAndClick(getLocatorByText(str), .9, .1);
    }

    @And("The user clicks {string}")
    public void theUserClicks(String str) throws InterruptedException {
        Thread.sleep(1000);
        clickWithText(str);
    }

    @And("The user sends {string} to InputBox")
    public void theUserSendsToInputBox(String text) {
        getDriver().findElement(lInputBox).sendKeys(text);
    }

    @Then("Verify that Checkbox checked")
    public void verifyThatCheckboxChecked() {
        Assert.assertTrue(getDriver().findElement(By.xpath("//android.widget.CheckBox[@checked='true']")).isDisplayed());
    }

    @Then("Verify that RadioButton checked")
    public void verifyThatRadioButtonChecked() {
        Assert.assertTrue(getDriver().findElement(By.xpath("//android.widget.RadioButton[@checked='true']")).isDisplayed());
    }

    @Then("Verify that Star checked")
    public void verifyThatStarChecked() {
        Assert.assertTrue(getDriver().findElement(By.xpath("//android.widget.CheckBox[@text='Star'][@checked='true']")).isDisplayed());
    }

    @Then("Verify that first OFF checked")
    public void verifyThatFirstOFFChecked() {
        Assert.assertTrue(getDriver().findElement(By.xpath("//android.widget.ToggleButton[@text='ON'][@checked='true']")).isDisplayed());
    }

    @Then("Verify that second OFF checked")
    public void verifyThatSecondOFFChecked() {
        Assert.assertTrue(getDriver().findElement(By.xpath("//android.widget.ToggleButton[@text='OFF'][@checked='false']")).isDisplayed());
    }

    @Then("Verify that four person names are visible")
    public void verifyThatFourPersonNamesAreVisible() {
        Assert.assertTrue(getDriver().findElement(By.xpath("//android.widget.TextView[@text='Arnold']")).isDisplayed());
        Assert.assertTrue(getDriver().findElement(By.xpath("//android.widget.TextView[@text='Barry']")).isDisplayed());
        Assert.assertTrue(getDriver().findElement(By.xpath("//android.widget.TextView[@text='Chuck']")).isDisplayed());
        Assert.assertTrue(getDriver().findElement(By.xpath("//android.widget.TextView[@text='David']")).isDisplayed());

    }

    @Then("Verify that four person names are invisible")
    public void verifyThatFourPersonNamesAreInvisible() {
        Assert.assertTrue(getDriver().findElement(By.xpath("//android.widget.TextView[@text='Dog Names'][@index='1']")).isDisplayed());
    }

    @Then("Verify that second fish name is {string}")
    public void verifyThatSecondFishNameIs(String fishName) {
        Assert.assertTrue(getDriver().findElement(By.xpath("//android.widget.TextView[@text='" + fishName + "']")).isDisplayed());

    }

    @When("The user choose a random number between {int} and {int}")
    public void theUserChooseARandomNumberBetweenAnd(int min, int max) {
        number = (int) ((Math.random() * (max - min)) + min);
    }

    @And("The user clicks Next until selected number")
    public void theUserClicksNextUntilSelectedNumber() {
        int currentnumber = Integer.parseInt(getDriver().findElement(By.className("android.widget.TextView")).getText());
        while (currentnumber < number) {
            clickWithText("NEXT");
            currentnumber++;
        }
    }

    @And("The user navigates back")
    public void theUserNavigatesBack() {
        getDriver().navigate().back();
    }
}
