package ar.edu.davinci.domain;

public class ServicioReparacion extends Servicio {

	private Dificultad nivelDificultad;

	public ServicioReparacion(String nombre) {
		super(nombre, 180.0);
	}

	public Dificultad getNivelDificultad() {
		return nivelDificultad;
	}

	public void setNivelDificultad(Dificultad nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}

	@Override
	public Double precioVenta() {
		Double resultado = null;

		resultado = this.getCantidadHoras() * this.getPrecioLista() * precioPorDificultad();	

		return resultado;
	}

	public Double precioPorDificultad() {
		Double resultado = null;
		if (this.nivelDificultad.getNivelDificultad() > 3) {
			resultado = 1.25;
		} else {
			resultado = 1.0;
		}
		return resultado;
	}

}
