package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class registrationPage {
    protected WebDriver driver;
    private By txt_userName = By.id("register_UserName");
    private By txt_password = By.id("register_Password");
    private By txt_confirmPassword = By.id("register_ConfirmPassword");
    private By txt_idNumber = By.id("register_IDNumber");
    private By txt_firstName = By.id("register_FirstName");
    private By txt_surName = By.id("register_Surname");
    private By txt_sasfinAccountNumber = By.id("register_CrmNumber");
    private By btn_register = By.xpath("//*[@id=\"divRegisterButton\"]/div/button");
    private By chk_consent = By.xpath("//*[@id=\"register_Consent\"]");
    private By failure_header = By.id("registrationModalHeader");

public registrationPage(WebDriver driver)
{
this.driver=driver;
}

    public void enterUsername(String username)
    {
        driver.findElement(txt_userName).sendKeys(username);
    }
    public void enterPassword(String password)
    {
        driver.findElement(txt_password).sendKeys(password);
    }
    public void enterConfirmPassword(String confirmPassword)
    {
        driver.findElement(txt_confirmPassword).sendKeys(confirmPassword);
    }
    public void enterFirstname(String firstName)
    {
        driver.findElement(txt_firstName).sendKeys(firstName);
    }
    public void enterSurname(String surName)
    {
        driver.findElement(txt_surName).sendKeys(surName);
    }
    public void enterIDNumber(String idNumber)
    {
        driver.findElement(txt_idNumber).sendKeys(idNumber);
    }
    public void enterSasfinAccountNumber(String sasfinAccountNumber)
    {
        driver.findElement(txt_sasfinAccountNumber).sendKeys(sasfinAccountNumber);
    }
    public void checkConsent()
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        driver.findElement(chk_consent).click();
       // js.executeScript("argument[0].scrollIntoView();",chkBox);
    }
    public void submitRegistrationButton()
    {
        driver.findElement(btn_register).submit();
    }
    public void checkErrorMessage()
    {
       String errormessage = "Please check either your Sasfin account number or ID number is incorrect";
       driver.findElement(failure_header).isDisplayed();

    }

}
