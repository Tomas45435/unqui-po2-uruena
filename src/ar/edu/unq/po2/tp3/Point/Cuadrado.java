package ar.edu.unq.po2.tp3.Point;

public class Cuadrado extends Rectangulo {
	
	public Cuadrado(Point esquinaInferiorIzquierda, int longitudLado) {
		super(esquinaInferiorIzquierda, new Point (esquinaInferiorIzquierda.getX() + longitudLado, esquinaInferiorIzquierda.getY() + longitudLado));

	}
	
	//Obtener la longitud del lado del Cuadrado.
	public int longitudDeLado() {
		return super.calcularPerimetro() / 4;
	}
}
