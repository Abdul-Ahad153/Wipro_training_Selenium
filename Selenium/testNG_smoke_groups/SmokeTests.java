package testNG_smoke_groups;

import org.testng.annotations.Test;

public class SmokeTests {

    @Test(groups = {"smoke"})
    public void openSite() {
        System.out.println("🔥 Smoke Test: Open site executed");
    }

    @Test(groups = {"smoke"})
    public void loginSmokeTest() {
        System.out.println("🔥 Smoke Test: Login executed");
    }
}

