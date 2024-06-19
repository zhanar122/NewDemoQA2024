import com.demoqa.entities.PracticeFormEntity;
import com.demoqa.entities.SelectMenuEntity;
import com.demoqa.pages.SelectMenuPage;
import org.testng.annotations.Test;

public class SelectMenuPageTest extends BaseTest{

    @Test
    public void testFormFill() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");

        SelectMenuEntity selectMenuEntity = randomUtils.generateRandomSelectMenuEntity();
        demoQAPages.getSelectMenuPage().printAllOptions(selectMenuEntity);

    }

}
