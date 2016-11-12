package sis.com;

public class Triangulo extends Figurageometrica {

	private Punto p1;
	private Punto p2;
	private Punto p3;
	 
	
	
	public Triangulo() {

        p1=new Punto(0,0);
        p2=new Punto(0,0);
        p3=new Punto(0,0);
	}



	public Triangulo(Punto p1, Punto p2, Punto p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
 public boolean verificarTriangulo(){
	 double m1=(p1.getY()-p2.getY())/(p1.getX()-p2.getX());/*mediante el cálculo de las pendientes se sabe tres puntos pertenecen  a la misma  linea o no*/
	 double m2=(p1.getY()-p3.getY())/(p1.getX()-p3.getX());
	 double m3=(p3.getY()-p2.getY())/(p3.getX()-p2.getX());
 if (m1==m2&&m2==m3){return false;}
 else{return true;}
 }
	


	@Override
	public double calcularArea() {
		
		double resultado=Math.abs(0.5*((p1.getX()*(p2.getY()-p3.getY()))-(p2.getX()*(p1.getY()-p3.getY()))+(p3.getX()*(p1.getY()-p2.getY()))));/*Fórmula de geometría analítica para el cáculo del area de un triangulo */
		
		return resultado;
	}
public String tipoTriangulo(){
double l1= Math.pow((Math.pow((p2.getX()-p1.getX()),2)+Math.pow((p2.getY()-p1.getY()),2)),0.5);/*calcula la distancia de cada lado */
double l2=Math.pow((Math.pow((p2.getX()-p3.getX()),2)+Math.pow((p2.getY()-p3.getY()),2)),0.5);
double l3=Math.pow((Math.pow((p3.getX()-p1.getX()),2)+Math.pow((p3.getY()-p1.getY()),2)),0.5);
if (l1==l2&&l2==l3&&l3==l1){return "Equilátero";}else {if(l1==l2||l2==l3||l3==l1){return "Isoceles";}else {return "escaleno";}}
}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Triangulo [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + "]";
	}
	

}
