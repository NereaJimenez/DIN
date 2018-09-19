/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package helloworldwithtiers.view;

import helloworldwithtiers.view.View;
import javax.swing.JOptionPane;

/**
 * Class for the Swing implementation of the HelloWorldWithTiers app.
 * @author Nerea Jimenez
 */
public class SwingViewImplementation  implements View{
    /**
     * Shows a greeting in a Message window.
     * @param greeting The greeting
     */
    @Override
    public void showGreeting(String greeting){
        JOptionPane.showMessageDialog(null,greeting);
    }
}
