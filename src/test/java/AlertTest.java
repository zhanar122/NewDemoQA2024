import com.demoqa.enums.EndPointsEnum;
import com.demoqa.utils.ConfigReader;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {

    @Test
    void alertTest() throws InterruptedException {
        browserHelper.open(ConfigReader.getValue("baseDevURL") + EndPointsEnum.ALERT.getEndpoint());
        driver.get("https://demoqa.com/alerts");
        webElementActions.click(demoQAPages.getAlertPage().confirmButton);
        alertHelper.acceptAlert();
        webElementActions.pause(5);

    }

}
