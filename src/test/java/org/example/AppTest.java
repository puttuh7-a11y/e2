package org.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    @Test
    public void testAdd() {
        App app = new App();
        int result = app.add(4,2);
        System.out.println("running is: 4 + 2 = " + result);
        Assert.assertEquals(6,result);
    }
}