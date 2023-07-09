package java_primeros_pasos;

public class Ejemplo_condicionales {
	public static void main(String[] args) {
		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja = cantidadPersonas>1;
		boolean puedeEntrar = edad >= 18 && esPareja;
		
		if(puedeEntrar){
			System.out.println("Usted puede entrar");
		}
		else {
			System.out.println("Usted no puede entrar");
		}
	}
}
