
package Modelo;


public class ListaAliados {
    
    private NodoAliados inicio;
    private int Size;
    
    public void ListaAliados(){
        inicio = null;
        Size = 0;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    
    public int getTamanio(){
        return Size;
    }

    public NodoAliados getInicio() {
        return inicio;
    }

    public int getSize() {
        return Size;
    }
    
    
    
    public void agregarAlFinal(Aliados valor){
        
        NodoAliados nuevo = new NodoAliados();
        nuevo.setValor(valor);
        
        if (esVacia()) {
            
            inicio = nuevo;
            
        } else{
            
            NodoAliados aux = inicio;
            
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }   
            aux.setSiguiente(nuevo);
        }
        Size++;
    }
    
      
    public void agregarAlInicio(Aliados valor){

        NodoAliados nuevo = new NodoAliados();
        nuevo.setValor(valor);
      
        if (esVacia()) {
            
            inicio = nuevo;
        
        } else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        Size++;
    }
    

    
    public void insrtarPorPosicion(int posicion, Aliados valor){
       
        if(posicion>=0 && posicion<=Size){
            NodoAliados nuevo = new NodoAliados();
            nuevo.setValor(valor);
            
            if(posicion == 0){
                
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
            }
            else{
                
                if(posicion == Size){
                    NodoAliados aux = inicio;
                    
                    while(aux.getSiguiente() != null){
                        aux = aux.getSiguiente();
                    }
                    
                    aux.setSiguiente(nuevo);              
                }
                else{
                    
                    NodoAliados aux = inicio;
                    
                    for (int i = 0; i < (posicion-1); i++) {
                        aux = aux.getSiguiente();
                    }
                    
                    NodoAliados siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
            }
            
            Size++;
        }
    }
    
    public Aliados getValor(int posicion) throws Exception{
        
        if(posicion>=0 && posicion<Size){
            
            if (posicion == 0) {
               
                return inicio.getValor();
            }else{
                
                NodoAliados aux = inicio;
                
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
                
                NodoAliados aux = inicio;
                
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSiguiente();
                }
                
                NodoAliados siguiente = aux.getSiguiente();
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
            
            NodoAliados aux = inicio;
            
            int i = 0;
           
            while(aux != null){
                
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");        
                aux = aux.getSiguiente();
                i++;
            }
        }
    }
}
