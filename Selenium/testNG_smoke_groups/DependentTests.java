package testNG_smoke_groups;

import org.testng.annotations.Test;

public class DependentTests {

    @Test(groups = {"login"})
    public void loginTest() {
        System.out.println("✅ Login Successful");
    }

    @Test(groups = {"dashboard"}, dependsOnGroups = {"login"})
    public void dashboardTest() {
        System.out.println("📊 Dashboard Test executed AFTER login group");
    }
}
