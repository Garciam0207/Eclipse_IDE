
public class Cuenta {

	double saldo;
	int agencia;
	int numero;
	Cliente titular = new Cliente();

	public void depositar(double deposito) {

		this.saldo += deposito;
	}
	
	public boolean retirar(double retiro) {
		if (this.saldo >= retiro) {
			this.saldo -= retiro;
			return true;
		} 
		return false;
	}
	
	public boolean transferir (double valor,Cuenta cuenta) {
		
		if (this.saldo >= valor) {
			this.saldo -=  valor;
			cuenta.depositar(valor);
			return true;
		}
		return false;
		
	}

}