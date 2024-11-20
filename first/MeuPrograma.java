class Conta {
    int numero;
    String titular;
    double saldo;

    boolean sacar(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            double novoSaldo = this.saldo - valor;
            this.saldo = novoSaldo;
            return true;
        }
    }

    void depositar(double quantidade) {
        this.saldo += quantidade;
    }

    boolean transferePara(Conta destino, double valor) {
        boolean retirou = this.sacar(valor);
        if (retirou == false) {
            // saque nao autorizado
            return false;
        } else {
            destino.depositar(valor);
            return true;
        }
    }


}

class MeuPrograma {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.depositar(100);
        Conta c2 = c1; // linha importante!
        c2.depositar(200);
        System.out.println(c1.saldo);
        System.out.println(c2.saldo);
    }

}