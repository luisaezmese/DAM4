package Juego;
/*
 * Definición de la clase mediante la palabra reservada Jugador 
 **/
public class Jugador{
	
	
	//PROPIEDADES
	private String Nombre;
	private String Apellido;
	private int Puntos;
	private int Edad;
	
	// Constructor
	// Punto de entrada que se ejecuta al crear un objeto de tipo Juagador
	public Jugador() {
		
		
		
	}
	//FUNCIONES O METODOS
	//public OUT nombreMetodo (IN)

	//DEFINO EL METODO Nombre
	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	//DEFINO EL METODO Apellido
	public String getApellido() {
		return Apellido;
	}


	public void setApellido(String apellido) {
		this.Apellido = apellido;
	}

	//DEFINO EL METODO Edad
	public int getEdad() {
		return Edad;
	}

	
	public void setEdad(int edad) {
		if(edad<0){
			this.Edad=0;
		}else{
			this.Edad = edad;
		}
			
		
		
	}

	//DEFINO EL METODO Puntos
	public int getPuntos() {
		return Puntos;
	}


	public void setPuntos(int puntos) {
		this.Puntos = puntos;
	}
	
}
