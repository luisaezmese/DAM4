package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class confDB {
	private Connection connect= null;
	
	public confDB() {
	}
	//Método que conecta a la base de datos devolviendo un null si no hay errores
	//Devuelve el  error si no hay conexión
	public String conectar(){
		try {
		      // Cargamos en ejecución 
		      Class.forName("com.mysql.jdbc.Driver");
		      // Setup the connection with the DB
		      connect = DriverManager
		          .getConnection("jdbc:mysql://localhost:3306/corredores?user=root&password=v8271cu79");
		      //Conexion realizada
		      System.out.println("CONECTADOS CON EXITO");
		      return null;
	    } catch (Exception e) {
	    	System.out.println("ERROR EN LA CONEXIÓN");
	        return e.getMessage();
	    } 
	}
	public Connection getConexion() {
		return connect;
	}

}