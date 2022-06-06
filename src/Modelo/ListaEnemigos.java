
package Modelo;


public class ListaEnemigos {
    
    private NodoEnemigos inicio;
    private int Size;
    
    public void ListaEnemigos(){
        inicio = null;
        Size = 0;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    
    public int getTamanio(){
        return Size;
    }

    public NodoEnemigos getInicio() {
        return inicio;
    }

    public int getSize() {
        return Size;
    }
    
    
    
    public void agregarAlFinal(Enemigo valor){
        
        NodoEnemigos nuevo = new NodoEnemigos();
        nuevo.setValor(valor);
        
        if (esVacia()) {
            
            inicio = nuevo;
            
        } else{
            
            NodoEnemigos aux = inicio;
            
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }   
            aux.setSiguiente(nuevo);
        }
        Size++;
    }
    
      
    public void agregarAlInicio(Enemigo valor){

        NodoEnemigos nuevo = new NodoEnemigos();
        nuevo.setValor(valor);
      
        if (esVacia()) {
            
            inicio = nuevo;
        
        } else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        Size++;
    }
    

    
    public void insrtarPorPosicion(int posicion, Enemigo valor){
       
        if(posicion>=0 && posicion<=Size){
            NodoEnemigos nuevo = new NodoEnemigos();
            nuevo.setValor(valor);
            
            if(posicion == 0){
                
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
            }
            else{
                
                if(posicion == Size){
                    NodoEnemigos aux = inicio;
                    
                    while(aux.getSiguiente() != null){
                        aux = aux.getSiguiente();
                    }
                    
                    aux.setSiguiente(nuevo);              
                }
                else{
                    
                    NodoEnemigos aux = inicio;
                    
                    for (int i = 0; i < (posicion-1); i++) {
                        aux = aux.getSiguiente();
                    }
                    
                    NodoEnemigos siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
            }
            
            Size++;
        }
    }
    
    public Enemigo getValor(int posicion) throws Exception{
        
        if(posicion>=0 && posicion<Size){
            
            if (posicion == 0) {
               
                return inicio.getValor();
            }else{
                
                NodoEnemigos aux = inicio;
                
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                
                return aux.getValor();
            }
        
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }
    }
  
    
    public void removerPorPosicion(int posicion){
        
        if(posicion>=0 && posicion<Size){
            
            if(posicion == 0){
                
                inicio = inicio.getSiguiente();
            }
            
            else{
                
                NodoEnemigos aux = inicio;
                
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSiguiente();
                }
                
                NodoEnemigos siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            
            Size--;
        }
    }
    
    public void eliminar(){
        
        inicio = null;
        
        Size = 0;
    }
    
    public void listar(){
        
        if (!esVacia()) {
            
            NodoEnemigos aux = inicio;
            
            int i = 0;
           
            while(aux != null){
                
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");        
                aux = aux.getSiguiente();
                i++;
            }
        }
    }
}
