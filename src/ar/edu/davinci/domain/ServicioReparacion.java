package ar.edu.davinci.domain;

public class ServicioReparacion extends Servicio {

	private static final Double PRECIO_HORA = 180.0;
	private Dificultad nivelDificultad;

	public ServicioReparacion(String nombre, Double precioLista) {
		super(nombre, precioLista);
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
		
		return resultado;
	}

	public Double precioPorDificultad() {
		Double resultado = null;
		if(this.nivelDificultad.getNivelDificultad() > 3) {
			resultado = 1.25;
		}
		return resultado;
	}

}
