import com.demoqa.entities.OrangeLoginEntity;
import com.demoqa.enums.OrangeSideBarMenuEnum;
import com.demoqa.utils.ConfigReader;
import org.testng.annotations.Test;

public class OrangePageTest extends BaseTest{

    @Test
    public void OrangeFillFormTest(){

        browserHelper.open(ConfigReader.getValue("baseOrangeURL"));
        OrangeLoginEntity orangeLoginEntity = randomUtils.createOrangeLogin();
        demoQAPages.getOrangeLoginPage().fillForm(orangeLoginEntity);
        demoQAPages.getOrangeLoginPage().chooseSideBarMenu(OrangeSideBarMenuEnum.ADMIN);
        webElementActions.pause(5);
        demoQAPages.getOrangeAdminPage().clickRandomMenuAndSubMenu();
        webElementActions.pause(5);

    }


}
