
package Observer;

import Modelo.ListaAliados;
import Modelo.ListaEnemigos;
import Modelo.Personaje;


public interface Observable { // Personaje
    
    public void notificar(ListaEnemigos lista, ListaAliados listaA, Personaje personaje); //Notifica cuando se mueve
    
}
