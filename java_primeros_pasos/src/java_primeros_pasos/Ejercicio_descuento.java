package java_primeros_pasos;

public class Ejercicio_descuento {
	public static void main(String[] args) {
		double valor_compra = 800.0;
		double descuento_1=0.1;
		double descuento_2=0.15;
		double descuento_3=0.2;
		boolean condicional_1 = valor_compra>=100.0 && valor_compra<=199.99;
		boolean condicional_2 = valor_compra>=200.0 && valor_compra<=299.99;
		boolean condicional_3 = valor_compra>=300;
		double calculo_descuento_1=valor_compra-(valor_compra*descuento_1);
		double calculo_descuento_2=valor_compra-(valor_compra*descuento_2);
		double calculo_descuento_3=valor_compra-(valor_compra*descuento_3);
		
		if(condicional_1){  //descuento del 10%
			System.out.println("su compra tiene un descuento del 10%");
			System.out.println("Total: " + calculo_descuento_1 );
		}
		else if(condicional_2){
			System.out.println("su compra tiene un descuento del 15%");
			System.out.println("Total: " + calculo_descuento_2 );
		}
		else if(condicional_3){
			System.out.println("su compra tiene un descuento del 20%");
			System.out.println("Total: " + calculo_descuento_3 );
		}
		else {
			System.out.println("su compra no tiene descuento");
			System.out.println("Total: " + valor_compra);
		}
	}
}
