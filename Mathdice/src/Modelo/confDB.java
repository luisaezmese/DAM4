package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class confDB {
	private static Connection connect= null;
	private static confDB INSTANCE = null;
	String url = "jdbc:mysql://54.186.234.240/jugadores";
	String user = "luis";
	String pw = "v8271cu79";
	
	private confDB() {
	//}
	//Método que conecta a la base de datos devolviendo un null si no hay errores
	//Devuelve el  error si no hay conexión
	
		try {
		      // Cargamos en ejecución 
		      Class.forName("com.mysql.jdbc.Driver");
		      // Setup the connection with the DB
		      connect = DriverManager
		          .getConnection(url,user,pw);
		      //Conexion realizada
		      System.out.println("CONECTADOS CON EXITO");
		  
	    } catch (Exception e) {
	    	System.out.println("ERROR EN LA CONEXIÓN");
	      
	    } 
	}
	public static Connection getConexion() {
		if (connect == null){
			INSTANCE = new confDB();
		}
		return connect;
	}

}