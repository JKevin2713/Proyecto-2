
package Factory;

import Modelo.Aliados;
import Modelo.Enemigo;


public class Factory {
    
    public static NPC Fabricar(String tipo){
        
        switch(tipo){
            case "Enemigo":
                return new Enemigo();
            case "Aliados":
                return new Aliados();
            default:
                return null;
        }
    }
}
