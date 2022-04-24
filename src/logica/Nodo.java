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
public class Nodo {
    private int dato;
    private Nodo izq;
    private Nodo der;

    public Nodo() {
    }

    public Nodo(int dato) {
        this.dato = dato;
        this.izq = null;
        this.der = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
    
    
    
    
}
