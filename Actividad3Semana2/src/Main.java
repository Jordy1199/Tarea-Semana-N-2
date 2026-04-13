public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("Lucía", 100.0);

        cuenta1.mostrarInformacion();
        cuenta1.depositar(50.0);
        cuenta1.mostrarInformacion();
        cuenta1.retirar(30.0);
        cuenta1.mostrarInformacion();
    }
}
