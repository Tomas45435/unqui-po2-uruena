package ar.edu.unq.po2.tp7.Cultivos;

import java.util.ArrayList;
import java.util.List;

public class ParcelaMixta implements BaseParcela{
	
	private List<BaseParcela> parcelas;
	
	public ParcelaMixta() {
		this.parcelas = new ArrayList<>();
	}
	
	public List<BaseParcela> getParcelas() {
		return parcelas;
	}

	public void agregarParcela(BaseParcela parcela) {
		if (parcelas.size() < 4) {
			parcelas.add(parcela);
		} else {
			throw new IllegalStateException("Una parcela mixta no puede tener más de 4 subparcelas.");
		}
	}
	
	@Override
	public int cantidadSubdiviciones() {
		return 4;
	}
	
	@Override
	public Double getGananciaSoja() {
		Double gananciaTotal = 0d;
		for (BaseParcela parcela : parcelas) {
			gananciaTotal += parcela.getGananciaSoja() / parcela.cantidadSubdiviciones();
		}
		return gananciaTotal;
	}
	
	@Override
	public Double getGananciaTrigo() {
		Double gananciaTotal = 0d;
		for (BaseParcela parcela : parcelas) {
			gananciaTotal += parcela.getGananciaTrigo() / parcela.cantidadSubdiviciones();
		}
		return gananciaTotal;
	}


}
