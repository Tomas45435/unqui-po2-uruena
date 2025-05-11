package ar.edu.unq.po2.tp7.Cultivos;

import java.util.List;

public class Soja implements BaseParcela {
	
	@Override
	public Double getGananciaSoja() {
		return  500d;
	}
	
	@Override
	public Double getGananciaTrigo() {
		return  0d;
	}
	
	@Override
	public int cantidadSubdiviciones() {
		return 1;
	}

}
