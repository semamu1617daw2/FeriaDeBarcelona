package main;

import java.io.IOException;
import java.util.logging.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;

/**
 * Clase administrar login
 * Clase encargada de cargar los paneles FX de la aplicación
 * @author Bernat Montoro, Sergio Martínez, Laura Bujalance
 */
public class administrarLogin {
    /**
     * escena 
     */
    private Scene scene;
    /**
     * Constructor
     * @param scene escena
     */
  public administrarLogin(Scene scene) {
    this.scene = scene;
  }
  /**
   * Método de autentificación de cliente
   * @param sessionID ID de la sesión
   */
  public void autentificacion(String sessionID) {
    pantallaPrincipal(sessionID);
  }
  /**
   * Método de autentificación de empleado
   * @param sessionID ID de la sesion
   */
  public void autentificacionEmpleado(String sessionID) {
    pantallaPrincipalEmpleado(sessionID);
  }
  /**
   * Método para cerrar sesión
   */
  public void logout() {
    pantallaInicial();
  }
    /**
     * Método que carga la pantalla de login inicial
     */
  public void pantallaInicial() {
    try {
      FXMLLoader loader = new FXMLLoader(
        getClass().getResource("Login.fxml")
      );
      scene.setRoot((Parent) loader.load());
      LoginController controller = loader.<LoginController>getController();
      controller.initManager(this);
    } catch (IOException ex) {
      Logger.getLogger(administrarLogin.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
    /**
     * Método que carga la pantalla principal de cliente
     * @param sessionID ID de sesión 
     */
    private void pantallaPrincipal(String sessionID) {
    try {
      FXMLLoader loader = new FXMLLoader(
        getClass().getResource("mainview.fxml")
      );
      scene.setRoot((Parent) loader.load());
      MainviewController controller = loader.<MainviewController>getController();
      controller.initSessionID(this, sessionID);
    } catch (IOException ex) {
      Logger.getLogger(administrarLogin.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
    /**
     * Método que carga la pantalla principal de empleado
     * @param sessionID ID de sesion
     */
    private void pantallaPrincipalEmpleado(String sessionID) {
    try {
      FXMLLoader loader2 = new FXMLLoader(
        getClass().getResource("mainview_worker.fxml")
      );
      scene.setRoot((Parent) loader2.load());
      MainviewControllerWorker controller2 = loader2.<MainviewControllerWorker>getController();
      controller2.initSessionID(this, sessionID);
    } catch (IOException ex) {
      Logger.getLogger(administrarLogin.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
}
