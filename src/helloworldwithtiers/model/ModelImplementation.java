/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.model;

import helloworldwithtiers.model.Model;

/**
 *
 * @author Nerea Jimenez
 */
public class ModelImplementation implements Model {
    
    @Override
    public String getGreeting(){ //definición de método
        String greeting= "Hello World!!!!!!";
        return greeting;
    }
}
