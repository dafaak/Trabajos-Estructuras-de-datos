package sis.com;

public class Punto {
	private double x;
	private double y;
	public Punto(double x, double y) {
		
		this.x = x;
		this.y = y;
	}
	public Punto() {
		x = 0.0;
		y = 0.0;
	}
	
	
	
	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}
	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Punto  x=" + x + ", y=" + y ;
	}


}
