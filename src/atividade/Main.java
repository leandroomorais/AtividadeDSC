package atividade;

public class Main {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setTitular("Leandro");
		conta.setSaldo(1000);
		
		System.out.println("Titular: " + conta.getTitular());
		System.out.println("Saldo: " + conta.getSaldo());
		
	
	}

}
