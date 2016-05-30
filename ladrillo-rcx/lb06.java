
/*
***************************************************
** Dspertando Robots          Desafio stem ********
***************************************************
** Ladrillo RCX               LB06         ********
***************************************************
** Toca la melodia "HAPPY BIRTHDAY"        ********
***************************************************
*/

import josx.platform.rcx.*;  // Clases de LEJOS

/* Constantes de las notas musicales */

public class lb06 {

	static final byte DO = 1;
	static final byte RE = 2;
	static final byte MI = 3;
	static final byte FA = 4;
	static final byte SOL = 5;
	static final byte LA = 6;
	static final byte SI = 7;
	static final byte DO1 = 11;
	static final byte RE1 = 12;
	static final byte MI1 = 13;
	static final byte FA1 = 14;
	static final byte SOL1 = 15;
	static final byte LA1 = 16;
	static final byte SI1 = 17;
	static final byte SIL = 0;
	
	static final byte REDONDAPUNTILLO = 1;
	static final byte REDONDA = 2;
	static final byte BLANCAPUNTILLO = 3;
	static final byte BLANCA = 4;
	static final byte NEGRAPUNTILLO = 5;
	static final byte NEGRA = 6;
	static final byte CORCHEAPUNTILLO = 7;
	static final byte CORCHEA = 8;
	static final byte SEMICORCHEAPUNTILLO = 9;
	static final byte SEMICORCHEA = 10;
	static final byte FUSAPUNTILLO = 11;
	static final byte FUSA = 12;
	static final byte SEMIFUSA = 13;

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		
		/* Reproduccion de la melodia "HAPPY BIRTHDAY" */


		nota(RE, CORCHEA);
		nota(RE, CORCHEA);
		nota(MI, NEGRA);
		nota(RE, NEGRA);
		nota(SOL, NEGRA);
		nota(FA, BLANCA);
		
		nota(RE, CORCHEA);
		nota(RE, CORCHEA);
		nota(MI, NEGRA);
		nota(RE, NEGRA);
		nota(LA, NEGRA);
		nota(SOL, BLANCA);
		
		nota(RE, CORCHEA);
		nota(RE, CORCHEA);
		nota(RE1, NEGRA);
		nota(SI, NEGRA);
		nota(SOL, NEGRA);
		nota(FA, NEGRA);
		nota(MI, NEGRA);
		
		nota(DO1, CORCHEA);
		nota(DO1, CORCHEA);
		nota(SI, NEGRA);
		nota(SOL, NEGRA);
		nota(LA, NEGRA);
		nota(SOL, BLANCA);	
		
	}
	
        // Metodo que reproduce una nota musical con su duracion

	static void nota(byte note, int figura) throws Exception{

		int fre=0;

		if (note == DO)   fre = 261; else 
		if (note == RE)   fre = 293; else	
		if (note == MI)   fre = 329; else	
		if (note == FA)   fre = 349; else	
		if (note == SOL)  fre = 392; else	
		if (note == LA)   fre = 440; else	
		if (note == SI)   fre = 493; else	
		if (note == DO1)  fre = 523; else	
		if (note == RE1)  fre = 587; else	
		if (note == MI1)  fre = 659; else	
		if (note == FA1)  fre = 698; else	
		if (note == SOL1) fre = 783; else	
		if (note == LA1)  fre = 880; else	
		if (note == SI1)  fre = 987;	


		int fig=0;
		
		if (figura == REDONDAPUNTILLO)       fig = 3000; else 
		if (figura == REDONDA)   		     fig = 2000; else	
		if (figura == BLANCAPUNTILLO)        fig = 1500; else	
		if (figura == BLANCA)  		         fig = 1000; else	
		if (figura == NEGRAPUNTILLO)  	     fig = 750; else	
		if (figura == NEGRA)   		         fig = 500; else	
		if (figura == CORCHEAPUNTILLO)       fig = 375; else	
		if (figura == CORCHEA)  		  	 fig = 250; else	
		if (figura == SEMICORCHEAPUNTILLO)   fig = 186; else	
		if (figura == SEMICORCHEA)  		 fig = 125; else	
		if (figura == FUSAPUNTILLO)  		 fig = 93; else	
		if (figura == FUSA) 				 fig = 62; else	
		if (figura == SEMIFUSA)  			 fig = 31; else	


		LCD.clear();

		Sound.playTone(fre,10);

		// wait a bit
		Thread.sleep(fig);
		
	}	
	
}
