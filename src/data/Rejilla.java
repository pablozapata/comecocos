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

/*Clase que contiene el mapa del laberinto del comecocos.
*/
public class Rejilla {
    
    private final int altura;
    private final int anchura;
    private char[][] laberinto;
    
    /**Constructor para inicializar los valores altura y anchura 
     * del mapa del laberinto.
     * 
     */
    public Rejilla(){
        altura = 31;
        anchura = 28;
        
        laberinto = new char[altura][anchura];
        laberinto = lecturaMapa();
    }
    
    private final static String rejillaInicial[]={
        "BBBBBBBBBBBBBBBBBBBBBBBBBBBB",
        "B............BB............B",
        "B.BBBB.BBBBB.BB.BBBBB.BBBB.B",
        "BoBBBB.BBBBB.BB.BBBBB.BBBBoB",
        "B.BBBB.BBBBB.BB.BBBBB.BBBB.B",
        "B..........................B",
        "B.BBBB.BB.BBBBBBBB.BB.BBBB.B",
        "B.BBBB.BB.BBBBBBBB.BB.BBBB.B",
        "B......BB....BB....BB......B",
        "BBBBBB.BBBBB BB BBBBB.BBBBBB",
        "     B.BBBBB BB BBBBB.B     ",
        "     B.BB          BB.B     ",
        "     B.BB BBBPPBBB BB.B     ",
        "BBBBBB.BB B      B BB.BBBBBB",
        "      .   B      B   .      ",
        "BBBBBB.BB B      B BB.BBBBBB",
        "     B.BB BBBBBBBB BB.B     ",
        "     B.BB          BB.B     ",
        "     B.BB BBBBBBBB BB.B     ",
        "BBBBBB.BB BBBBBBBB BB.BBBBBB",
        "B............BB............B",
        "B.BBBB.BBBBB.BB.BBBBB.BBBB.B",
        "B.BBBB.BBBBB.BB.BBBBB.BBBB.B",
        "Bo..BB................BB..oB",
        "BBB.BB.BB.BBBBBBBB.BB.BB.BBB",
        "BBB.BB.BB.BBBBBBBB.BB.BB.BBB",
        "B......BB....BB....BB......B",
        "B.BBBBBBBBBB.BB.BBBBBBBBBB.B",
        "B.BBBBBBBBBB.BB.BBBBBBBBBB.B",
        "B..........................B",
        "BBBBBBBBBBBBBBBBBBBBBBBBBBBB"
        };
    
    /*Clase con la que se lee el vector y lo convierte en una matriz para dibujar
    *el mapa.
    */
    private char[][] lecturaMapa(){
        for(int i=0; i<31; i++){
            for (int j=0; j<28; j++ ){
                laberinto[i][j]=rejillaInicial[i].charAt(j);
            }       
        }
    return laberinto;
    }
    /**Clase para devolver una celda pedida.
     * 
     * @param i - Posición en la fila de la matriz.
     * @param j - Posición en la columna de la matriz.
     * @return celda pedida.
     */
    public char getCelda(int i, int j){
        return laberinto[i][j];
    }
}
