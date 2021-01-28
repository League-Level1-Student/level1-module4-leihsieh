package _08_calculator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JTextField text1 = new JTextField(10);
	JTextField text2 = new JTextField(10);
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton divide = new JButton();
	JButton multiply = new JButton();
	JLabel answer = new JLabel();
	
	public Calculator() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add.setText("add");
		subtract.setText("subtract");
		divide.setText("divide");
		multiply.setText("multiply");
		
		JPanel outer = new JPanel(new BorderLayout());
		
		panel.add(text1);
		panel.add(text2);
		
		panel2.add(add);
		panel2.add(subtract);
		panel2.add(divide);
		panel2.add(multiply);
		add.addActionListener(this);
		subtract.addActionListener(this);
		divide.addActionListener(this);
		multiply.addActionListener(this);
		
		panel3.add(answer);
		answer.setText("answer label");
		
		outer.add(panel, BorderLayout.NORTH);
		outer.add(panel2, BorderLayout.CENTER);
		outer.add(panel3, BorderLayout.SOUTH);
		frame.add(outer);
		
		frame.pack();
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		String text1string = text1.getText();
		String text2string = text2.getText();
		
		int a = Integer.parseInt(text1string);
		int b = Integer.parseInt(text2string);
		int c = 0;
		
		if (buttonPressed == add) {
			c = a + b;
		}
		if(buttonPressed == subtract) {
			c = a - b;
		}
		if (buttonPressed == divide) {
			c = a/b;
		}
		if(buttonPressed == multiply) {
			c = a*b;
		}
		String d = String.valueOf(c);
		answer.setText(d);
	}
}
