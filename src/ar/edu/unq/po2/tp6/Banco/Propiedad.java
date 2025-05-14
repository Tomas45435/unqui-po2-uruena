package ar.edu.unq.po2.tp6.Banco;

public class Propiedad implements Garantia {
	
	private String descripcion;
	private String direccion;
	private Double valorFiscal;
	
	public Propiedad(String descripcion, String direccion, Double valorFiscal) {
		this.setDescripcion(descripcion);
		this.setDireccion(direccion);
		this.setValorFiscal(valorFiscal);
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Double getValorFiscal() {
		return valorFiscal;
	}
	
	private void setValorFiscal(Double valorFiscal) {
		this.valorFiscal = valorFiscal;
	}
	
	
	
}
