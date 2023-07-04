
public class pruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.saldo = 300;
		miCuenta.depositar(300);
		System.out.println(miCuenta.saldo);
		miCuenta.retirar(200);
		System.out.println(miCuenta.saldo);
		Cuenta cuentaDeJimena = new Cuenta();
		cuentaDeJimena.depositar(1000);
		boolean puedeTrasferir =cuentaDeJimena.transferir(300, miCuenta);
		if (puedeTrasferir) {
			System.out.println("Tranferencia exitosa");
		}else {
			System.out.println("no es posible");
		}
		System.out.println(cuentaDeJimena.saldo);
		System.out.println(miCuenta.saldo);
	}
}
