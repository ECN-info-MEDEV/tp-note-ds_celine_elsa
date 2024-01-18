/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package centrale.medev.tp_note_medev_celine_elsa;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elsaa
 */
public class BateauTest {
    
    public BateauTest() {
    }


    /**
     * Test of verifCoule method, of class Bateau.
     */
    @Test
    public void testVerifCoule() {
        System.out.println("verifCoule");
        Point2D o= new Point2D(0,0);
        Bateau instance = new Bateau("bateau","ba", 3,o ,true, true , new boolean[] {true,true,true});
        boolean expResult = true;
        boolean result = instance.verifCoule();
        assertEquals(expResult, result);
        
    }
    
}
