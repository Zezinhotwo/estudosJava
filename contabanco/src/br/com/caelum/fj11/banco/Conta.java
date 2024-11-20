package br.com.caelum.fj11.banco;

/**
 * Classe responsável por moldar as Contas do Banco
 *
 * @author Kaio Gonçalves Barcelos
 */

public class Conta {

	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data abertura;
	private int idConta;

	private static int proximoId = 1;

	public Conta() {
	}

	public Conta(String titular, int numero, String agencia, double saldo, Data abertura) {
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.abertura = abertura;
		this.idConta = proximoId++;
	}

	/**
	 * Metodo que incrementa o saldo.
	 * 
	 * @param valor
	 */
	public void deposita(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("O valor a ser depositado não pode ser negativo.");
		}
		this.saldo += valor;

	}

	// METODOS
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			System.out.println("Saque Efetuado Com SUCESSO!");
			this.saldo -= valor;
			return true;
		}
		System.out.println("Saque nao AUTORIZADO verifique seu saldo e tente novamente!");
		return false;
	}

	public boolean transfere(Conta destino, double valor) {
		if (this.saldo >= valor) {
			System.out.println("Deposito Efetuado Com Sucesso!");
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		}

		System.out.println("Deposito Nao Efetuado! Verifique Seu saldo.");
		return false;

	}

	public String formatada() {
		String formatada = this.abertura.getDia() + "/" + this.abertura.getMes() + "/" + this.abertura.getAno();
		return formatada;
	}

	public String getConta() {
		String dados = "\nTitular: " + this.titular;
		dados += "\nNumero: " + this.numero;
		dados += "\nID Conta: " + this.idConta;
		dados += "\nAgencia: " + this.agencia;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nRendimento: " + this.getRendimento();
		dados += "\nData de Abertura: " + this.formatada();
		return dados;
	}

	// Getters
	public static int getIdConta(Conta currentConta) {
		return currentConta.idConta;
	}

	public String getTitular() {
		return titular;
	}

	public int getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public Data getAbertura() {
		return abertura;
	}

	public double getRendimento() {
		this.saldo *= 1.1; // Aplica rendimento de 10%
		return this.saldo;
	}

	// Setters
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setAbertura(Data abertura) {
		this.abertura = abertura;
	}
}
