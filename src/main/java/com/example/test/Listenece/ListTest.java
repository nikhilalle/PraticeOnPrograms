package com.example.test.Listenece;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListTest implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        System.out.println("on Test  Start : "+result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        System.out.println("on Test  Success : "+result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        System.out.println("on Test  Failure : "+result.getMethod().getMethodName());

        // Take Screen Shot

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
        System.out.println("on Test  Skipped : "+result.getMethod().getMethodName());
    }

    @Override
    public void onStart(ITestContext result) {
        ITestListener.super.onStart(result);
        System.out.println("on Test  on Start : "+result.getName().getClass());
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        System.out.println("on Test  on Finish : "+context.getName().getClass());
    }
}
