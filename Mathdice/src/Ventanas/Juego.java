package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Jugador;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Juego extends JFrame {

	private JPanel contentPane;
	JLabel saludo;
	JLabel eti;
	private Jugador player;
	boolean comprobar = true; //para comprobar si se introduce número o signo +-
	private String a;// para enviar a la caja de texto cada número pulsado


	
	
	//Declaramos los arrays para las imágenes
	private ImageIcon[] dados3=new ImageIcon[3];//Dados del 1 al 3
	private ImageIcon[] dados6=new ImageIcon[6];//Dados del 1 al 6
	private ImageIcon[] dados12=new ImageIcon[12];//Dados del 1 al 12
	
	
	//Declaramos el elemento generador de número pseudoaleatorios
	private Random aleatorio= new Random();
	
	private JLabel labeldado1_rojo;
	private JLabel labeldado2_rojo;
	private JLabel labeldado3_rojo;
	private JLabel labeldado1_azul;
	private JLabel labeldado2_azul;
	private JLabel labeldado1_verde;
	private JTextField etiquetaoperaciones;
	private JLabel etiquetaresultado;
	
	
	/**
	 * Create the frame.
	 */

	public Juego(Jugador p) {
		setTitle("JUEGO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1500,900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Cargamos las imagenes en los arrays
		for(int i=0;i<dados3.length;i++){
			dados3[i]=new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i+1)+"_rojo.png"));
		}
		for(int i=0;i<dados6.length;i++){
			dados6[i]=new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i+1)+"_azul.png"));
		}
		for(int i=0;i<dados12.length;i++){
			dados12[i]=new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i+1)+"_verde.png"));
		}
		
		//Imagen gris para desactivar dado
		ImageIcon dadogris =new ImageIcon(getClass().getResource("img/dadogris.png"));
		
		
		saludo = new JLabel();
		saludo.setFont(new Font("Stencil", Font.PLAIN, 25));
		saludo.setHorizontalAlignment(SwingConstants.CENTER);
		saludo.setBounds(860, 13, 554, 65);
		contentPane.add(saludo);
		
		
		//Etiquetas de las imagenes DADO ROJO del 1 al 3
		labeldado1_rojo = new JLabel();
		int alerojo1= aleatorio.nextInt(3);// número aleatorio para el dado1 rojo	
		labeldado1_rojo.setIcon(dados3[alerojo1]);//pasamos la imagen correspondiente a la etiqueta dado 1 rojo
		labeldado1_rojo.setBounds(50, 50, 200, 200);
		contentPane.add(labeldado1_rojo);
		
		labeldado2_rojo = new JLabel();
		int alerojo2= aleatorio.nextInt(3);// número aleatorio para el dado2 rojo	
		labeldado2_rojo.setIcon(dados3[alerojo2]);//pasamos la imagen correspondiente a la etiqueta dado 2 rojo
		labeldado2_rojo.setBounds(300, 50, 200, 200);
		contentPane.add(labeldado2_rojo);
		
		labeldado3_rojo = new JLabel();
		int alerojo3= aleatorio.nextInt(3);// número aleatorio para el dado3 rojo	
		labeldado3_rojo.setIcon(dados3[alerojo3]);//pasamos la imagen correspondiente a la etiqueta dado 3 rojo
		labeldado3_rojo.setBounds(550, 50, 200, 200);
		contentPane.add(labeldado3_rojo);
		
		//Etiquetas de las imagenes DADO AZUL del 1 al 6
		labeldado1_azul = new JLabel();
		int aleazul1= aleatorio.nextInt(6);// número aleatorio para el dado1 azul	
		labeldado1_azul.setIcon(dados6[aleazul1]);//pasamos la imagen correspondiente a la etiqueta dado 1 azul
		labeldado1_azul.setBounds(50, 300, 200, 200);
		contentPane.add(labeldado1_azul);
		
		labeldado2_azul = new JLabel();
		int aleazul2= aleatorio.nextInt(6);// número aleatorio para el dado2 azul	
		labeldado2_azul.setIcon(dados6[aleazul2]);//pasamos la imagen correspondiente a la etiqueta dado 2 azul
		labeldado2_azul.setBounds(300, 300, 200, 200);
		contentPane.add(labeldado2_azul);
		
		//Etiqueta de las imagenes DADO VERDE del 1 al 12
		labeldado1_verde = new JLabel();
		int aleverde1= aleatorio.nextInt(12);// número aleatorio para el dado1 verde	
		labeldado1_verde.setIcon(dados12[aleverde1]);//pasamos la imagen correspondiente a la etiqueta dado 1 verde
		labeldado1_verde.setBounds(50,550,200, 200);
		contentPane.add(labeldado1_verde);
		

		
		//Etiqueta texto donde se introducen las sumas y restas
		etiquetaoperaciones = new JTextField();
		etiquetaoperaciones.setEditable(false);
		etiquetaoperaciones.setFont(new Font("Stencil", Font.PLAIN, 25));
		etiquetaoperaciones.setBounds(907, 208, 481, 76);
		contentPane.add(etiquetaoperaciones);
		etiquetaoperaciones.setColumns(10);
		
		//Botón comprobar si hemos ganado el juego
		JButton botonMathdice = new JButton("MATHDICE");
		botonMathdice.setFont(new Font("Stencil", Font.PLAIN, 25));
		botonMathdice.setBounds(907, 325, 494, 76);
		contentPane.add(botonMathdice);
		
		
		
		//Botón para SUMAR
		JButton botonsumar = new JButton("+");
		botonsumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comprobar==false){//para comprobar si el anterior es signo o número
				enviartexto("+");// volvemos a cambiar la variable
				comprobar=true;
				}//if comprobar
			}
			
		});
		botonsumar.setFont(new Font("Stencil", Font.PLAIN, 25));
		botonsumar.setBounds(907, 91, 154, 104);
		contentPane.add(botonsumar);
		
		//Botón para RESTAR
		JButton botonrestar = new JButton("-");
		botonrestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comprobar==false){//para comprobar si el anterior es signo o número
				enviartexto("-");
				comprobar=true;// volvemos a cambiar la variable
				}//if comprobar
			}
		});
		botonrestar.setFont(new Font("Stencil", Font.PLAIN, 25));
		botonrestar.setBounds(1234, 91, 154, 104);
		contentPane.add(botonrestar);
		
		//Etiqueta para mostrar el resultado de las operaciones
		JLabel etiquetaresultado = new JLabel("");
		etiquetaresultado.setEnabled(false);
		etiquetaresultado.setBounds(1075, 414, 173, 50);
		contentPane.add(etiquetaresultado);
		
		
				//Listener para el dado1_rojo
				labeldado1_rojo.addMouseListener(
						new MouseAdapter(){
							@Override	
							public void mouseClicked(MouseEvent e){
									if(comprobar==true){//para comprobar si el anterior es signo o número
									labeldado1_rojo.setIcon(dadogris);
									String alerojo1string = String.valueOf(alerojo1+1);
									a = alerojo1string;
									enviartexto(a);	
									labeldado1_rojo.removeMouseListener(this);
									comprobar=false;// volvemos a cambiar la variable
									}//if comprobar
									}
								}			
						
					);
		
				//Listener para el dado2_rojo
				labeldado2_rojo.addMouseListener(
						new MouseAdapter(){
							
							@Override
							public void mouseClicked(MouseEvent e){
								if(comprobar==true){//para comprobar si el anterior es signo o número
								labeldado2_rojo.setIcon(dadogris);
								String alerojo2string = String.valueOf(alerojo2+1);
								a = alerojo2string;
								enviartexto(a);
								labeldado2_rojo.removeMouseListener(this);
								comprobar=false;// volvemos a cambiar la variable
								}//if comprobar
							}
						}
						
					);
				//Listener para el dado3_rojo
				labeldado3_rojo.addMouseListener(
						new MouseAdapter(){
							@Override
							public void mouseClicked(MouseEvent e){
								if(comprobar==true){//para comprobar si el anterior es signo o número
								labeldado3_rojo.setIcon(dadogris);
								String alerojo3string = String.valueOf(alerojo3+1);
								a = alerojo3string;
								enviartexto(a);	
								labeldado3_rojo.removeMouseListener(this);
								comprobar=false;// volvemos a cambiar la variable
								}//if comprobar
							}
						}
						
					);
		
				//Listener para el dado1_azul
				labeldado1_azul.addMouseListener(
						new MouseAdapter(){
							@Override
							public void mouseClicked(MouseEvent e){
								if(comprobar==true){//para comprobar si el anterior es signo o número
								labeldado1_azul.setIcon(dadogris);
								String aleazul1string = String.valueOf(aleazul1+1);
								a = aleazul1string;
								enviartexto(a);	
								labeldado1_azul.removeMouseListener(this);
								comprobar=false;// volvemos a cambiar la variable
								}//if comprobar
							}
						}
						
					);
				
				//Listener para el dado2_azul
				labeldado2_azul.addMouseListener(
						new MouseAdapter(){
							@Override
							public void mouseClicked(MouseEvent arg0){
								if(comprobar==true){//para comprobar si el anterior es signo o número
								labeldado2_azul.setIcon(dadogris);
								String aleazul2string = String.valueOf(aleazul2+1);
								a = aleazul2string;
								enviartexto(a);
								labeldado2_azul.removeMouseListener(this);
								comprobar=false;// volvemos a cambiar la variable
								}//if comprobar
							}
							
						}
						
					);
				
				
	}
	public void setJugador(Jugador j1){
		
		this.player=j1;
		saludo.setText("Bienvenido al juego "+j1.getNombre());
	}
	
	public void enviartexto (String a){
		
		etiquetaoperaciones.setText(etiquetaoperaciones.getText()+a);
			
	}
	
	
}