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
public class EjerciciosTest {
    
    public EjerciciosTest() {
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
        assertEquals(false, Ejercicios.hay_mayor_tira(new char []{}, 'a'));
        assertEquals(false, Ejercicios.hay_mayor_tira(new char[]{'a'}, 'a'));
        assertEquals(true, Ejercicios.hay_mayor_tira(new char[]{'b'}, 'a'));
        //fail("The test case is a prototype.");
    }

    @Test
    public void testBuscar_en() {
        System.out.println("buscar_en");
        assertEquals(0, Ejercicios.buscar_en(new char []{}, 'a'));
        assertEquals(1, Ejercicios.buscar_en(new char []{'a'}, 'a'));
        assertEquals(0, Ejercicios.buscar_en(new char []{'b'}, 'a'));
        assertEquals(1, Ejercicios.buscar_en(new char []{'a','b'}, 'a'));
        //fail("The test case is a prototype.");
    }
    
}
