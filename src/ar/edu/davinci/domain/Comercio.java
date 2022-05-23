package ar.edu.davinci.domain;

import java.util.ArrayList;
import java.util.List;

public class Comercio {

	private List<Producto> productos;
	private List<Producto> historial;
	private final int LIMITE_INSUMOS = 1000;
	private final int LIMITE_FACTURAS = 10000;

	public Comercio() {

		productos = new ArrayList<Producto>(LIMITE_INSUMOS);
		historial = new ArrayList<Producto>(LIMITE_FACTURAS);
	}

	public void crearInsumo(String nombre, Double precioLista, TipoInsumo tipo, Double porcentajeGanancia) {
		if (buscarProductoPorNombre(nombre) == null) {
			productos.add(new Insumo(nombre, precioLista, tipo, porcentajeGanancia));
			addOperacion(new Insumo(nombre, precioLista, tipo, porcentajeGanancia));
		} else {
			System.out.println("El insumo " + nombre + " ya existe.");
		}
	}

	public void crearServicioArmado(String nombre) {
		if (buscarProductoPorNombre(nombre) == null) {
			productos.add(new ServicioArmado(nombre));
			addOperacion(new ServicioArmado(nombre));
		} else {
			System.out.println("El servicio de armado " + nombre + " ya existe.");
		}
	}

	public void crearServicioReparacion(String nombre) {
		if (buscarProductoPorNombre(nombre) == null) {
			productos.add(new ServicioReparacion(nombre));
			addOperacion(new ServicioReparacion(nombre));
		} else {
			System.out.println("El servicio de reparación " + nombre + " ya existe.");
		}
	}

	public Producto buscarProductoPorNombre(String nombre) {
		Producto resultado = null;

		for (Producto producto : productos) {
			if (producto.getNombre().equalsIgnoreCase(nombre)) {
				resultado = producto;
			}
		}
		return resultado;
	}

	public void modificarPrecioLista(String nombre, Double precio) {
		buscarProductoPorNombre(nombre).setPrecioLista(precio);
		addOperacion(null);
	}

	public void addOperacion(Producto producto) {
		if (producto != null) {
			historial.add(producto);
		}else {
			System.out.println("No se pueden agregar productos nulos.");
		}
	}
}
