package com.seleniumpro;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Testng {
    @Test
    public void testOne(){
        assertEquals(5+5, 10);
    }
@Test
    public void testTwo(){
        assertEquals(5*10, 50);
}

}
