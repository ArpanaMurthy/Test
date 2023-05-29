package stepdefinitions;

import Pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class loginSteps {
    WebDriver driver;
    loginPage login;
    @Given("I navigate to the application login page")
        public void iNavigateToTheApplicationLoginPage() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\new1\\chromedriver.exe");
             driver = new ChromeDriver();
             driver.manage().window().maximize();
             String url = "https://wealth.sasfin.com/wealth/Security/Login";
             driver.get(url);
             sleep(10000);
             driver.findElement(By.id("cookieNoticeDismiss")).click();
        }

        @When("I entered the {string} and {string}")
        public void iEnteredTheAnd(String userName, String password) throws InterruptedException {
            login = new loginPage(driver);
            login.enterUsername(userName);
            login.enterPassword(password);

        }

        @Then("I entered to the home screen")
        public void iEnteredToTheHomeScreen() {
        login.submitSignINButton();
        if(!driver.getTitle().equals("Welcome to sasfin"))
        {
            throw new IllegalStateException("This is not home page");
        }
            driver.close();
        }

    }


