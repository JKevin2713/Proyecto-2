
package Modelo;

import Factory.NPC;
import Observer.Observer;
import java.util.Random;


public class Enemigo implements NPC, Observer{
    
    private int x;
    private int y;
    private int vida;
    private boolean eliminado;
    private boolean ataque;
    Random rn = new Random();
    
    //Constructor
    public Enemigo() {
        this.vida = 10;
        this.x = 100+rn.nextInt(700);
        this.y = 100+rn.nextInt(700);
        this.eliminado = false;
        this.ataque = false;
    }
    
    void Moverse(int Direccion){
        
        switch(Direccion){
            case 0:
                if(this.x > 10){
                    x = x - 1;
                }
               break;
            case 1:
                x = x + 1;
                break;
            case 2:
                if(this.y > 30){
                    y = y - 1;
                }
                break;
            case 3:
                y = y + 1;
            default:
                break;
        }
    }
    
    @Override
    public String Tipo() {
        return "Enemigo";
    }

    @Override
    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int gety() {
        return this.y;
    }

    @Override
    public boolean isEliminado() {
        return eliminado;
    }

    @Override
    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isAtaque() {
        return ataque;
    }

    public void setAtaque(boolean ataque) {
        this.ataque = ataque;
    }
    
    
    
    @Override
    public void update(Personaje personaje)
    {
        if(this.x < personaje.getX()){
            Moverse(1);
        }else if (this.x > personaje.getX()){
            Moverse(0);
        }
        if(this.y < personaje.getY()){
            Moverse(3);
        }else if(this.y > personaje.getY()){
            Moverse(2);
        }
        if(personaje.getX() < this.x+15 && personaje.getX() > this.x-15 && personaje.getY() < this.y+15 && personaje.getY() > this.y-15){
            if(this.isAtaque() == false){
                personaje.setVida(personaje.getVida()-1);
                this.setAtaque(true);
            }
       }   
    }
}
