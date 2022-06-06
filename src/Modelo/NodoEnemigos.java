/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class NodoEnemigos {
    // Variable en la cual se va a guardar el valor.
    private Enemigo enemigo;
    // Variable para enlazar los nodos.
    private NodoEnemigos siguiente;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void NodoEnemigos(){
        this.enemigo = null;
        
        this.siguiente = null;
    }
    
    
    
    public Enemigo getValor() {
        return enemigo;
    }

    public void setValor(Enemigo valor) {
        this.enemigo = valor;
    }

    public NodoEnemigos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEnemigos siguiente) {
        this.siguiente = siguiente;
    }   
    
}
