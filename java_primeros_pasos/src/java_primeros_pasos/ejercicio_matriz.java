package java_primeros_pasos;

public class ejercicio_matriz {
	public static void main(String[] args) {
		for(int filas =0; filas<=10; filas++) {
			for(int columnas=0; columnas<=10; columnas++) {
				if(columnas> filas) {
					break;
				}
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}
