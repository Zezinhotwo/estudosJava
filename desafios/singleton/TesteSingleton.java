class FabricaDeCarro {

    private static FabricaDeCarro instance = null;

    private FabricaDeCarro() {
    }

    static FabricaDeCarro getInstance() {
        if (instance == null)
            instance = new FabricaDeCarro();
        return instance;
    }

}
public class TesteSingleton {
    public static void main(String[] args) {
        FabricaDeCarro fabrica1 = FabricaDeCarro.getInstance();
        FabricaDeCarro fabrica2 = FabricaDeCarro.getInstance();

        // Verifica se ambas as instâncias são iguais
        System.out.println(fabrica1); // Chama toString() automaticamente
        System.out.println(fabrica2);

        // Mostra que são a mesma instância
        System.out.println(fabrica1 == fabrica2); // true
    }
}