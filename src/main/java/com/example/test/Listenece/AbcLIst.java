package com.example.test.Listenece;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListTest.class)
public class AbcLIst {
    @Test
    public void Mahi(){
        System.out.println("Mahi");
    }

    @Test
    public void panku(){
        System.out.println("panku");
        Assert.assertTrue(false);
    }
}
