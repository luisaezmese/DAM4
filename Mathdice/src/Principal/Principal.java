package Principal;
import Ventanas.Juego;
import Ventanas.Login;

//Las variables o propiedades
public class Principal {


	/**
	 * ENTRADA A NUESTRO PROGRAMA
	 * ES EL METODO MAIN.
	 */
	public static void main(String[] args) {
		
			Juego juego1 = new Juego();
			Login ventana = new Login(juego1);
			ventana.setVisible(true);
	}

}
