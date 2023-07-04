
public class TestReferencia2 {
	public static void main(String[] args) {
		Cliente mario = new Cliente();
		mario.nombre = "Mario";
		mario.documento = "0801190000024";
		mario.telefono = "22222222";
		
		Cuenta cuentaDeMario = new Cuenta();
		cuentaDeMario.agencia = 1;
		cuentaDeMario.titular = mario;
		System.out.println(cuentaDeMario.titular.documento);
		System.out.println(cuentaDeMario.titular);
		System.out.println(mario);
	}

}
