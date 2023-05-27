package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    protected WebDriver driver;
    private By txt_userName = By.id("auth_UserName");
    private By txt_password = By.id("auth_Password");
    private By btn_signIn = By.xpath("//*[@id=\"formLogin\"]/div[6]/div/button");

    public loginPage(WebDriver driver)
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
    public void submitSignINButton()
    {
        driver.findElement(btn_signIn).submit();
    }

}
