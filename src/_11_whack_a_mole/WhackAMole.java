package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random rand = new Random();
	JButton button;
	int score = 0;
	int misses = 0;
	int plays = 0;
	Date start;

	public WhackAMole() {
		drawButtons();
		start = new Date();
	}

	void drawButtons() {
		int r = rand.nextInt(24);
		for (int i = 0; i < 24; i++) {
			button = new JButton();
			button.setPreferredSize(new Dimension(100, 30));
			button.addActionListener(this);
			if (i == r) {
				button.setText("Mole!");
			}
			panel.add(button);
		}

		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(350, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		String buttonText = buttonPressed.getText();
		if (buttonText.equals("Mole!")) {
			score++;
			//speak("Correct button");
			System.out.println(score);
			plays++;
		} else {
			score--;
			//speak("Wrong button.");
			System.out.println(score);
			misses++;
			plays++;
		}
		panel.removeAll();
		drawButtons();
		if (score == 10) {
			endGame(start, score);
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	static void speak(String words) {
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
