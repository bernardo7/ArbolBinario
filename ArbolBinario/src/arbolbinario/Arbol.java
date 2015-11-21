/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author Gerson
 */
import java.util.Scanner;

public class Arbol {

    private Nodo raiz;

    public Arbol() {
 
    }
 
    public Arbol( int valor ) {
        this.raiz = new Nodo( valor );
    }
 
    public Arbol( Nodo raiz ) {
        this.raiz = raiz;
    }
 
   
    public Nodo getRaiz() {
        return raiz;
    }
 
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
 
    
    private void addNodo( Nodo nodo, Nodo raiz ) {
        
      
        if ( raiz == null ) {
           
            raiz = nodo;
        }
        else {
           
            if ( nodo.getValor() <= raiz.getValor() ) {
                
                addNodo( nodo , raiz.getHojaIzquierda() );
                
            }
            else {
                
                addNodo( nodo, raiz.getHojaDerecha() );
            }
        }
    }
 
    public void addNodo( Nodo nodo ) {
        
        this.addNodo( nodo , this.raiz );
    }
 
    public boolean removeNodo( Nodo nodo ) {
 
        boolean tieneNodoDerecha = nodo.getHojaDerecha() != null ? true : false;
        boolean tieneNodoIzquierda = nodo.getHojaIzquierda() != null ? true : false;
 
        
        if (!tieneNodoDerecha && !tieneNodoIzquierda) {
            return removeNodoCaso1( nodo );
        }
 
        
        if ( tieneNodoDerecha && !tieneNodoIzquierda ) {
            return removeNodoCaso2( nodo );
        }
 
        
        if ( !tieneNodoDerecha && tieneNodoIzquierda ) {
            return removeNodoCaso2( nodo );
        }
 
        
        if ( tieneNodoDerecha && tieneNodoIzquierda ) {
            return removeNodoCaso3( nodo );
        }
 
        return false;
    }
 
    private boolean removeNodoCaso1( Nodo nodo ) {
        
        Nodo hijoIzquierdo = nodo.getPadre().getHojaIzquierda();
        Nodo hijoDerecho =  nodo.getPadre().getHojaDerecha();
 
        if ( hijoIzquierdo == nodo ) {
            nodo.getPadre().setHojaIzquierda( null );
            return true;
        }
 
        if ( hijoDerecho == nodo) {
            nodo.getPadre().setHojaDerecha( null );
            return true;
        }
 
        return false;
    }
    
   private boolean removeNodoCaso2( Nodo nodo ) {
       
        Nodo hijoIzquierdo = nodo.getPadre().getHojaIzquierda();
        Nodo hijoDerecho = nodo.getPadre().getHojaDerecha();
 
        
        Nodo hijoActual = nodo.getHojaIzquierda() != null ? 
                nodo.getHojaIzquierda() : nodo.getHojaDerecha();
 
        if ( hijoIzquierdo == nodo ) {
            nodo.getPadre().setHojaIzquierda( hijoActual );
 
            
            hijoActual.setPadre(nodo.getPadre());
            nodo.setHojaDerecha(null);
            nodo.setHojaIzquierda(null);
 
            return true;
        }
 
        if ( hijoDerecho == nodo) {
            nodo.getPadre().setHojaDerecha( hijoActual );
 
            
            hijoActual.setPadre(nodo.getPadre());
            nodo.setHojaDerecha(null);
            nodo.setHojaIzquierda(null);
 
            return true;
        } 
 
        return false;
    }
    private boolean removeNodoCaso3( Nodo nodo ) {
       
        Nodo nodoMasALaIzquierda = recorrerIzquierda( nodo.getHojaDerecha() );
        if ( nodoMasALaIzquierda != null ) {
            
            nodo.setValor( nodoMasALaIzquierda.getValor() );
            
            removeNodo( nodoMasALaIzquierda );
            return true;
        }
        return false;
    }
 
   
    private Nodo recorrerIzquierda(Nodo nodo) {
        if (nodo.getHojaIzquierda() != null) {
            return recorrerIzquierda( nodo.getHojaIzquierda() );
        }
        return nodo;
    }
    void preorden(Nodo nodo){
        if(nodo!=null)
        {
            System.out.print(nodo.Padre);
            preorden(nodo.hojaIzquierda());
            preorden(nodo.hojaDerecha());
        }
    }
    void inorden(Nodo nodo){
        if(nodo!=null)
        {
            System.out.print(nodo.hojaIzquierda);
            inorden (nodo.padre);
            inorden (nodo.hojaDerecha);
        }
    }
    void postorden(Nodo nodo){
        if(nodo!=null)
        {
            System.out.print(nodo.hojaIzquierda);
            postorden (nodo.hojaDerecha);
            postorden (nodo.padre);
        }
    }
    
}
