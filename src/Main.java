public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(23,"Yohan",98374234,1500);
        cliente.mostrarDatos();
        System.out.println("=================================");
        Trabajador trabajador = new Trabajador(26,"Saulo",93249533,2000);
        trabajador.mostrarDatos();

    }
}
