public class Producto {
    String nombre;
    double precio;
    int cantidad;

    //Con parámetros
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    //Con valores fijos
    public Producto() {
        this.nombre = "Celular";
        this.precio = 100.0;
        this.cantidad = 1;
    }

    //Constructor vacío
    public Producto(boolean vacio) {
        // No inicializa nada
    }

    // Método para mostrar datos
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("----------------------");
    }
}
