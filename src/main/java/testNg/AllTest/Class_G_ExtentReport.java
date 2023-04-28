package testNg.AllTest;//package com.matrix.nikhilNew.TestNg.AllTest;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import org.testng.annotations.Test;
//
//public class Class_G_ExtentReport {
//    ExtentTest test;
//    ExtentReports extent;
//    @Test
//    public void fer(){
//        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
//
//        // create ExtentReports and attach reporter(s)
//        extent = new ExtentReports();
//        extent.attachReporter(htmlReporter);
//
//        // creates a toggle for the given test, adds all log events under it
//       test = extent.createTest("MyFirstTest", "Sample description");
//
//        System.out.println("I am Group 1");
//        System.out.println("I am Group 1");
//        System.out.println("I am Group 1");
//        System.out.println("I am Group 1");
//        System.out.println("I am Group 1");
//        System.out.println("I am Group 1");
//
//
//    }
//    @Test
//    public void group_1(){
//        test.log(Status.INFO, "This step0 shows usage of log(status, details)");
//        System.out.println("I am Group 1");
//
//    }
//    @Test
//    public void group_2(){
//        test.log(Status.INFO, "This step1 shows usage of log(status, details)");
//        System.out.println("I am Group 2");
//        //Assert.assertEquals(23,65);
//
//    }
//    @Test
//    public void group_3(){
//       test.pass("Test Excute");
//        System.out.println("I am Group 3");
//
//    }
//    @Test
//    public void group_4(){
//        test.pass("Test Excute failed");
//        System.out.println("I am Group 3");
//        extent.flush();
//    }
//
//}
