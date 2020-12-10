package _01_nasty_surprise;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NastySurprise {
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JButton jb = new JButton();
	JButton jb2 = new JButton();
	
	public NastySurprise() {
		jf.add(jp);
		jp.add(jb);
		jp.add(jb2);
		jf.pack();
		jb.setText("Trick");
		jb2.setText("Treat");
	}
}
