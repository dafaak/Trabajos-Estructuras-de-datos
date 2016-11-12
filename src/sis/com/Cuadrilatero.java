package sis.com;

import java.text.NumberFormat;

public class Cuadrilatero extends Figurageometrica {
private Punto p1;
private Punto p2;
private Punto p3;
private Punto p4;

	public Cuadrilatero() {
}

	public Cuadrilatero(Punto p1, Punto p2, Punto p3, Punto p4) {
	
	this.p1 = p1;
	this.p2 = p2;
	this.p3 = p3;
	this.p4 = p4;
}

	/**
	 * @return the p1
	 */
	public Punto getP1() {
		return p1;
	}

	/**
	 * @param p1 the p1 to set
	 */
	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	/**
	 * @return the p2
	 */
	public Punto getP2() {
		return p2;
	}

	/**
	 * @param p2 the p2 to set
	 */
	public void setP2(Punto p2) {
		this.p2 = p2;
	}

	/**
	 * @return the p3
	 */
	public Punto getP3() {
		return p3;
	}

	/**
	 * @param p3 the p3 to set
	 */
	public void setP3(Punto p3) {
		this.p3 = p3;
	}

	/**
	 * @return the p4
	 */
	public Punto getP4() {
		return p4;
	}

	/**
	 * @param p4 the p4 to set
	 */
	public void setP4(Punto p4) {
		this.p4 = p4;
	}

	public boolean verificarCuadrilatero(){
		 double m1=(p1.getY()-p2.getY())/(p1.getX()-p2.getX());/*mediante el cálculo de las pendientes se sabe tres puntos pertenecen  a la misma  linea o no*/
		 double m2=(p2.getY()-p3.getY())/(p2.getX()-p3.getX());
		 double m3=(p3.getY()-p4.getY())/(p3.getX()-p4.getX());
		 double m4=(p4.getY()-p1.getY())/(p4.getX()-p1.getX());
		 double a1=(Math.abs((m4-m1)/(1+m1*m4)));
		 double a2=(Math.abs((m2-m1)/(1+m2*m1)));
		 double a3=(Math.abs((m3-m2)/(1+m2*m3)));
		 double a4=(Math.abs((m4-m3)/(1+m4*m3)));
		 
		
		 if ((a1!=0&&a2!=0&&a3!=0&&a4!=0)){return true;}
		 else {return false;}
		 
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Poligono [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4="
				+ p4 + "]";
	}

	@Override
	public double calcularArea() {
		double resultado=0.5*Math.abs((p1.getX()*p2.getY()+p2.getX()*p3.getY()+p3.getX()*p4.getY()+p4.getX()*p1.getY())-(p1.getY()*p2.getX()+p2.getY()*p3.getX()+p3.getY()*p4.getX()+p4.getY()*p1.getX()));
		return resultado;
	}

}
