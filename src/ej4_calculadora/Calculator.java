package ej4_calculadora;

public class Calculator {
	
	
	// Attributes
	private String sign;
	private double firstOperand;
	private double secondOperand;
	
	// Constructor
	public Calculator() {
	
	}

	/**
	 * @return the sign
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * @param sign the sign to set
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}

	/**
	 * @return the firstOperand
	 */
	public double getFirstOperand() {
		return firstOperand;
	}

	/**
	 * @param firstOperand the firstOperand to set
	 */
	public void setFirstOperand(double firstOperand) {
		this.firstOperand = firstOperand;
	}

	/**
	 * @return the secondOperand
	 */
	public double getSecondOperand() {
		return secondOperand;
	}

	/**
	 * @param secondOperand the secondOperand to set
	 */
	public void setSecondOperand(double secondOperand) {
		this.secondOperand = secondOperand;
	}
	
	
	// Methods
	
	public double sum() {
		return this.firstOperand + this.secondOperand;
	}
	public double rest() {
		return this.firstOperand - this.secondOperand;
	}
	public double divide() {
		return this.firstOperand / this.secondOperand;
	}
	public double multiply() {
		return this.firstOperand * this.secondOperand;
	}
	
	

}
