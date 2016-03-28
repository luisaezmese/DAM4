package Ventanas;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Perfil extends JPanel {
	private JTextField txtPerfil;

	/**
	 * Create the panel.
	 */
	public Perfil() {
		setLayout(null);
		
		txtPerfil = new JTextField();
		txtPerfil.setText("PERFIL");
		txtPerfil.setBounds(152, 142, 116, 22);
		add(txtPerfil);
		txtPerfil.setColumns(10);

	}

}
