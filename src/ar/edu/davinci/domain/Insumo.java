package ar.edu.davinci.domain;

public class Insumo extends Producto {

	private Double porcentajeGanancia;
	private TipoInsumo tipoInsumo;

	public Insumo(String nombre, Double precioLista, TipoInsumo tipoInsumo, Double porcentajeGanacia) {
		super(nombre, precioLista);
		this.tipoInsumo = tipoInsumo;
		this.porcentajeGanancia = porcentajeGanacia;
	}

	protected TipoInsumo getTipoInsumo() {
		return tipoInsumo;
	}

	protected void setTipoInsumo(TipoInsumo tipoInsumo) {
		this.tipoInsumo = tipoInsumo;
	}

	protected Double getPorcentajeGanancia() {
		return porcentajeGanancia;
	}

	protected void setPorcentajeGanancia(Double porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}

	@Override
	public Double precioVenta() {
		Double resultado = null;
		resultado = this.precioLista * (this.porcentajeGanancia + 1);
		resultado = resultado * IVA;
		return resultado;
	}

}
