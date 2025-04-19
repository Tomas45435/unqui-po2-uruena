package ar.edu.unq.po2.tp3.Point;

public class Point {
 
	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		setX(0);
		setY(0);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//Metodo para mover un punto a una nueva coordenada.
	public void moverPuntoACoordenadas(int x, int y) {
		setX(x);
		setY(y);
	}
	
	//Metodo para sumarse con otro punto.
	public void sumarseConPunto(Point point) {
		setX(this.getX() + point.getX());
		setY(this.getY() + point.getY());
	}
	
}
