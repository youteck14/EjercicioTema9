
public class Cliente extends Persona{
    private int credito;

    public Cliente(int edad, String nombre, int telefono, int credito){
        super(edad,nombre,telefono);
        this.credito = credito;
    }
    public void mostrarDatos(){
        System.out.println("Edad: "+getEdad()
            +"\nNombre: "+getNombre()
            +"\nTelefono: "+getTelefono()
            +"\nCredito: "+this.credito);
    }
}
