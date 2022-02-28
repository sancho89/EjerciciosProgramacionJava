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
public class ejerciciosTest {

    public ejerciciosTest() {
        assertEquals(false, Ejercicios.hay_mayor_tira(new char[]{}, 'a'));
    }

    @Test
    public void testHay_mayor_tira() {
        System.out.println("hay_mayor_tira");
        assertEquals(false, Ejercicios.hay_mayor_tira(new char[]{}, 'a'));
        assertEquals(false, Ejercicios.hay_mayor_tira(new char[]{'a'}, 'a'));
        assertEquals(true, Ejercicios.hay_mayor_tira(new char[]{'b'}, 'a'));

    }

    

}
