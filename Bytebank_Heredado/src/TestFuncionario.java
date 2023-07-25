
public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario miguel = new Funcionario();
		miguel.setNombre("Miguel");
		miguel.setDocumento("328456987");
		miguel.setSalario(2000);
		miguel.setTipo(0);
		
		System.out.println(miguel.getSalario());
		System.out.println(miguel.getBonificacion());
	}

}


