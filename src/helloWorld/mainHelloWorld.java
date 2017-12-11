/* HelloWorld 2.0
 
 Creado el 3 de diciembre de 2017 por Jacobo Diego Pita Hernández 
 para el Ciclo Formativo de Grado Superior de Desarrollo de Aplicaciones
 Multiplataforma */



package helloWorld;

import java.util.Calendar;


public class mainHelloWorld {
	

	public static void main (String[] args){
		
		Calendar calendario = Calendar.getInstance();
		int hora;
		
		hora = calendario.get(Calendar.HOUR_OF_DAY);
		
		if (hora >= 7 && hora <= 13) {
			
			System.out.println ("Buenos días mundo");
			
		}
		else if (hora >= 14 && hora <=20) {
			
			System.out.println ("Buenas tardes mundo");
			
		}
		else if ( (hora >=21 && hora <=23 ) || (hora >=0 && hora <=6)) {
			
			System.out.println ("Buenas noches mundo");
		}
		

		
		
		
		

		
	}
	
}
