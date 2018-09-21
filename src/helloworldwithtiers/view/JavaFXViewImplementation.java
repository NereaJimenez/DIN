/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.view;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Nerea Jimenez
 */
public class JavaFXViewImplementation extends javafx.application.Application implements View {

    private String greeting;
    
    public void setGreeting(String greeting){
        this.greeting=greeting;
    }
    
    @Override
    public void showGreeting(String greeting) {
    
        launch(greeting);
        
    }

     @Override
    public void init(){
        Application.Parameters p = getParameters();
        List <String> lista = p.getRaw();
        greeting = lista.get(0);
       //this.greeting=getParameters().getRaw().get(0);
   }
    
    @Override
    public void start(Stage stage) {
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
            Parent root = loader.load(); //Carga el archivo fxml donde está definida la vista
            FXMLDocumentController controller = loader.getController();
            
            controller.setGreeting(greeting);
            Scene scene = new Scene(root); // Necesitamos un objeto Scene (ya tenemos un objeto Stage)
            
            stage.setScene(scene); //cargamos la escena en el escenario
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
  
}
