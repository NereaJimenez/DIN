/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.view;

import helloworldwithtiers.view.SwingViewImplementation;
import helloworldwithtiers.view.View;

/**
 *
 * @author Nerea Jimenez
 */
public class ViewFactory {
    
    public static View getView(){
        return new SwingViewImplementation();
    }
}
