package ar.edu.davinci.domain;

import java.util.Objects;

public abstract class Producto implements Matematica {

	protected String nombre;
	protected Double precioLista;
	protected static final Double IVA = 1.21;

	protected Producto(String nombre, Double precioLista) {

		this.nombre = nombre;
		this.precioLista = precioLista;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected Double getPrecioLista() {
		return precioLista;
	}

	protected void setPrecioLista(Double precioLista) {
		this.precioLista = precioLista;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

}
