package ar.edu.unq.po2.tp10.PalabrasOrdenadas;

import javax.swing.DefaultListModel;

public class ListaDePalabrasAdapter extends DefaultListModel {
	 
	private final ListaDePalabrasOrdenadas listaAdaptada;
	
	public ListaDePalabrasAdapter(ListaDePalabrasOrdenadas lista) {
		this.listaAdaptada = lista;
	}
	
	@Override
	public void addElement(Object elemento) {
		this.listaAdaptada.agregarPalabra((String) elemento);
	}
	
	@Override
	public Object getElementAt(int index) {
		return this.listaAdaptada.getPalabraDePosicion(index);
	}
	
	@Override
	public int getSize() {
		return this.listaAdaptada.cantidadDePalabras();
	}
}
