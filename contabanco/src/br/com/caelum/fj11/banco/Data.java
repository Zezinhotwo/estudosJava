package br.com.caelum.fj11.banco;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data() {
	}

	public Data(int dia, int mes, int ano) {
		this.ano = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// getters
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	// setters
	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
