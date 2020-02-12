package com.divya.calculator.task2;
import java.awt.*;
import java.awt.event.*;

class CalculatorUI 	extends Frame {
	

		TextField operand1;
		Button sum;
		TextField operand2;
		Button difference;
		Button multiplication;
		Button division;
		Label equal;
		Label Error;
		TextField result;
		
		public CalculatorUI(){
			initializeComponents();
			addComponentsToFrame();
			addListenerInterfaces();
		}
		
		private void initializeComponents() {
			operand1=new TextField(10);
			sum = new Button("+");
			difference = new Button("-");
			multiplication = new Button("*");
			division = new Button("/");
			operand2=new TextField(10);
			result=new TextField(10);
			equal=new Label("=");
			result.setEditable(false);

		}
		
		private void addComponentsToFrame() {
			setLayout(new FlowLayout());
			add(operand1);
			add(sum);
			add(difference);
			add(multiplication);
			add(division);
			add(operand2);
			add(equal);
			add(result);
		} 
		
		private void addListenerInterfaces() {
			addWindowListener(new WindowClosingAdapter());
			sum.addActionListener(new CalculatorActionListener());
			difference.addActionListener(new CalculatorActionListener());
			division.addActionListener(new CalculatorActionListener());
			multiplication.addActionListener(new CalculatorActionListener());
		
		}
		private class WindowClosingAdapter extends WindowAdapter
		{
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}
		
		private class CalculatorActionListener implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				CalculatorOperations calci=new CalculatorOperations();
				try{
					int o1=Integer.parseInt(operand1.getText());
					
					int o2=Integer.parseInt(operand2.getText());
					calci.setOperand1(o1);
					calci.setOperand2(o2);
					if(e.getSource()==sum) {
						calci.add();
					}
					if(e.getSource()==division) {
						calci.divide();
					}
					if(e.getSource()==difference) {
						calci.subtract();
					}
					if(e.getSource()==multiplication) {
						calci.multiply();
					}
				}
				catch(Exception E) {
					Error=new Label("You better add some values");
					add(Error);
				}
				result.setText(String.valueOf(calci.getResult()));

				
			}
			
		}
	

}
