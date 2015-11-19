/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author USUARIO
 */
public class Nodo {
    private int valor;
    
    private Nodo padre;
    private Nodo hojaIzquierda;
    private Nodo hojaDerecha;
    
    public Nodo(int valor){
        this.valor = valor;
    }
    public void setValor(int Valor){
        this.valor = valor;
    }
    public void getValor(int Valor){
        this.valor = valor;
    }
    public Nodo getPadre(){
        return padre;
    }
    public Nodo setpadre(){
        return padre;
    }
    public Nodo gethojaIzquierda(){
        return hojaIzquierda;
    }
    public Nodo sethojaIzquierda(){
        return hojaIzquierda;
    }
    public Nodo gethojaDerecha(){
        return hojaDerecha;
    }
    public Nodo sethojaDerecha(){
        return hojaDerecha;
    }

    boolean getValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getHojaIzquierda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setHojaIzquierda(Nodo nodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getHojaDerecha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setHojaDerecha(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}