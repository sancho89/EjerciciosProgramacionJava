/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a033564158m
 */
public class ejercicio1Test {
    
    public ejercicio1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testHay_mayor_tira() {
        System.out.println("hay_mayor_tira");
        assertEquals(false, ejercicio1.hay_mayor_tira(new char []{'b'}, 'a'));
        //fail("The test case is a prototype.");
    }
    
}
