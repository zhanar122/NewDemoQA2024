import com.demoqa.drivers.DriverManager;
import com.demoqa.helper.AlertHelper;
import com.demoqa.helper.BrowserHelper;
import com.demoqa.helper.IframeHelper;
import com.demoqa.helper.WebElementActions;
import com.demoqa.pages.*;
import com.demoqa.utils.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected RandomUtils randomUtils;
    protected WebElementActions webElementActions;
    protected AlertHelper alertHelper;
    protected BrowserHelper browserHelper;
    protected DemoQAPages demoQAPages;
    protected IframeHelper iframeHelper;
    protected WebDriverWait wait;
    protected MenuPage menuPage;


    @BeforeClass(alwaysRun = true)
    public void setUp(){

        driver = DriverManager.getDriver();
        randomUtils = new RandomUtils();
        webElementActions = new WebElementActions();
        alertHelper = new AlertHelper(driver);
        browserHelper = new BrowserHelper(driver);
        iframeHelper = new IframeHelper(driver);
        wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        menuPage = new MenuPage();

        demoQAPages = new DemoQAPages();
        demoQAPages.setUp();

    }

    @BeforeClass(alwaysRun = true)
    public void setUp3() {
        driver = DriverManager.getDriver();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        DriverManager.closeDriver();
    }

}
