package Salud;

import java.util.Scanner;


    /*Reto1 */
    /* 
    public class Persona {
        public static void main(String[] args) {
            
        }
        
   private String tipoDocumento;
   private int documento;
   private  String nombre;
   private String apellido;
   private double peso;
   private double estatura;
   private int edad;
   private char sexo;
   

    public void pedirDatos() {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese el tipo de documento: ");
        tipoDocumento = lectura.next();
        System.out.print("Ingrese el número de documento: ");
        documento = lectura.nextInt();
        System.out.print("Ingrese el nombre: ");
        nombre = lectura.next();
        System.out.print("Ingrese el apellido: ");
        apellido = lectura.next();
        System.out.print("Ingrese el peso (en kg): ");
        peso = lectura.nextDouble();
        System.out.print("Ingrese la estatura (en metros): ");
        estatura = lectura.nextDouble();
        System.out.print("Ingrese la edad: ");
        edad = lectura.nextInt();
        System.out.print("Ingrese el sexo (M/F): ");
        sexo = lectura.next().charAt(0);
    }

    public void mostrarPersona() {
        System.out.println("Tipo de documento: " + tipoDocumento);
        System.out.println("Número de documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }

    public String calcularImc() {
        double imc = peso / (estatura * estatura);
        System.out.println("IMC: " + imc);
        if (imc < 20) {
            System.out.println("Peso está bien.");
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("Peso ideal.");
        } else {
            System.out.println("Sobrepeso.");
        }
        return apellido;
    }

    public void mayorEdad() {
    }
}
    */

/* */

/*Reto2 */
/* 
private String tipoDocumento;
   private int documento;
   private  String nombre;
   private String apellido;
   private double peso;
   private double estatura;
   private int edad;
   private char sexo;
   

    public void pedirDatos() {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese el tipo de documento: ");
        tipoDocumento = lectura.next();
        System.out.print("Ingrese el número de documento: ");
        documento = lectura.nextInt();
        System.out.print("Ingrese el nombre: ");
        nombre = lectura.next();
        System.out.print("Ingrese el apellido: ");
        apellido = lectura.next();
        System.out.print("Ingrese el peso (en kg): ");
        peso = lectura.nextDouble();
        System.out.print("Ingrese la estatura (en metros): ");
        estatura = lectura.nextDouble();
        System.out.print("Ingrese la edad: ");
        edad = lectura.nextInt();
        System.out.print("Ingrese el sexo (M/F): ");
        sexo = lectura.next().charAt(0);
    }

    public void mostrarPersona() {
        System.out.println("Tipo de documento: " + tipoDocumento);
        System.out.println("Número de documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }
public String calcularImc() {
    double imc = this.peso / Math.pow(this.estatura, 2);

    if (imc < 20) {
        return "PESOBAJO";
    } else if (imc >= 20 && imc <= 25) {
        return "PESOIDEAL";
    } else {
        return "SOBREPESO";
    }
}
    public boolean mayorEdad() {
        return edad >= 18;
        
/* Reto3*/

public class Persona {
    public static void main(String[] args) {
        
    }

    private String tipoDocumento;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;

    // Constructores
    

    public Persona(String tipoDocumento, int documento, String nombre, String apellido, double peso, double estatura, int edad, String sexo) {
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }

    // Métodos públicos
    public void pedirDatos() {
        // Código para solicitar los datos de la persona
    }

    public void mostrarPersona() {
        // Código para imprimir los datos ingresados
    }

  
    public void mayorEdad() {
        // Código para determinar si la persona es mayor de edad
    }

    public void calcularImc() {
        // Código para calcular el IMC de la persona
    }

    // Métodos getters y setters para los atributos privados
    public String getTipoDoc() {
        return tipoDocumento;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDocumento = tipoDoc;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
