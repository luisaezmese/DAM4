package Ventanas;

import javax.swing.JPanel;
import javax.swing.JTextField;

import Juego.Jugador;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Perfil extends JPanel {
	JTextField CajaApellido1;
	JTextField CajaEdad;
	JTextField CajaApellido2;
	JLabel CajaNombre;
	Jugador player;
	private JLabel EtiquetaSaludo;

	/**
	 * Create the panel.
	 */
	public Perfil() {
		setLayout(null);
		//player = new Jugador ();
		
		//ETIQUETA NOMBRE
		JLabel EtiquetaNombre = new JLabel("Nombre");
		EtiquetaNombre.setBounds(171, 24, 56, 16);
		add(EtiquetaNombre);
	
		//ETIQUETA 1er APELLIDO
		JLabel EtiquetaApellido1 = new JLabel("1er Apellido");
		EtiquetaApellido1.setBounds(171, 77, 80, 16);
		add(EtiquetaApellido1);
		//CAJA 1er APELLIDO
		CajaApellido1 = new JTextField();
		CajaApellido1.setEditable(false);
		CajaApellido1.setColumns(10);
		CajaApellido1.setBounds(171, 95, 116, 22);
		add(CajaApellido1);
		//CajaApellido1.setText(player.getApellido1());
		//ETIQUETA EDAD
		JLabel EtiquetaEdad = new JLabel("Edad");
		EtiquetaEdad.setBounds(171, 145, 56, 16);
		add(EtiquetaEdad);
		//CAJA EDAD
		CajaEdad = new JTextField();
		CajaEdad.setEditable(false);
		CajaEdad.setColumns(10);
		CajaEdad.setBounds(171, 163, 116, 22);
		add(CajaEdad);
		//CajaEdad.setText(player.getNombre());
		//ETIQUETA 2º APELLIDO
		JLabel EtiquetaApellido2 = new JLabel("2\u00BA Apellido");
		EtiquetaApellido2.setBounds(309, 77, 80, 16);
		add(EtiquetaApellido2);
		//CAJA 2º APELLIDO
		CajaApellido2 = new JTextField();
		CajaApellido2.setEditable(false);
		CajaApellido2.setColumns(10);
		CajaApellido2.setBounds(309, 95, 116, 22);
		add(CajaApellido2);
		
		CajaNombre = new JLabel();
		CajaNombre.setBounds(171, 53, 56, 16);
		add(CajaNombre);
		//CajaNombre.setText(this.player.getNombre());
		
		
		EtiquetaSaludo = new JLabel();
		EtiquetaSaludo.setHorizontalAlignment(SwingConstants.CENTER);
		EtiquetaSaludo.setFont(new Font("Stencil", Font.PLAIN, 25));
		EtiquetaSaludo.setBounds(12, 222, 554, 65);
		add(EtiquetaSaludo);
		
	}

public void setPlayer(Jugador player) {
	this.player = player;
	
}


}
