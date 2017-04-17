package main;


import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 * Clase controladora del panel principal de empleado
* @author Bernat Montoro, Sergio Martínez, Laura Bujalance
 */
public class MainviewControllerWorker implements Initializable {
    /**
     * Mensaje de bienvenida
     */
      @FXML private Label  sessionLabelEmpleado;
      /**
       * botón de cerrar sesión
       */
      @FXML private Button logoutButton;
      /**
       * Area de texto para los clientes creados
       */
      @FXML private TextArea usersCreated;
      /**
       * campo de texto con el nombre del cliente a crear
       */
      @FXML private TextField crearNombre;
      /**
       * campo de texto con el apellido del cliente a crear
       */
      @FXML private TextField crearApellidos;
            /**
       * campo de texto con la edad del cliente a crear
       */
      @FXML private TextField crearEdad;
            /**
       * campo de texto con el teléfono del cliente a crear
       */
      @FXML private TextField crearTelefono;
            /**
       * campo de texto con la contraseña del cliente a crear
       */
      @FXML private TextField crearContrasena;
            /**
       * campo de texto con el nif del cliente a crear
       */
      @FXML private TextField crearNif;
      /**
       * botón para crear un cliente
       */
      @FXML private Button crearUsuario;
      /**
       * tabla informativa de los clientes de la entidad
       */
      /**
       * botón para inciar el modo fiesta
       */
      @FXML private Button workerMainFiesta;
      /**
       * mensaje informativo sobre el cliente seleccionado
       */
      @FXML private Label infoCliente;
      /**
       * botón para dar de baja a un cliente
       */
      @FXML private Button eliminarCliente;
      /**
       * campo de texto con el nif del cliente a dar de baja
       */
      @FXML private TextField nifEliminar;
      /**
       * mensaje informativo sobre la dada de baja de un cliente
       */
      @FXML private Label mensajeEliminar;
       /**
        * campo de texto para comparar usuarios
        */
      @FXML private TextField compateTOuser1;   
             /**
        * campo de texto para comparar usuarios
        */
      @FXML private TextField compateTOuser2;
      /**
       * botón para confirmar la comparación de usuarios
       */
      @FXML private Button compateTOuserButton;
      /**
       * mensaje resultante de la comparación de usuarios
       */
      @FXML private Label compateToUserMessage;
      /**
       * campo de texto para comparar cuentas
       */
      @FXML private TextField compareToCuenta1;
            /**
       * campo de texto para comparar cuentas
       */
      @FXML private TextField compareToCuenta2;
            /**
       * botón para confirmar la comparación de cuentas
       */
      @FXML private Button compareToCuentaButton;
      /**
       * mensaje resultante de la comparación de cuentas
       */
      @FXML private Label compareToCuentaMessage;
      
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    /**
     * Método principal que gestiona el panel de empleado
     * @param loginManager
     * @param sessionID 
     */
    public void initSessionID(final administrarLogin loginManager, String sessionID) {
        sessionLabelEmpleado.setText("Bienvenido " + sessionID);
        logoutButton.setOnAction((ActionEvent event) -> {
      
        loginManager.logout();
    });
    
  

//         pararFiesta.setOnAction((ActionEvent event) -> {
//
//                for(int z=0;z<Cliente.cuentas.numProductos();z++) {
//                    System.out.printf(Fecha.getFechaActual()+"-> Numero de cuenta: "+Cliente.cuentas.obtenerProducto(z).getNumeroCuenta()+" Saldo final: "+Cliente.cuentas.obtenerProducto(z).getSaldo()+"\n");
//                }
//            
//        });
         
         
       
         
        
  }    
}