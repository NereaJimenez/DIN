/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.model;

import helloworldwithtiers.model.Model;

/**
 *
 * @author Nerea Jiménez
 */
public class ModelFactory {
    
    public static Model getModel(){
        
        return new ModelImplementation();
    }
}
