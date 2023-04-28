package AlleNikhil.TestAll.listnese;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        System.out.println("Test Start: " + result.getMethod().getMethodName());
        // Log4j
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        System.out.println("Test Success   "+ result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        System.out.println("Test Failure  "+ result.getMethod().getMethodName());
        // Take Screenshot Code
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
        System.out.println("Test Skipped   "+ result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
        System.out.println("Test Timeout  " + result.getMethod().getMethodName());
    }

}
