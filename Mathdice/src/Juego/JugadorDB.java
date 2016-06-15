package Juego;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;

import Modelo.confDB;
import Ventanas.Perfil;
import Ventanas.Registro;
import Ventanas.Juego;


/*
 * Definici�n de la clase mediante la palabra reservada Jugador 
 **/
public class JugadorDB{
	
	
	// Constructor
	// Punto de entrada que se ejecuta al crear un objeto de tipo Juagador
	//Conexion a la base de datos
		private Connection conexion;
		private Statement orden = null;
		private confDB con;
		
		public JugadorDB(Connection c) {
			this.conexion=c;
		}
		
		//M�todo que permite insertar un usuario en la base de datos
		public void insertarUsuario(String nombre,String apellido1,String apellido2,int edad,int puntos){
			try{
				
				orden = conexion.createStatement();
			    String sql = "INSERT INTO usuarios (nombre,apellido1,apellido2,edad,puntos) " +
			                   "VALUES ('"+nombre+"', '"+apellido1+"', '"+apellido2+"', "+edad+", "+puntos+")";
			    orden.executeUpdate(sql);
			    System.out.println("Usuario registrado con exito");
			   }catch(SQLException se){
				      //Se produce un error con la consulta
				      se.printStackTrace();
			   }catch(Exception e){
				      //Se produce cualquier otro error
				   System.out.println("EL ERROR EST� AQU�");
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
		
		//M�todo que permite buscar un usuario en la base de datos devolviendolos en un JComboBox
				public void buscarUsuario(JComboBox jc){
					ResultSet rs;
					try{
					  orden = conexion.createStatement();
				      String sql = "SELECT id, nombre, apellido1, apellido2, edad, puntos FROM usuarios";
				      rs = orden.executeQuery(sql);
				      //Cogemos los usuarios
				      while(rs.next()){
				    	  Jugador u=new Jugador();
				    	  u.setId(rs.getInt("id"));
					      u.setNombre(rs.getString("nombre"));
					      u.setApellido1(rs.getString("apellido1"));
					      u.setApellido2(rs.getString("apellido2"));
					      u.setEdad(rs.getInt("edad"));
					      u.setPuntos(rs.getInt("puntos"));
					      jc.addItem(u);
					      
				      }
				      //Debemos cerrar la conexion
				     
				      rs.close();
					}catch(SQLException se){
						      //Se produce un error con la consulta
						      se.printStackTrace();
					}catch(Exception e){
						      //Se produce cualquier otro error
						      e.printStackTrace();
					}finally{
						/*
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
					       
					      	*/
					}
					 
				}
				
				
				//M�todo que permite buscar actualizar un usuario en la base de datos con un preparedStatement
				//M�todo que permite buscar actualizar un usuario en la base de datos con un preparedStatement
				public void actualizarUsuarioPreparada(Jugador u){
					try{
						
							
					  orden = conexion.createStatement();
					// create the java mysql update preparedstatement
				      String sql = "UPDATE usuarios " +
			                       "SET nombre = ?"+
			                       ",apellido1 = ?"+
			                       ",apellido2 = ?"+
			                       ",edad = ? "+
			                       ",puntos = ? "+
				    		       "WHERE id = "+u.getId();
				      PreparedStatement preparedStmt = conexion.prepareStatement(sql);
				      preparedStmt.setString(1, u.getNombre());
				      preparedStmt.setString(2, u.getApellido1());
				      preparedStmt.setString(3, u.getApellido2());
				      preparedStmt.setInt(4, u.getEdad());
				      System.out.println("ACTUALIZAR "+u.getPuntos());
				      preparedStmt.setInt(5, u.getPuntos());
				      System.out.println("ACTUALIZAR DESPUES "+u.getPuntos());
				 
				      // se ejecuta la consulta
				      preparedStmt.executeUpdate();
					}catch(SQLException se){
						      //Se produce un error con la consulta
						      se.printStackTrace();
					}catch(Exception e){
						      //Se produce cualquier otro error
						      e.printStackTrace();
					}finally{
					      //Cerramos los recursos
						/*
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
					      	*/ 
					}			
				}
				

}