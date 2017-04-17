package main;

import login.Administracion;
import login.Empresa;

/**
 *
 * @author Sergio Martinez Mulero
 * @date 03-abr-2017
 */
public class Main {
    public static void main(String args[]) {
      Administracion admin1 = new Administracion("sergio","1234","1234dfdefe","Sergio","Comercial");
      Empresa emp1 = new Empresa("manolo","1234","123456","ElCaserio","Calle Falsa 123","Manolo");
      System.out.println("Administrador: "+admin1.toString()+"\n"
                        + "Empleado: "+emp1.toString());      
    }    
}
