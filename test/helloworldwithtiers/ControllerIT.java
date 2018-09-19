/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers;

import helloworldwithtiers.view.ViewFactory;
import helloworldwithtiers.view.View;
import helloworldwithtiers.model.ModelFactory;
import helloworldwithtiers.model.Model;
import helloworldwithtiers.controller.Controller;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ControllerIT {
    
   private final PrintStream systemOut = System.out;
   private ByteArrayOutputStream testOut;
    
    @Before
    public void setUp() {
        
        testOut= new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }
    
    @After
    public void tearDown() {
         System.setOut(systemOut);
    }

    /**
     * Test of run method, of class Controller.
     */
    @Test
    public void testRun() {
       
        Model model = ModelFactory.getModel();
        String greeting = model.getGreeting();
        View view = ViewFactory.getView();
        //view.showGreeting(greeting);
        Controller cont = new Controller();
        cont.run(model, view);
        
        
        assertEquals("",greeting,testOut.toString());
    }
}
