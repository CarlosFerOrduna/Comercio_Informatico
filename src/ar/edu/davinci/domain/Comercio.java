package ar.edu.davinci.domain;

import java.util.ArrayList;
import java.util.List;

public class Comercio {

	private List<Producto> productos;
	private List<Factura> facturas;
	private final int LIMITE_INSUMOS = 1000;
	private final int LIMITE_FACTURAS = 10000;

	public Comercio() {

		productos = new ArrayList<Producto>(LIMITE_INSUMOS);
		facturas = new ArrayList<Factura>(LIMITE_FACTURAS);
	}

	public void crearInsumo() {

	}

	public void crearServicioArmado() {

	}

	public void crearServicioReparacion() {

	}

	public Producto buscarProductoPorNombre() {
		Producto resultado = null;

		return resultado;
	}

	public void modificarPrecioLista(String nombre, Double precio) {

	}

	public void crearFactura() {

	}
}
