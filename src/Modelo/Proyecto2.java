
package Modelo;

import Contolador.Controlador;
import Vista.Mundo;

public class Proyecto2 {
    
    public static void main(String[] args) {
        
        Mundo vista = new Mundo();
        Controlador controller = new Controlador();
        controller.crearEnemigos();
        controller.crearAlidos();
        vista.add(controller);
        vista.setVisible(true);
    }
    
}
