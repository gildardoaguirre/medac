/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoentornos;

/**
 *
 * @author Medac
 */
public class Tablero {
    
    private int id_partida;
	private int id_celda;
        private Celda [][] fila;

	public Tablero(int filas, int celdas) {
		fila = new Celda[celdas][filas];
                
	}

	/**
	 * 
	 * @param tamanio
	 */
	public void generarCeldas(int tamanio) {
		for (int i = 0; i < fila.length; i++){
                    for(int j = 0; j < fila.length; j++){
                        fila[i][j] = new Celda(); 
                    }
                }
	}

	public Celda[] getCeldas() {
		// TODO - implement Tablero.getCeldas
		throw new UnsupportedOperationException();
	}
    
}
