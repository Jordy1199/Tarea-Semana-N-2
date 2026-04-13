class Estudiante {
    private String nombre;
    private double nota;

    // Constructor
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        setNota(nota);
    }
    // Getter
    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }
    // Setter con validación
    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida");
        }
    }
    // Método para mostrar datos
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota: " + nota);
    }
}
