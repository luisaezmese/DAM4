package Juego;

public class Jugador {
	
	//PROPIEDADES
		private String nombre="";
		private String apellido1="";
		private String apellido2="";
		private int puntos=0;
		private int edad=0;
		private int id;
	
	//CONSTRUCTOR	
	public Jugador(){
		
	}
	
	//DEFINO EL METODO id
	public int getId() {
			return id;
	}


	public void setId(int id) {
			this.id = id;
	}

	//DEFINO EL METODO Nombre
		public String getNombre() {
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
	

	//METODO toString
	public String toString(){
		return this.id+" "+this.nombre+" "+this.apellido1+" "+this.apellido2;
	}
	
	
}
