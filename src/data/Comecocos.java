/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Jose Ignacio
 */
public class Comecocos {
    
    public static final char IZQUIERDA = 'L';
    public static final char DERECHA = 'R';
    public static final char ARRIBA = 'U';
    public static final char ABAJO = 'D';
    
    public static final int PARADO = 0;
    public static final int MOVIMIENTO = 1;
    public static final int CHOQUE = 2;
    public static final int COME_PPEQUE = 3;
    public static final int COME_PGRAN = 4;
    
    private int fila;
    private int columna;
    private int direccion;
    
    /**Constructor del comecocos, el cual lo sitúa en una posicion y con una
     * dirección determinada.
     * @param i - fila en la que se situa.
     * @param j - columna en la que se situa.
     * @param dir - dirección hacia la que se dispone.
     */
    public Comecocos(int i, int j){
        this.fila = i;
        this.columna = j;
        
    }
    
    /*Clase para situar al comecocos en el laberinto.
    */
    public void inicioComecocos(){
        this.fila = 15;
        this.columna = 4;
        this.direccion = Comecocos.PARADO;
    }
}
