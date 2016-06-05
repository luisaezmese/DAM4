package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Conectar_LDAP;
import Modelo.confDB;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private Login cerrarLogin;
	private Conectar_LDAP ldap;
	
	
	
	/**
	 * Create the frame.
	 */
	public Login() {
		cerrarLogin=this;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botonAWS = new JButton("AWS");
		botonAWS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Registro ventana = new Registro();
				ventana.setVisible(true);
				
				cerrarLogin.setVisible(false);
				
				
			}
		});
		botonAWS.setBounds(36, 103, 97, 25);
		contentPane.add(botonAWS);
		
		JButton botonAD = new JButton("Active Directory");
		botonAD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				ldap = new Conectar_LDAP();
				cerrarLogin.setVisible(false);
			}
		});
		botonAD.setBounds(209, 103, 121, 25);
		contentPane.add(botonAD);
		
	}
	
}

