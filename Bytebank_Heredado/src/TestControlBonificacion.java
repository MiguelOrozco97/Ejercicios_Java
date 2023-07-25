
public class TestControlBonificacion {

	public static void main(String[] args) {
		Funcionario miguel = new Funcionario();
		miguel.setSalario(2000);
		
		Gerente ximena = new Gerente();
		ximena.setSalario(10000);
		
		Contador javier = new Contador();
		javier.setSalario(5000);
		
		ControlBonificacion control_1 = new ControlBonificacion();
		control_1.registrarSalario(miguel);
		control_1.registrarSalario(ximena);
		control_1.registrarSalario(javier);
	}

}
