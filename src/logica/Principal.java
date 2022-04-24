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
public class Principal {
    public static void main(String[] args) {
        ArbolBinario raiz = new ArbolBinario();
        try{
            raiz.insertar(18);
            raiz.insertar(14);
            raiz.insertar(36);
            raiz.inOrden();
            raiz.preOrden();
            raiz.posOrden();
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }
}
