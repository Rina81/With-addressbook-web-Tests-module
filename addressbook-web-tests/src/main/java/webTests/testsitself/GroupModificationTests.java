package webTests.testsitself;
import org.testng.annotations.Test;
import webTests.model.GroupData;

public class GroupModificationTests extends TestBase {
    @Test
    public void testGroupModification ()
    {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("Modified1", "Modified2"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }
}
