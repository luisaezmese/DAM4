package Juego;
/*
 * Definición de la clase mediante la palabra reservada Jugador 
 **/
public class Jugador{
	
	
	//PROPIEDADES
	private String Nombre;
	private String Apellido1;
	private String Apellido2;
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

	//DEFINO EL METODO Apellido1
	public String getApellido1() {
		return Apellido1;
	}


	public void setApellido1(String apellido) {
		this.Apellido1 = apellido;
	}
	
	//DEFINO EL METODO Apellido2
	public String getApellido2() {
		return Apellido2;
	}


	public void setApellido2(String apellido) {
		this.Apellido2 = apellido;
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
