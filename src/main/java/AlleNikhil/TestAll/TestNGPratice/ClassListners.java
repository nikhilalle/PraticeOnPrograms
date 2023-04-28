package AlleNikhil.TestAll.TestNGPratice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ClassListners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        System.out.println(" Test Start");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        System.out.println(" Test Success ");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        System.out.println(" Test Failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
        System.out.println(" Test Skipped ");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
        System.out.println(" Test Failed But With In-Success  Percentage");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
        System.out.println("Test  Failed With  Timeout ");
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
        System.out.println(" Test On Start");
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);

        System.out.println(" test on Finish  ");
    }
}
