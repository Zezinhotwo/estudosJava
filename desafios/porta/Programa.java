class Porta {
    boolean aberta;
    String cor;
    double domensaoX;
    double domensaoY;
    double domensaoZ;

    void abre() {
        if (this.aberta == false) {
            this.aberta = true;
        }
    }

    void fecha() {
        if (this.aberta == true) {
            this.aberta = false;
        }
    }

    void pinta(String novaCor) {
        this.cor = novaCor;
    }

    boolean estaAberta() {
        if (this.aberta == false) {
            return false;
        }
        return true;
    }
}

class Programa {
    public static void main(String[] args) {
        Porta porta = new Porta();
        porta.aberta = false;
        porta.cor = "branca";
        porta.domensaoX = 1.30;
        porta.domensaoY = 2.10;
        porta.domensaoZ = 0.3;
        
        porta.abre();
        System.out.println("Porta está aberta? " + porta.estaAberta());
        
        System.out.println("Cor da porta antes de pintar: " + porta.cor);
        porta.pinta("azul");  // Pinta a porta de azul
        System.out.println("Cor da porta após pintar: " + porta.cor);
    }
}
