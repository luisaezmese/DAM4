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

public class Juego extends JFrame {

	private JPanel contentPane;
	JLabel juegoJtext;
	private Jugador player;
	
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
	
	/**
	 * Create the frame.
	 */

	public Juego(Jugador p) {
		setTitle("JUEGO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1000,850);
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
		
		juegoJtext = new JLabel();
		juegoJtext.setBounds(790, 13, 180, 16);
		contentPane.add(juegoJtext);
		
		
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
		
		
	}
	public void setJugador(Jugador j1){
		
		this.player=j1;
		juegoJtext.setText("Bienvenido al juego "+j1.getNombre());
	}
}
