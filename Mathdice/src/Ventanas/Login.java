package Ventanas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Jugador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * Definición de la clase mediante la palabra reservada Jugador 
 **/
public class Login extends JFrame{
	
	
	//PROPIEDADES
	private JPanel contentPane;
	private JTextField textoNombre;
	private JTextField textoApellidos;
	private JTextField textoEdad;
	//Creamos la referencia a Juego
	private Juego juego1;
	//Creamos la referencia a Login
	private Login cerrar;
	
	JButton botonDatos;
	
	//Creamos objeto Jugador
	private Jugador j1;
	
	// Constructor
	// Punto de entrada que se ejecuta al crear un objeto de tipo Juagador
	public Login(Juego jugador1) {
			
		//Hacemos referencia cerrar
			cerrar=this;
		
		//Hacemos referncia a juego1
			juego1= jugador1;
		
		//Las propiedades de nuestra ventana
				setTitle("JUGADOR");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//Dimensiones de nuestra ventana		
				setBounds(100, 100, 450, 360);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				
		//Lo añadimos al JFrame		
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
		//Añadimos la etiqueta Título		
				JLabel etiquetaTitulo = new JLabel("DATOS DEL JUGADOR");
				etiquetaTitulo.setBounds(12, 13, 140, 16);
				contentPane.add(etiquetaTitulo);
				
		//Añadimos la etiqueta Nombre
				JLabel etiquetaNombre = new JLabel("Nombre");
				etiquetaNombre.setBounds(12, 61, 140, 16);
				contentPane.add(etiquetaNombre);
				
		//Añadimos la etiqueta Apellidos
				JLabel etiquetasApellidos = new JLabel("Apellidos");
				etiquetasApellidos.setBounds(12, 108, 72, 16);
				contentPane.add(etiquetasApellidos);
		
		//Añadimos la etiqueta Edad
				JLabel etiquetaEdad = new JLabel("Edad");
				etiquetaEdad.setBounds(12, 156, 72, 16);
				contentPane.add(etiquetaEdad);
				
		//Añadimos cuadro de texto Nombre
				textoNombre = new JTextField();
				textoNombre.setBounds(81, 58, 226, 22);
				contentPane.add(textoNombre);
				textoNombre.setColumns(10);
				
		//Añadimos cuadro de texto Apellidos	
				textoApellidos = new JTextField();
				textoApellidos.setColumns(10);
				textoApellidos.setBounds(81, 105, 226, 22);
				contentPane.add(textoApellidos);
				
		//Añadimos cuadro de texto Edad		
				textoEdad = new JTextField();
				textoEdad.setColumns(10);
				textoEdad.setBounds(81, 153, 226, 22);
				contentPane.add(textoEdad);
		
		//Añadimos caja de texto Datos
				JTextArea textoDatos = new JTextArea();
				textoDatos.setBounds(12, 227, 408, 73);
				contentPane.add(textoDatos);
				
		//Añadimos botón de Datos
				botonDatos = new JButton("A JUGAR");
		//Evento addActionListener		
				botonDatos.addActionListener(new ActionListener() {
		//Acción del evento			
					public void actionPerformed(ActionEvent arg0) {
						
						if ((textoNombre.getText().length()==0)||(textoApellidos.getText().length()==0)||(textoEdad.getText().length()==0)) {//comparamos si las cajas de texto están vacias
							textoDatos.setText("Algún campo por rellenar");
						}else{
						
							j1.setNombre(textoNombre.getText());
							j1.setApellido(textoApellidos.getText());
							String EdadString=textoEdad.getText();
							int edad=Integer.valueOf(EdadString);
							j1.setEdad(edad);
							//Enviamos los datos a la ventana Juego
							Juego.juegoJtext.setText("Bienvenido al juego "+j1.getNombre());
							//Cerramos la ventana Login
							cerrar.setVisible(false);
							//Abrimos la ventana Juego
							juego1.setVisible(true);
						}
					}
				});
				botonDatos.setBounds(12, 189, 408, 25);
				contentPane.add(botonDatos);
	j1=new Jugador();
				
		
	}
}