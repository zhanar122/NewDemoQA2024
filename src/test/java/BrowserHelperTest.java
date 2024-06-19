import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BrowserHelperTest extends BaseTest{

    @Test
    void test1() throws InterruptedException {
        browserHelper.open("https://demoqa.com/browser-windows");
       Thread.sleep(2000);
//        driver.findElement(By.id("tabButton")).click();
//        Thread.sleep(1000);
//        browserHelper.switchToWindow(0);
//        Thread.sleep(1000);
//        driver.findElement(By.id("tabButton")).click();
//        Thread.sleep(1000);
//        browserHelper.switchToWindow(0);
//        driver.findElement(By.id("tabButton")).click();
//        Thread.sleep(1000);
//        browserHelper.switchToWindow(0);
//        driver.findElement(By.id("tabButton")).click();
//        Thread.sleep(1000);
//        browserHelper.switchToWindow(1);
//        Thread.sleep(3000);

        browserHelper.switchToParentWitchChildClose();
        Thread.sleep(5000);





        /*driver.findElement(By.xpath("//span[text()='Alerts']"));
        Thread.sleep(2000);
        browserHelper.goBack();
        Thread.sleep(2000);
        browserHelper.goForward();
        Thread.sleep(2000);
        browserHelper.refreshThePage();
        Thread.sleep(2000);*/
    }

}
