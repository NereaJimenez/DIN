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

/**
 * Esta es la clase aplicación para el Hola Mundo con capas.
 * @author Nerea Jiménez
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
               
        View view = ViewFactory.getView(); //Creamos la vista
        Model model = ModelFactory.getModel(); //Creamos el modelo
       
        Controller controller = new Controller(); 
        controller.run(model, view); //Le pasamos la vista y el modelo al mètodo run del Controlador
    }
    
}
