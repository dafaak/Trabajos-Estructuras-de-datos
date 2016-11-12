package sis.com;

public class Circulo extends Figurageometrica {

	private double radio;
	private Punto centro;
	
	
	
	public Circulo() {
		radio=1;
		centro= new Punto();
	}



	public Circulo(double radio, Punto centro) {
		super();
		this.radio = radio;
		this.centro = centro;
	}

	


	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}



	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}



	/**
	 * @return the centro
	 */
	public Punto getCentro() {
		return centro;
	}



	/**
	 * @param centro the centro to set
	 */
	public void setCentro(Punto centro) {
		this.centro = centro;
	}



	public double calcularArea() {
		
		return (Math.pow(radio, 2)*(Math.PI)); 
		}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", centro=" + centro + "]";
	}
	
	

}
