class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data abertura;

    private static int proximoId = 1;
    private int idConta;

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

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            System.out.println("Saque Efetuado Com Sucesso!");
            this.saldo -= valor;
            return true;
        }

        System.out.println("Saque Nao Efetuado! Verifique Seu saldo.");
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
}

class Data {
    private int dia;
    private int mes;
    private int ano;

    Data(int dia, int mes, int ano) {
        if (dia > 29 && mes == 2) {
            throw new IllegalArgumentException("Esta data nao e valida ");
        }
        this.dia = dia;
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

class Banco {
    public static void main(String[] args) {
        Conta c1 = new Conta("Kaio Goncalves", 1, "Banco Brasil", 1310.0, new Data(8, 11, 2024));

        Conta c2 = new Conta("Outra Conta", 2, "Banco Itau", 310.0, new Data(9, 11, 2024));

        Conta c3 = new Conta();

        c1.transfere(c2, 1000);
        c2.saca(1000);
        c3.setAgencia("Bradesco");

        System.out.println(c1.getConta());
        System.out.println(c2.getConta());
        System.out.println();
        System.out.println(Conta.getIdConta(c1));
        System.out.println();
        System.out.println(c3.getAgencia());

    }
}
