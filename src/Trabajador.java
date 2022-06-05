class Trabajador extends Persona{
    private int salario;

    public Trabajador(int edad, String nombre, int telefono, int salario){
        super(edad,nombre,telefono);
        this.salario = salario;
    }
    public void mostrarDatos(){
        System.out.println("Edad: "+getEdad()
            +"\nNombre: "+getNombre()
            +"\nTelefono: "+getTelefono()
            +"\nSalario: "+this.salario);
    }
}
