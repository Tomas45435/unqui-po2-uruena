package ar.edu.unq.po2.tp7.Cultivos;

public class Trigo implements BaseParcela {
	
	@Override
	public Double getGananciaSoja() {
		return  0d;
	}
	
	@Override
	public Double getGananciaTrigo() {
		return  300d;
	}
	
	@Override
	public int cantidadSubdiviciones() {
		return 1;
	}
}
