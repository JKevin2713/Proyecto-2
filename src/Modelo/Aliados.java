
package Modelo;

import Factory.NPC;
import Observer.Observer;
import java.util.Random;


public class Aliados implements NPC,Observer{
    private int x;
    private int y;
    private boolean eliminado;
    private boolean visible;
    
    Random rn = new Random();
    public Aliados(){
        this.visible = false;
        this.x = 100+rn.nextInt(700);
        this.y = 100+rn.nextInt(700);
        this.eliminado = false;
    }


    @Override
    public String Tipo() {
        return "Aliados";
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int gety() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    @Override
    public boolean isEliminado() {
        return eliminado;
    }

    @Override
    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    
    @Override
    public void update(Personaje personaje) {
        if(personaje.getX() < this.x+60 && personaje.getX() > this.x-60 && personaje.getY() < this.y+60 && personaje.getY() > this.y-60){
            this.setVisible(true);
            if(personaje.getX() < this.x+20 && personaje.getX() > this.x-20 && personaje.getY() < this.y+20 && personaje.getY() > this.y-20){
                if(personaje.getVida() < 10){
                personaje.setVida(personaje.getVida()+1);
                this.setEliminado(true);
                }
            }   
        }else{
            this.setVisible(false);
        }
    }
    
    
      
}
