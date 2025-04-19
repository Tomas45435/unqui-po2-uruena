package ar.edu.unq.po2.tp3.Point;

public class Rectangulo {
	
	private Point esquinaInferiorIzquierda;
	private Point esquinaSuperiorDerecha;
	
	//Constructor de Rectangulo con dos puntos, esquina inferior izquierda y esquina superior derecha.
	public Rectangulo(Point esquinaInferiorIzquierda, Point esquinaSuperiorDerecha) {
		super();
		
		//Se verifica que con las dos esquinas se pueda obtener un rectangulo valido.
		if (esquinaInferiorIzquierda.getX() >= esquinaSuperiorDerecha.getX() || 
			esquinaInferiorIzquierda.getY() >= esquinaSuperiorDerecha.getY()) {
			throw new IllegalArgumentException("Los puntos no forman un rectángulo válido");
		}
		
		this.esquinaInferiorIzquierda = new Point (esquinaInferiorIzquierda.getX(), esquinaInferiorIzquierda.getY());
		this.esquinaSuperiorDerecha = new Point (esquinaSuperiorDerecha.getX(), esquinaSuperiorDerecha.getY()); 
	}
	
	//Calcular el area del Rectangulo.
	public int calcularArea() {
		int ancho = this.calcularAncho();
		int alto = this.calcularAlto();
		return ancho * alto;
	}
	
	//Calcular el perimetro del Rectangulo.
	public int calcularPerimetro() {;
		int ancho = this.calcularAncho();
		int alto = this.calcularAlto();
		return (ancho + alto) * 2;
	}
	
	//Retorna si el Rectangulo es horizontal.
	public boolean esHorizontal() {
		int ancho = this.calcularAncho();
		int alto = this.calcularAlto();
		return ancho > alto;
	}
	
	//Retorna si el Rectangulo es vertical.
	public boolean esVertical() {
		int ancho = this.calcularAncho();
		int alto = this.calcularAlto();
		return alto > ancho;
	}
	
	//Calcular el ancho del Rectangulo.
	public int calcularAncho() {
		int ancho = esquinaSuperiorDerecha.getX() - esquinaInferiorIzquierda.getX();
		return ancho;
	}
	
	//Calcular el alto del Rectangulo.
	public int calcularAlto() {
		int alto = esquinaSuperiorDerecha.getY() - esquinaInferiorIzquierda.getY();
		return alto;
	}
	
}
