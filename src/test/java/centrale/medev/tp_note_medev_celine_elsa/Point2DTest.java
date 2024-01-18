/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package centrale.medev.tp_note_medev_celine_elsa;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Céline
 */
public class Point2DTest {
    
    public Point2DTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getX method, of class Point2D.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Point2D instance = new Point2D(2,3);
        int expResult = 2;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getY method, of class Point2D.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Point2D instance = new Point2D(2,3);
        int expResult = 3;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of setX method, of class Point2D.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        Point2D instance = new Point2D(2,3);
        instance.setX(x);
        assertEquals(x, instance.getX());
    }

    /**
     * Test of setY method, of class Point2D.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        Point2D instance = new Point2D(2,3);
        instance.setY(y);
        assertEquals(y, instance.getY());
    }

    /**
     * Test of affiche method, of class Point2D.
     */
    /**
    @Test
    public void testAffiche() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Point2D instance = new Point2D(4,5);
        instance.affiche();
        System.setOut(System.out);
        assertEquals(" - Position : [4;5]", outContent.toString());
    }**/

    /**
     * Test of translate method, of class Point2D.
     */
    @Test
    public void testTranslate() {
        System.out.println("translate");
        int dx = 1;
        int dy = 2;
        Point2D instance = new Point2D(4,5);
        instance.translate(dx, dy);
        Point2D result = new Point2D(5,7);
        assertEquals(result.getX(), instance.getX());
        assertEquals(result.getY(), instance.getY());
    }

    /**
     * Test of setPosition method, of class Point2D.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        int x = 5;
        int y = 4;
        Point2D instance = new Point2D(2,3);
        instance.setPosition(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Point2D.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Point2D p = new Point2D(4,5);
        Point2D instance1 = new Point2D(2,3);
        Point2D instance2 = new Point2D(4,5);
        boolean expResult1 = false;
        boolean expResult2 = true;
        boolean result1 = instance1.equals(p);
        boolean result2 = instance2.equals(p);
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
    }

 
}
