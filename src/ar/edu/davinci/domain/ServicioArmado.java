package ar.edu.davinci.domain;

public class ServicioArmado extends Servicio {

	public ServicioArmado(String nombre) {
		super(nombre, 250.0);
	}

	@Override
	public Double precioVenta() {
		Double resultado = null;

		resultado = this.cantidadHoras * this.precioLista;
		resultado = resultado * (IVA / 2);

		return resultado;
	}

}
