import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    private SHAFT.GUI.WebDriver driver;
    private SHAFT.TestData.JSON testData;

    @Test
    public void testMethod() {
        new LoginPage(driver)
                .login(testData.getTestData("userName"),
                        testData.getTestData("password"))
                .assertLoginIsSuccessful();
    }

    @BeforeMethod
    public void setUp() {
        driver = new SHAFT.GUI.WebDriver();
        testData = new SHAFT.TestData.JSON("/loginTestData.json");
        driver.browser().navigateToURL("https://opensource-demo.orangehrmlive.com");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
