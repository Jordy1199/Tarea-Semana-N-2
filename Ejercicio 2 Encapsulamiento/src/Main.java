public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta(100);

        c1.mostrarSaldo();

        c1.depositar(50);
        c1.retirar(30);

        c1.mostrarSaldo();
    }
}