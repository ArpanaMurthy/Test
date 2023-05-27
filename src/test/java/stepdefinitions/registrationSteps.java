package stepdefinitions;

import Pages.registrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class registrationSteps {
    WebDriver driver;
    registrationPage register;
    @Given("I navigate to the application registration page")
    public void i_navigate_to_the_application_registration_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\new1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://wealth.sasfin.com/wealth/Security/Login";
        driver.get(url);
        sleep(10000);
        driver.findElement(By.id("cookieNoticeDismiss")).click();
        driver.findElement(By.id("register")).click();
    }
    @When("I entered the {string},{string},{string},{string},{string},{string},{string}")
    public void i_entered_the(String userName, String password, String confirmPassword, String firstName, String surName, String idNumber, String sasfinAccountNumber) throws InterruptedException {

        register = new registrationPage(driver);
        register.enterUsername(userName);
        register.enterPassword(password);
        register.enterConfirmPassword(confirmPassword);
        register.enterFirstname(firstName);
        register.enterSurname(surName);
        register.enterIDNumber(idNumber);
        register.enterSasfinAccountNumber(sasfinAccountNumber);
        sleep(1000);
        register.checkConsent();


    }
    @Then("I get the failure registration message")
    public void i_get_the_successfull_registration_message() {
        register.submitRegistrationButton();
        register.checkErrorMessage();
        driver.close();

    }
}
