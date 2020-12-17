package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JButton jb = new JButton();
	JButton jb2 = new JButton();
	
	public NastySurprise() {
		jf.add(jp);
		jp.add(jb);
		jp.add(jb2);
		jb.setText("Trick");
		jb2.setText("Treat");
		jf.setVisible(true);
		jb.addActionListener(this);
		jb2.addActionListener(this);
		jf.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == jb){
			showPictureFromTheInternet("https://images.app.goo.gl/UKijQHrMyEtJBBf48");
		}
		else if(arg0.getSource() == jb2){
			showPictureFromTheInternet("https://images.app.goo.gl/xH3dPj5NJfAttuz67");
		}

	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
}
