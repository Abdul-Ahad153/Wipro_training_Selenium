package DataProvider;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("==> Suite Start: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("==> Suite Finish: " + context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("[START] " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("[PASS ] " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("[FAIL ] " + result.getMethod().getMethodName() + " | " +
                (result.getThrowable() != null ? result.getThrowable().getMessage() : ""));
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("[SKIP ] " + result.getMethod().getMethodName());
    }
}
