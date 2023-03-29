package Principal;
        /*Reto1*/
/* 
import Salud.Empleado;
import Salud.Persona;
public class Inicio {
    public static void main(String[] args) {
Persona persona1 = new Persona();
        persona1.pedirDatos();
        persona1.mostrarPersona();
        persona1.calcularImc();
        persona1.mayorEdad(); 
    }
}
*/
        
/* 
        /*Reto2*/
        /* 
        import Salud.Persona;
        public class Inicio {
            public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.pedirDatos();
        persona1.mostrarPersona();

     String imc = persona1.calcularImc();

    // Verificar si la persona es mayor de edad
    persona1.mayorEdad();

    // Imprimir mensaje según el IMC
    if (imc.equals("PESOBAJO")) {
        System.out.println("El peso está por debajo de lo ideal");
    } else if (imc.equals("PESOIDEAL")) {
        System.out.println("El peso es ideal");
    } else if(imc.equals("SOBREPESO")) {
        System.out.println("Tiene sobrepeso");
    }
}
        }
        */

         /*Reto3 */
         /* 
          import java.util.Scanner;
          import Salud.Empleado;
          import Salud.Persona;
        public class Inicio {
            
            public static void main(String[] args) {
                Scanner lectura=new Scanner(System.in);
                 String cargo;
                 double valorHora;
                 double horasTrabajadas;
                String departamento;
            
                Empleado empleado = new Empleado("tipoDocumento", "documento", "nombre", "apellido", 70.0, 1.75, 30, "M", "cargo", 20.0, 8.0, "departamento"); 
                empleado.pedirDatos()
                System.out.println("Ingrese el cargo del empleado");
                cargo=lectura.next();
                System.out.println("Ingrese el valor por hora");
                valorHora=lectura.nextInt();
                System.out.println("Ingrese las horas trabajadas del empleado");
                horasTrabajadas=lectura.nextInt();
                System.out.println("Ingrese el departamento");
                departamento=lectura.next();
                empleado.mostrarPersona();
                System.out.println("Total a pagar: " + empleado.calcularHonorarios());
            }
        }
*/


                /*Reto4 Clase */
/* 
                import java.util.Scanner;


             import FigurasG.Triangulo;
             import FigurasG.Rectangulo;
             import FigurasG.Circulo;
         
               public class Inicio {
                    public static void main(String[] args) {
                        float lado;
                        Scanner lectura = new Scanner (System.in);
                System.out.println("Ingrese el valor del lado del cuadrado");
                lado= lectura.nextFloat();

                Cuadrado c1= new Cuadrado(lado);
                c1.calcularArea();
                lectura.close();
                    }
                }
            */
               
            

               import java.util.Scanner;
               import FigurasG.Triangulo;
               import FigurasG.Rectangulo;
               import FigurasG.Circulo;
               public class Inicio {
                   public static void main(String[] args) {
                       Scanner lectura = new Scanner(System.in);
                       int opcion;
                       boolean continuar = true;
                       while (continuar) {
                           System.out.println("\n-- MENÚ --");
                           System.out.println("1. Cuadrado");
                           System.out.println("2. Triángulo");
                           System.out.println("3. Rectángulo");
                           System.out.println("4. Círculo");
                           System.out.println("5. Salir");
                           System.out.print("Elige una opción: ");
                           opcion = lectura.nextInt();
                           switch (opcion) {
                               
                               case 1:
                                   System.out.print("Ingresa la base del triángulo: ");
                                   float base = lectura.nextFloat();
                                   System.out.print("Ingresa la altura del triángulo: ");
                                   float altura = lectura.nextFloat();
                                   Triangulo triangulo = new Triangulo(base, altura);
                                   triangulo.calcularArea();
                                   break;
                               case 2:
                                   System.out.print("Ingresa la base del rectángulo: ");
                                   float baseRect = lectura.nextFloat();
                                   System.out.print("Ingresa la altura del rectángulo: ");
                                   float alturaRect = lectura.nextFloat();
                                   Rectangulo rectangulo = new Rectangulo(baseRect, alturaRect);
                                   rectangulo.calcularArea();
                                   break;
                               case 3:
                                   System.out.print("Ingresa el radio del círculo: ");
                                   float radio = lectura.nextFloat();
                                   Circulo circulo = new Circulo(radio);
                                   circulo.calcularArea();
                                   break;
                               case 4:
                                   continuar = false;
                                   break;
                               default:
                                   System.out.println("Opción no válida, intente de nuevo.");
                                   break;
                           }
                       }
                       lectura.close();
                       System.out.println("Este programa a terminado gracias por utilizarlo.");
                    }
               }
               
                
          
        