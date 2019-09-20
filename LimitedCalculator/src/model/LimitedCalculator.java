package model;

public class LimitedCalculator {
	
	int firstNumber;
	int secondNumber;
    int result;

	public LimitedCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LimitedCalculator(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		multiplyNumbers(firstNumber, secondNumber);
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	private void multiplyNumbers(int firstNumber, int secondNumber) {
		
		setResult(firstNumber * secondNumber);
		
	}

}



