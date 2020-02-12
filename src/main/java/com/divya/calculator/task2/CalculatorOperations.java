package com.divya.calculator.task2;

class CalculatorOperations {
	private int operand1=0;
	private int operand2=0;
    private int result=0;
	public int getOperand1() {
		return operand1;
	}
	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}
	public int getOperand2() {
		return operand2;
	}
	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}
	public void add() {
		result=this.operand1+this.operand2;
	}
	public void subtract() {
		result=this.operand1-this.operand2;
	}
	public void multiply() {
		result=this.operand1*this.operand2;
	}
	public void divide() {
		result=this.operand1/this.operand2;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result=result;
	}


}
