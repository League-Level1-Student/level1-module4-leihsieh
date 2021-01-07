package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	
	public Calculator() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JButton add = new JButton();
		JButton subtract = new JButton();
		JButton divide = new JButton();
		JButton multiply = new JButton();
		JLabel answer = new JLabel();
		
		add.setText("add");
		subtract.setText("subtract");
		divide.setText("divide");
		multiply.setText("multiply");
		panel.add(text1);
		panel.add(text2);
		panel2.add(add);
		panel2.add(subtract);
		panel2.add(divide);
		panel2.add(multiply);
		panel3.add(answer);
		frame.add(panel);
		frame.add(panel2);
		frame.add(panel3);
		frame.pack();
		frame.setVisible(true);
		answer.setText("answer label");
		
		add.setText("add");
		subtract.setText("subtract");
		divide.setText("divide");
		multiply.setText("multiply");
	}
	
	public static void main(String[] args) {
		
	}
	
	static void add() {
		
	}
	
	static void subtract() {
		
	}
	
	static void divide() {
		
	}
	static void multiply() {
		
	}
}
