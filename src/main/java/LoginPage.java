import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.bidi.log.Log;

public class LoginPage {

    private SHAFT.GUI.WebDriver driver;

    private final By userName_input = By.name("username");
    private final By password_input = By.name("password");
    private final By login_button = By.tagName("button");

    public LoginPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage login(String userName, String password) {
        driver.element().type(userName_input, userName);
        driver.element().type(password_input, password);
        driver.element().click(login_button);
        return this;
    }

    public LoginPage assertLoginIsSuccessful() {

        return this;
    }

}
