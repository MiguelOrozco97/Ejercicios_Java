package java_primeros_pasos;

public class ejercicio_tabla_multiplicacion {
	public static void main(String[] args) {
		for (int i=0; i<=10; i++) {
			for(int multiplicacion=0; multiplicacion<=10; multiplicacion++) {
				System.out.print(i*multiplicacion);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
