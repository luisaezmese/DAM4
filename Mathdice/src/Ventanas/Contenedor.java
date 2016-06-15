package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Jugador;
import Juego.JugadorDB;

import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Contenedor extends JFrame {

	private JPanel contentPane;

		//IDENTIFICADORES
		final static String VENTANA1= "Ventana 1";
		final static String VENTANA2= "Ventana 2";

		
		
		
		


	/**
	 * Create the frame.
	 */
	public Contenedor(Jugador j1) {
		
		Juego v1=new Juego(j1);
		Perfil v2=new Perfil(j1);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1800, 881);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//MENU PRINCIPAL VENTANAS
		JMenu MenuPrincipal = new JMenu("Ventanas");
		menuBar.add(MenuPrincipal);
		
		//MENU PERFIL
		JMenuItem MenuPerfil = new JMenuItem("Perfil");
		
		//VENTANA PERFIL
		MenuPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	contentPane.add(v1,VENTANA1);
				CardLayout c1 = (CardLayout)(contentPane.getLayout());
				c1.show(contentPane, VENTANA2);
			}
		});
		
		//MENU JUEGO
		JMenuItem MenuJuego = new JMenuItem("Juego");
		
		//VENTANA JUEGO
		MenuJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//contentPane.add(v2,VENTANA2);
				CardLayout c1 = (CardLayout)(contentPane.getLayout());
				c1.show(contentPane, VENTANA1);
			}
		});
		
	
		MenuPrincipal.add(MenuPerfil);
		MenuPrincipal.add(MenuJuego);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		//A�adir las ventanas al contenedor
		contentPane.add(v1,VENTANA1);
		contentPane.add(v2,VENTANA2);
	}
}