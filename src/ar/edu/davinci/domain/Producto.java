package ar.edu.davinci.domain;

public abstract class Producto {

	private String nombre;
	private Double precioLista;

	public Producto(String nombre, Double precioLista) {

		this.nombre = nombre;
		this.precioLista = precioLista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecioLista() {
		return precioLista;
	}

	public void setPrecioLista(Double precioLista) {
		this.precioLista = precioLista;
	}

}
