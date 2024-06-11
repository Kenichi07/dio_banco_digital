package classes;

public class ContaPoupanca extends Conta{

	@Override
	public void imprimirExtrato() {
		System.out.println("--- Extrato Conta Pouponça ---");
		super.imprimirInfosComuns();
	}

}
