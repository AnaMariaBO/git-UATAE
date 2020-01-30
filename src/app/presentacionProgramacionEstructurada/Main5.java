package app.presentacionProgramacionEstructurada;

public class Main5 {

	public static void main(String[] args) {
		
		String miCadena = "Nunca mates una mosca sobre la cabeza de un tigre";
		//TODO EN MAYUSCULAS
		System.out.println(miCadena.toUpperCase());
		//todo en minusculas
		System.out.println(miCadena.toLowerCase());
		//solo la palabra nunca
		System.out.println(miCadena.substring(0, 5));
		//solo la palabra mosca
		System.out.println(miCadena.substring(16, 21));
		//cabeza
		System.out.println(miCadena.substring(31, 37));
		//posicion de la primera letra m
		System.out.println(miCadena.charAt(6));
		//devolver la longitud de la cadena
		int length = miCadena.length();       
        System.out.println("Longitud de la cadena es de :" + length);      
	}

}
