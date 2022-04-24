/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Mauricio Castro
 */
public class ArbolBinario {
    private Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    public void insertar(int dato)throws Exception{
        raiz = insertarNodo(raiz, dato);
    }
    private Nodo insertarNodo(Nodo aux, int dato)throws Exception{
        if(aux == null){
            aux = new Nodo(dato);
        }else if(dato < raiz.getDato()){
            Nodo izq = insertarNodo(aux.getIzq(), dato);
            aux.setIzq(izq);
        }else if(dato > raiz.getDato()){
            Nodo der = insertarNodo(aux.getDer(), dato);
            aux.setDer(der);
        }else{
            throw new Exception("Dato duplicado");
        }
        return aux;
    }
    
    public void preOrden(){
        System.out.print("\nPre Orden: ");
        listarPreOrden(this.getRaiz());
    }
    private void listarPreOrden(Nodo aux){
        System.out.print(aux.getDato() + " ");
        if(aux.getIzq()!= null) listarPreOrden(aux.getIzq());
        if(aux.getDer()!= null) listarPreOrden(aux.getDer());
    }
    
    public void inOrden(){
        System.out.print("\nIn Orden: ");
        listarInOrden(this.getRaiz());
    }
    private void listarInOrden(Nodo aux){
        if(aux.getIzq()!= null) listarPreOrden(aux.getIzq());
        System.out.print(aux.getDato() + " ");
        if(aux.getDer()!= null) listarPreOrden(aux.getDer());
    }
    
    public void posOrden(){
        System.out.print("\nPos Orden: ");
        listarPosOrden(this.getRaiz());
    }
    private void listarPosOrden(Nodo aux){
        if(aux.getIzq()!= null) listarPreOrden(aux.getIzq());
        if(aux.getDer()!= null) listarPreOrden(aux.getDer());
        System.out.print(aux.getDato() + " ");
    }
    
    
}
