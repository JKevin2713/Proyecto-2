
package Modelo;


public class NodoAliados {
    // Variable en la cual se va a guardar el valor.
    private Aliados aliados;
    // Variable para enlazar los nodos.
    private NodoAliados siguiente;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void NodoEnemigos(){
        this.aliados = null;
        
        this.siguiente = null;
    }
    
    
    
    public Aliados getValor() {
        return aliados;
    }

    public void setValor(Aliados valor) {
        this.aliados = valor;
    }

    public NodoAliados getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAliados siguiente) {
        this.siguiente = siguiente;
    }   
    
}
