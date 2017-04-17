package main;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Clase Login
 * Clase principal del proyecto encargada de lanzarlo
 * @author 
 */
public class Login extends Application {
     
  public static void main(String[] args) throws IOException{
   
    launch(args);  
  } 

  @Override 
  public void start(Stage stage) throws IOException {
    Scene scene = new Scene(new StackPane());
    
    administrarLogin admLogin = new administrarLogin(scene);
    admLogin.pantallaInicial();

    stage.setScene(scene);
    stage.show();
  }

}
