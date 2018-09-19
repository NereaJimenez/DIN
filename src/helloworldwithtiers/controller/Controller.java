/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.controller;

import helloworldwithtiers.model.Model;
import helloworldwithtiers.model.Model;
import helloworldwithtiers.view.View;

/**
 *
 * @author Nerea Jiménez
 */
public class Controller {
    
    public void run(Model model, View view){
        String greeting = model.getGreeting();
        view.showGreeting(greeting);
    }
}
