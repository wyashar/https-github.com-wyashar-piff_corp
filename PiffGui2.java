package piff_corp_4ever;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class PiffGui2 {
	public PiffGui2()
	{
		JButton PiffButton = new JButton("PIFF BUTTON");
		JLabel PiffLabel = new JLabel("PIFF CORP RULE THE WORLD");
		PiffButton.addActionListener(this);
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(PiffButton);;
		panel.add(PiffLabel);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Piff Gui");
		frame.setVisible(true);
		
		
	}
	}

