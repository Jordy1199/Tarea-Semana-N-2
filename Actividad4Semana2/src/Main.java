public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("Laptop", 800.0, 5);

        Producto p2 = new Producto();

        Producto p3 = new Producto(true);
        p3.nombre = "Mouse";
        p3.precio = 15.0;
        p3.cantidad = 10;

        p1.mostrarInformacion();
        p2.mostrarInformacion();
        p3.mostrarInformacion();
    }
}
