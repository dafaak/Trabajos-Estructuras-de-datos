package sis.com;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        /*Circulo*/
		Punto puntoc=new Punto(3,2);
		Circulo c = new Circulo(3,puntoc);
	
		String salida="";
		salida+=c.toString()+"\nel area es:"+c.calcularArea();
		System.out.println(salida);
		/*Triangulo*/
		Punto pt1=new Punto(-3,1);/*puntos de un triangulo equilatero*/
		Punto pt2=new Punto(1,1);
		Punto pt3=new Punto(-1,1-Math.pow(12,0.5));
		Triangulo t= new Triangulo(pt1,pt2,pt3);
		salida="\n\n";
		salida+=t.toString()+"\nEs un triangulo?:"+t.verificarTriangulo();
		if (t.verificarTriangulo()==true){salida+="     el area es:"+ t.calcularArea()+"   tipo de triangulo: "+t.tipoTriangulo();}
		System.out.println(salida);
		 /*Polígono*/
		Punto pp1=new Punto(0,0);
		Punto pp2=new Punto(0,1);
		Punto pp3=new Punto(1,1);
		Punto pp4=new Punto(1,0);
		
		Cuadrilatero p=new Cuadrilatero(pp1,pp2,pp3,pp4);
		salida="";
		salida+="\n\n"+p.toString()+"\nEs un cuadrilátero?  "+p.verificarCuadrilatero();
		if(p.verificarCuadrilatero()==true){salida+= "      el area es:"+p.calcularArea();}
		System.out.println(salida);
		
		
		
		
	 	
		
		
		
		
		

	}

}
