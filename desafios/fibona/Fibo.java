
class Fibonacci {
    int calcularFibonacci(int number) {
        if (number == 0) {
            return 0;
        } else {
            return number == 1 ? 1 : this.calcularFibonacci(number - 1) + this.calcularFibonacci(number - 2);
        }
    }
}

class Fibo {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i <= 6; i++) {
            int resultado = fibonacci.calcularFibonacci(i);
            System.out.println(resultado);
        }
    }

}