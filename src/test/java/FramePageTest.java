import com.demoqa.enums.EndPointsEnum;
import com.demoqa.utils.ConfigReader;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FramePageTest extends BaseTest{

    @Test(groups = {"UI","Smoke","NBW-18"}, description = "Verify that driver can switch to another frame")
    @Link("https://demoqa.com/")
    @Owner("Janar")
    public void doubleClickTest(){
        browserHelper.open(ConfigReader.getValue("baseURL") + EndPointsEnum.FRAMES.getEndpoint());
        iframeHelper.switchToFrame("frame1");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        iframeHelper.switchToParentFrame();
        System.out.println(driver.findElement(By.tagName("h1")).getText());
    }

}
