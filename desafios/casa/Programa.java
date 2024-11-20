class Casas {
    String cor;
    boolean porta1;
    boolean porta2;
    boolean porta3;

    void pinta(String novaCor) {
        this.cor = novaCor;
    }

    int quantasPortasAbertas() {
        int portasAbertas = 0;
        if (porta1) portasAbertas++;
        if (porta2) portasAbertas++;
        if (porta3) portasAbertas++;
        return portasAbertas;
    }
}

class Programa {
    public static void main(String[] args) {
        Casas minhaCasa = new Casas();
        minhaCasa.cor = "Amarela";
        minhaCasa.porta1 = false;  // Porta fechada
        minhaCasa.porta2 = true;   // Porta aberta
        minhaCasa.porta3 = true;   // Porta aberta

        System.out.println("Cor da casa: " + minhaCasa.cor);
        System.out.println("Quantidade de portas abertas: " + minhaCasa.quantasPortasAbertas());
    }
}
