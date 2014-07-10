/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicconnectivity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wolfgang Sanyer <wolfgang.sanyer@benefitfocus.com>
 */
public class QuickFindUFTest {
    
    public QuickFindUFTest() {
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

    /**
     * Test of connected method, of class QuickFindUF.
     */
    @Test
    public void testConnected() {
        System.out.println("connected");
        int p = 0;
        int q = 1;
        QuickFindUF instance = new QuickFindUF();
        boolean expResult = false;
        boolean result = instance.connected(p, q);
        assertEquals(expResult, result);
     }
    
}
