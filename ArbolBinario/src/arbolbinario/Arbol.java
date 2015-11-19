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
public class Arbol {
   private Nodo raiz;
    private int valor;
   public Arbol(int valor){
       this.raiz = new Nodo(valor);
   }
   public Arbol(Nodo raiz){
       this.raiz=raiz;
   }
   public Nodo getRaiz(){
       return raiz;
   }
   public void setRaiz(Nodo raiz){
       this.raiz=raiz;
   }

 private void addNodo(Nodo nodo, Nodo raiz){
   if(raiz==null){
       this.setRaiz(nodo);
}
   else{
       if(nodo.getValor()<= raiz.getValor()){
           if(raiz.getHojaIzquierda()==null ){
               raiz.setHojaIzquierda (nodo);
           }
           else{
               addNodo( nodo , raiz.gethojaIzquierda());
           }
       }
       else{
           addNodo( nodo, raiz.gethojaDerecha());
       }
   }
}


public void addNodo (Nodo nodo){
     this.addNodo(nodo, this.raiz);
}
public boolean removeNodo(Nodo nodo, boolean tieneNodoIzquierda){
   boolean tieneNodoDerecha = nodo.getHojaDerecha() != null ? true : false;
   boolean tieneNodaIzquierda = nodo.getHojaIzquierda() != null ? true : false;
       
   
   
   if(!tieneNodoDerecha && !tieneNodoIzquierda){
       return removeNodoCaso1(nodo);
   }
   
   if(!tieneNodoDerecha && !tieneNodoIzquierda){
       return removeNodoCaso2(nodo);
   }
   if(!tieneNodoDerecha && !tieneNodoIzquierda){
       return removeNodoCaso3 (nodo);
   }
   return false;

   
   
}
private boolean removeNodoCaso1(Nodo nodo){
  Nodo hijoIzquierdo = (Nodo) nodo.getPadre().getHojaIzquierda();
  Nodo hijoDerecho =  (Nodo) nodo.getPadre().getHojaDerecha();
  
  if(hijoIzquierdo==nodo){
      nodo.getPadre().setHojaIzquierda(null);
      return true;
  }
  if(hijoDerecho==nodo){
      nodo.getPadre().setHojaDerecha(null);
      return true;
  }
  return false;
}
private boolean removeNodoCaso2(Nodo nodo){
  Nodo hijoIzquierdo = (Nodo) nodo.getPadre().getHojaIzquierda();
  Nodo hijoDerecho =  (Nodo) nodo.getPadre().getHojaDerecha();
  
}



public static void main(String[]args){
    
}

}