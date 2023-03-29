package Salud;


public class Empleado extends Persona {
    private String cargo;
    private double valorHora;
    private double horasTrabajadas;
    private String departamento;

   
    public Empleado(String tipoDocumento, String documento, String nombre, String apellido, double peso, double estatura, int edad, String sexo, String cargo, double valorHora, double horasTrabajadas, String departamento) {
        super(tipoDocumento, edad, documento, nombre, peso, estatura, edad, sexo);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }
    
    public double calcularHonorarios() {
        double totalPagar = (horasTrabajadas * valorHora) * 0.966;
        return totalPagar;
    }
    
    public void mostrarEmpleado() {
        System.out.println("Tipo de documento: " + getTipoDoc());
        System.out.println("Número de documento: " + getDocumento());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Cargo: " + cargo);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Valor por hora: " + valorHora);
        System.out.println("Total a pagar: " + calcularHonorarios());
    }
}
