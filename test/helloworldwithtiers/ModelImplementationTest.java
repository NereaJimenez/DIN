/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers;

import helloworldwithtiers.model.ModelImplementation;
import helloworldwithtiers.model.Model;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ModelImplementationTest {
    
    private Model model;
    
    @Before
    public void setUp() {
        model = new ModelImplementation();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getGreeting method, of class ModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        
        /*System.out.println("getGreeting");
        ModelImplementation instance = new ModelImplementation();
        String expResult = "";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
        
        assertEquals("","Hello World",model.getGreeting());
    }
    
}
