package ar.edu.davinci.domain;

public interface Matematica {

	Double precioVenta();

	public static Double sumarPorcentaje(Double valor, Double porcentaje) {
		Double resultado = 0.0;
		Double delta = (valor.doubleValue() * porcentaje.doubleValue() / 100);
		resultado = valor + delta;
		return resultado;
	}
}
