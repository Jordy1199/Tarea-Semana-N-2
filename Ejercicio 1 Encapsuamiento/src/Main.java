public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Jordy", 9.5);

        e1.mostrarInformacion();

        e1.setNota(11);
        e1.setNota(8);

        e1.mostrarInformacion();
    }
}
