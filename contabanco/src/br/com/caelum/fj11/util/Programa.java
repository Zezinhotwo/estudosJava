package br.com.caelum.fj11.util;

import br.com.caelum.fj11.banco.*;

public class Programa {
	public static void main(String[] args) {
	    Conta c1 = new Conta("Kaio Goncalves", 1, "Banco Brasil", 1310.0, new Data(8, 11, 2024));

        Conta c2 = new Conta("Outra Conta", 2, "Banco Itau", 310.0, new Data(9, 11, 2024));

        Conta c3 = new Conta();

        c1.transfere(c2, 1000);
        c2.sacar(1000);
        c3.setAgencia("Bradesco");

        System.out.println(c1.getConta());
        System.out.println(c2.getConta());
        System.out.println();
        System.out.println(Conta.getIdConta(c1));
        System.out.println();
        System.out.println(c3.getAgencia());

	}
}
