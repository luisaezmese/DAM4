package Juego;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Modelo.confDB;

/*
 * Definición de la clase mediante la palabra reservada Jugador 
 **/
public class Jugador{
	
	
	//PROPIEDADES
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int puntos;
	private int edad;
	
	// Constructor
	// Punto de entrada que se ejecuta al crear un objeto de tipo Juagador
	//Conexion a la base de datos
		private Connection conexion;
		private Statement orden = null;
		private confDB con;
		
		public Jugador(Connection c) {
			this.conexion=c;
		}
		
		//Método que permite insertar un usuario en la base de datos
		public void insertarUsuario(String nombre,String apellido1,String apellido2,int edad){
			try{
				
				orden = conexion.createStatement();
			    String sql = "INSERT INTO usuarios (nombre,apellido1,apellido2,edad) " +
			                   "VALUES ('"+nombre+"', '"+apellido1+"', '"+apellido2+"', "+edad+")";
			    orden.executeUpdate(sql);
			    System.out.println("Usuario registrado con exito");
			   }catch(SQLException se){
				      //Se produce un error con la consulta
				      se.printStackTrace();
			   }catch(Exception e){
				      //Se produce cualquier otro error
				   System.out.println("EL ERROR ESTÁ AQUÍ");
				      e.printStackTrace();
			   }finally{
				      //Cerramos los recursos
				      try{
				         if(orden!=null)
				        	 conexion.close();
				      }catch(SQLException se){
				      }
				      try{
				         if(conexion!=null)
				        	 conexion.close();
				      	 }catch(SQLException se){
				         se.printStackTrace();
				      }//end finally try
				}//end try
		}
	
	//FUNCIONES O METODOS
	//public OUT nombreMetodo (IN)

	//DEFINO EL METODO Nombre
/*			public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//DEFINO EL METODO Apellido1
	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String apellido) {
		this.apellido1 = apellido;
	}
	
	//DEFINO EL METODO Apellido2
	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String apellido) {
		this.apellido2 = apellido;
	}

	//DEFINO EL METODO Edad
	public int getEdad() {
		return edad;
	}

	
	public void setEdad(int edad) {
		if(edad<0){
			this.edad=0;
		}else{
			this.edad = edad;
		}
			
		
		
	}

	//DEFINO EL METODO Puntos
	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	**/
}