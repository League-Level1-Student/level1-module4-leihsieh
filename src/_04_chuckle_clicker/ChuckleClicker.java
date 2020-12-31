package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	
	public static void main(String[] args) {
	
		ChuckleClicker c = new ChuckleClicker();
		c.makeButtons();
	}
	
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();
	
	void makeButtons(){
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		jb1.setText("joke");
		jp.add(jb1);
		jb2.setText("punchline");
		jp.add(jb2);
		jf.add(jp);
		jf.show();
		jf.pack();
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		if(buttonPressed == jb1) {
			JOptionPane.showMessageDialog(null, "Why did the picture go to jail?");
		}
		else {
			JOptionPane.showMessageDialog(null, "It was framed.");
		}
		
	}
	
}