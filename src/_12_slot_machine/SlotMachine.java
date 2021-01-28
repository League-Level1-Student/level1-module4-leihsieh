package _12_slot_machine;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	Random rand = new Random();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JButton button = new JButton();
	JLabel grapeLabel1 = createLabelImage("grape.png");
	JLabel grapeLabel2 = createLabelImage("grape.png");
	JLabel grapeLabel3 = createLabelImage("grape.png");
	JLabel cherryLabel1 = createLabelImage("cherry.png");
	JLabel cherryLabel2 = createLabelImage("cherry.png");
	JLabel cherryLabel3 = createLabelImage("cherry.png");
	JLabel orangeLabel1 = createLabelImage("orange.png");
	JLabel orangeLabel2 = createLabelImage("orange.png");
	JLabel orangeLabel3 = createLabelImage("orange.png");

	public SlotMachine() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.setText("Spin!");
		panel.add(button);
		button.addActionListener(this);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
	}

	private JLabel createLabelImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		Image image = ((ImageIcon) icon).getImage();
		Image newimg = image.getScaledInstance(300, 200, java.awt.Image.SCALE_SMOOTH);
		ImageIcon newicon = new ImageIcon(newimg);
		JLabel imageLabel = new JLabel(newicon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		panel.removeAll();
		panel.add(button);
		int x = rand.nextInt(3);
		if (x == 0) {
			panel.add(grapeLabel1);
		} else if (x == 1) {
			panel.add(cherryLabel1);
		} else {
			panel.add(orangeLabel1);
		}
		System.out.println(x);
		
		int y = rand.nextInt(3);
		if (y == 0) {
			panel.add(grapeLabel2);
		} else if (y == 1) {
			panel.add(cherryLabel2);
		} else {
			panel.add(orangeLabel2);
		}
		System.out.println(x);
		
		int z = rand.nextInt(3);
		if (z == 0) {
			panel.add(grapeLabel3);
		} else if (z == 1) {
			panel.add(cherryLabel3);
		} else {
			panel.add(orangeLabel3);
		}
		System.out.println(x);

		frame.setVisible(false);
		frame.setVisible(true);
		frame.pack();
		if((x==0 && y==0 &&  z==0) || (x==1 && y==1 &&  z==1) || (x==2 && y==2 &&  z==2)) {
			JOptionPane.showMessageDialog(null, "Congratulations, you won!!");
		}
	}
}
