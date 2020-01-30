package app.presentacionProgramacionEstructurada;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int numero = 2;
		  System.out.println("¿que tipo de vehiculo desea?" + numero);
	        switch (numero) { 
	            case 1:
	                System.out.println("microcoche");
	                break;
	            case 2:
	                System.out.println("automoviles compactos");
	                break;
	            case 3:
	                System.out.println("automoviles ultracompactos");
	                break;
	            case 4:
	                System.out.println("atomovil familiar");
	                break;
	            case 5:
	                System.out.println("vehiculo de lujo");
	                break;
	            case 6:
	                System.out.println("automovil deportivo");
	                break;
	            case 7:
	                System.out.println("descapotable");
	                break;
	            case 8:
	                System.out.println("todoterreno");
	                break;
	            default:
	                System.out.println("No disponemos de ese vehiculo");
	        }
	}

}
