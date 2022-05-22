package ar.edu.davinci.domain;

public abstract class Servicio extends Producto {

	private Double cantidadHoras;

	public Servicio(String nombre, Double precioLista) {
		super(nombre, precioLista);
	}

	public Double getCantidadHoras() {
		return cantidadHoras;
	}

	public void setCantidadHoras(Double cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}

}
