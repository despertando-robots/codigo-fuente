
/*
***************************************************
** Dspertando Robots          Desafio stem ********
***************************************************
** Ladrillo RCX               lb04         ********
***************************************************
** Muestra los sonidos musicales basicos   ********
***************************************************
*/

import josx.platform.rcx.Sound; // Clase Sound

public class lb04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
	// TODO Auto-generated method stub

  	   for (int aCode=0; aCode <6; aCode ++){  //Recorrido por los sonidos basicos
	
	        Sound.systemSound(true, aCode);
		Thread.sleep(2000);			
		
	   }
	}
}
