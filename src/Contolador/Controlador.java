
package Contolador;

import Factory.Factory;
import Factory.NPC;
import Modelo.Aliados;
import Modelo.Enemigo;
import Modelo.ListaAliados;
import Modelo.ListaEnemigos;
import Modelo.NodoAliados;
import Modelo.NodoEnemigos;
import Modelo.Personaje;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Controlador extends JPanel implements ActionListener{
    
    Personaje personaje = new Personaje();
    Timer timer = new Timer(5,this);
    boolean bandera = false;
    ListaEnemigos listaE;
    ListaAliados listaA;
    
    public Controlador()
    {
        setBackground(Color.GREEN);
        addKeyListener(new teclado());
        setFocusable(true);
        listaE = new ListaEnemigos();
        listaA = new ListaAliados();
        timer.start();
        
    }
    
    public void crearEnemigos(){
        for(int i = 0; i <= 5; i++){
            NPC enemigo = Factory.Fabricar("Enemigo");
            listaE.agregarAlFinal((Enemigo) enemigo);
        }
    }
    
    public void crearAlidos(){
        for(int i = 0; i <= 5; i++){
            NPC aliados = Factory.Fabricar("Aliados");
            listaA.agregarAlFinal((Aliados) aliados);
        }
    }
    
    public void crearNuevoEnemigo(){
        NPC enemigo = Factory.Fabricar("Enemigo");
        listaE.agregarAlFinal((Enemigo) enemigo);
    }
    
    @Override
    public void paint(Graphics g)
    { 
        
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        Toolkit t = Toolkit.getDefaultToolkit();
        Image enemigo = t.getImage("src/Imagenes/Enemigo.png");
        Image aliado = t.getImage("src/Imagenes/Aliado.png");
        Image vida = t.getImage("src/Imagenes/Puntos de vida.png");
        
        g2.drawImage(personaje.getImagen(), personaje.getX(), personaje.getY(),30, 30, null);
        
        switch (personaje.getVida()) {
            case 10:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                g2.drawImage(vida, 940, 0, 20, 20, this);
                g2.drawImage(vida, 920, 0, 20, 20, this);
                g2.drawImage(vida, 900, 0, 20, 20, this);
                g2.drawImage(vida, 880, 0, 20, 20, this);
                g2.drawImage(vida, 860, 0, 20, 20, this);
                g2.drawImage(vida, 840, 0, 20, 20, this);
                g2.drawImage(vida, 820, 0, 20, 20, this);
                g2.drawImage(vida, 800, 0, 20, 20, this);
                g2.drawImage(vida, 780, 0, 20, 20, this);
                break;
            case 9:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                g2.drawImage(vida, 940, 0, 20, 20, this);
                g2.drawImage(vida, 920, 0, 20, 20, this);
                g2.drawImage(vida, 900, 0, 20, 20, this);
                g2.drawImage(vida, 880, 0, 20, 20, this);
                g2.drawImage(vida, 860, 0, 20, 20, this);
                g2.drawImage(vida, 840, 0, 20, 20, this);
                g2.drawImage(vida, 820, 0, 20, 20, this);
                g2.drawImage(vida, 800, 0, 20, 20, this);
                break;
            case 8:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                g2.drawImage(vida, 940, 0, 20, 20, this);
                g2.drawImage(vida, 920, 0, 20, 20, this);
                g2.drawImage(vida, 900, 0, 20, 20, this);
                g2.drawImage(vida, 880, 0, 20, 20, this);
                g2.drawImage(vida, 860, 0, 20, 20, this);
                g2.drawImage(vida, 840, 0, 20, 20, this);
                g2.drawImage(vida, 820, 0, 20, 20, this);
                break;
            case 7:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                g2.drawImage(vida, 940, 0, 20, 20, this);
                g2.drawImage(vida, 920, 0, 20, 20, this);
                g2.drawImage(vida, 900, 0, 20, 20, this);
                g2.drawImage(vida, 880, 0, 20, 20, this);
                g2.drawImage(vida, 860, 0, 20, 20, this);
                g2.drawImage(vida, 840, 0, 20, 20, this);
                break;
            case 6:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                g2.drawImage(vida, 940, 0, 20, 20, this);
                g2.drawImage(vida, 920, 0, 20, 20, this);
                g2.drawImage(vida, 900, 0, 20, 20, this);
                g2.drawImage(vida, 880, 0, 20, 20, this);
                g2.drawImage(vida, 860, 0, 20, 20, this);
                break;
            case 5:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                g2.drawImage(vida, 940, 0, 20, 20, this);
                g2.drawImage(vida, 920, 0, 20, 20, this);
                g2.drawImage(vida, 900, 0, 20, 20, this);
                g2.drawImage(vida, 880, 0, 20, 20, this);
                break;
            case 4:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                g2.drawImage(vida, 940, 0, 20, 20, this);
                g2.drawImage(vida, 920, 0, 20, 20, this);
                g2.drawImage(vida, 900, 0, 20, 20, this);
                break;
            case 3:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                g2.drawImage(vida, 940, 0, 20, 20, this);
                g2.drawImage(vida, 920, 0, 20, 20, this);
                break;
            case 2:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                g2.drawImage(vida, 940, 0, 20, 20, this);
                break;
            case 1:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                break;
            default:
                break;
        }

        if(listaE != null){
            NodoEnemigos auxE = listaE.getInicio();
            int cont1 = 0;
            while(auxE != null) 
            {
                g2.drawImage(enemigo, auxE.getValor().getX(),auxE.getValor().gety(),20,20, this);
                if(auxE.getValor().isEliminado() == true){
                    listaE.removerPorPosicion(cont1);
                }
                auxE = auxE.getSiguiente();
                cont1++;
            }
            cont1 = 0;
        }

        if(listaA != null){
            NodoAliados auxA = listaA.getInicio();
            int cont2 = 0;
            while(auxA != null){
                if(auxA.getValor().isVisible() == true){
                    g2.drawImage(aliado, auxA.getValor().getX(), auxA.getValor().gety(), 45, 45, this);
                }
                if(auxA.getValor().isEliminado() == true){
                    listaA.removerPorPosicion(cont2);
                }
                auxA = auxA.getSiguiente();
                cont2++;
            }
            cont2 = 0;
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(personaje.getVida() <= 0){
            personaje.setEliminado(true);
        }
        
        if(personaje.isEliminado() == false){
            personaje.Moverse();
            repaint();
        }else{
            JOptionPane.showMessageDialog(null,"Game over, la vida de tu personaje llego a 0");
            System.exit(-1);
        }
        
    }
    
    private class teclado extends KeyAdapter
    {
        
        @Override
        public void keyPressed(KeyEvent e)
        {
            
            Random rn = new Random();
            int random;
            random = rn.nextInt(2)+0;
            int key = e.getKeyCode();
            if(random == 1 && listaE.getSize() < 6){
                crearNuevoEnemigo();
            }
            
            if(key == KeyEvent.VK_ENTER){
                personaje.atacar(listaE);
            }
            if(key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN || key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_LEFT){
                personaje.keyPressed(e);
                personaje.notificar(listaE,listaA, personaje);
            }    
        }
        
        @Override
        public void keyReleased(KeyEvent e)
        {
            personaje.keyReleased(e);
        }
    }
}
