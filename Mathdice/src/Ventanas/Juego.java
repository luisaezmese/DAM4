package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Juego extends JFrame {

	private JPanel contentPane;
	public static JLabel juegoJtext;
	

	/**
	 * Create the frame.
	 */
	public Juego() {
		setTitle("JUEGO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		juegoJtext = new JLabel("");
		juegoJtext.setBounds(240, 13, 180, 16);
		contentPane.add(juegoJtext);
	}

	public JLabel getJuegoJtext() {
		return juegoJtext;
	}
}
