/*
***********************************************
** Despertando Robots         Desafio Stem ****
***********************************************
** Ladrillo RCX               lb01         ****
***********************************************
** Muestra el mensaje "Hello world"        ****
***********************************************
*/



import josx.platform.rcx.*; // Paquete con clases de LEJOS



public class lb01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub

	  LCD.clear();
  		
 	  TextLCD.print("hello"); // Muestra "Hello"
	  Thread.sleep(2000);     // Espera 2 segundos
		
	  TextLCD.print("world"); // Muestra "World"
	  Thread.sleep(2000);     // Espera 2 segundos
		
	}

}
