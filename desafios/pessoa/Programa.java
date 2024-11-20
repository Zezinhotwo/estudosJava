class Pessoa {
    String nome;
    int idade;

    void fazAniversario(){
        this.idade+=1;
        String niver= "\n feliz aniversario "+  this.nome;
        niver += " agora voce tem " + this.idade;
        System.out.println(niver); 
    }
    
}

class Programa{
    public static void main (String[] args){
        Pessoa kaio = new Pessoa();
        kaio.nome="Kaio gonçalves";
        kaio.idade= 19;
        kaio.fazAniversario();
    }
}