
public class Main {

	public static void main(String[] args) {
		
		Cliente dyonathan = new Cliente();
		dyonathan.setNome("Dyonathan");
		
		Conta cc = new ContaCorrente(dyonathan);
		Conta poupanca = new ContaPoupanca(dyonathan);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
