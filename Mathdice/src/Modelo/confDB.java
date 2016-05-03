package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class confDB {
	private Connection connect = null;
	
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
		          .getConnection("jdbc:mysql:localhost/corredores,root,v8271cu79");
		      //Conexion realizada
		      return null;
	    } catch (Exception e) {
	        return e.getMessage();
	    } 
	}
	public Connection getConexion() {
		return connect;
	}

}