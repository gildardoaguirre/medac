/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoentornos;

/**
 *
 * @author Medac
 */
public class Imagen {
    
    private String url;
	private int id_imagen;

	public Imagen() {
		// TODO - implement Imagen.Imagen
		throw new UnsupportedOperationException();
	}

	public String getUrl() {
		return this.url;
	}

	/**
	 * 
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	public int getId_imagen() {
		return this.id_imagen;
	}

	/**
	 * 
	 * @param id_imagen
	 */
	public void setId_imagen(int id_imagen) {
		this.id_imagen = id_imagen;
	}
}
