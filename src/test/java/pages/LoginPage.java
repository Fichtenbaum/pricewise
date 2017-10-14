package pages;

import org.openqa.selenium.By;

public class LoginPage extends AbstractPage{
    private By loginInput = By.xpath("//input[@placeholder='Login']")
            ,passwordInput = By.xpath("//input[@placeholder='Password']")
            ,submitButton = By.xpath("//button[@type='submit']");

    public void logIn(String userName, String password) throws InterruptedException {
        type(loginInput, userName);
        type(passwordInput, password);
        click(submitButton);
    }
}
