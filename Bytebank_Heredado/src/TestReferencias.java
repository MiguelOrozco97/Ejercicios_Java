
public class TestReferencias {
	
	public static void main(String[] args) {
		//el elemento mas general puede ser 
		//adaptado al elemento mas especifico.
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Miguel");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Ximena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
	}
}
