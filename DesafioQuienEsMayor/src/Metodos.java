import java.util.Iterator;
import java.util.Scanner;

public class Metodos {

	public static void ingresarFechas() {
	
				
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese su la fecha de nacimiento de la primera persona en el siguiente formato DD/MM/AAAA");
		String fecha1 = sc.next();
		System.out.println("Fecha1 ingresada con éxito\n");
		
		System.out.println("Ingrese su la fecha de nacimiento de la segunda persona en el siguiente formato DD/MM/AAAA");
		String fecha2 = sc.next();
		System.out.println("Fecha2 ingresada con éxito\n");
		
		
		//substring para extraer exactamente el año, mes y día
		String anio1 = fecha1.substring(6,10);
		String anio2 = fecha2.substring(6,10);
//		System.out.println(anio1);
//		System.out.println(anio2);
		
		String mes1 = fecha1.substring(3,5);
		String mes2 = fecha2.substring(3,5);
//		System.out.println(mes1);
//		System.out.println(mes2);
		
		String dia1 = fecha1.substring(0,2);
		String dia2 = fecha2.substring(0,2);
//		System.out.println(dia1);
//		System.out.println(dia2);
		
//		Parseo de String a int variable dia
//		int dia1 = Integer.parseInt(fecha1.substring(0,2));
//		int dia2 = Integer.parseInt(fecha2.substring(0,2));
//		System.out.println(dia1);
//		System.out.println(dia2);
//		System.out.println(dia1+dia2);
		
		
//		Concatenar las fechas para hacer un número comparable
		String cadenaFecha1 = anio1 + mes1 + dia1;
		String cadenaFecha2 = anio2 + mes2 + dia2;
//		System.out.println(cadenaFecha1);
//		System.out.println(cadenaFecha2);
		
//		Parseo de String concatenado a int para comparar
		int fechaComparada1 = Integer.parseInt(cadenaFecha1);
		int fechaComparada2 = Integer.parseInt(cadenaFecha2);
		
//		Comparación cual de las dos fechas es mayor
		if (fechaComparada1<fechaComparada2) {
			System.out.println("La persona1 es mayor");
		
		} else if (fechaComparada1>fechaComparada2) {
			System.out.println("La persona2 es mayor");
		}
		
		else if (fechaComparada1==fechaComparada2) {
			System.out.println("Persona1 y Persona2 tienen la misma edad");
		}
		
	
	
	
}
}

