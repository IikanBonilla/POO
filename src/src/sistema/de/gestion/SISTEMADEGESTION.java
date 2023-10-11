package sistema.de.gestion;
import Class.Empleado;
import Class.EmpleadoAsalariado;
import Class.EmpleadoPorHoras;
import java.util.ArrayList;

public class SISTEMADEGESTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EmpleadoAsalariado empleado1 = new EmpleadoAsalariado("Juan", 1000, 100);
        EmpleadoAsalariado empleado2 = new EmpleadoAsalariado("Miguel", 5000, 300);
        EmpleadoAsalariado empleado3 = new EmpleadoAsalariado("Daniel", 3000, 200);
        EmpleadoAsalariado empleado4 = new EmpleadoAsalariado("Carlos", 4000, 500);
        EmpleadoAsalariado empleado5 = new EmpleadoAsalariado("Iikan", 10000, 1000);
        EmpleadoPorHoras empleado6 = new EmpleadoPorHoras("Sebastian", 10, 20);
        EmpleadoPorHoras empleado7 = new EmpleadoPorHoras("Jose", 18, 30);
        EmpleadoPorHoras empleado8 = new EmpleadoPorHoras("Pacho", 15, 24);
        EmpleadoPorHoras empleado9 = new EmpleadoPorHoras("Harold", 16, 23);
        EmpleadoPorHoras empleado10 = new EmpleadoPorHoras("Martha", 6, 35);

    
    ArrayList<EmpleadoAsalariado> listaEmpleadosSalario = new ArrayList<>();
    listaEmpleadosSalario.add(empleado1);
    listaEmpleadosSalario.add(empleado2);
    listaEmpleadosSalario.add(empleado3);
    listaEmpleadosSalario.add(empleado4);
    listaEmpleadosSalario.add(empleado5);
  
   
    
    System.out.println("----Empleados Asalariados----");
    for (Empleado empleadoSalariado : listaEmpleadosSalario) {
      System.out.println(empleadoSalariado.getNombre() + " tiene un salario de " + empleadoSalariado.calcularSalario() + " pesos.");
    }
    
     ArrayList<EmpleadoPorHoras> listaEmpleadosHoras = new  ArrayList<>();
    listaEmpleadosHoras.add(empleado6);
    listaEmpleadosHoras.add(empleado7);
    listaEmpleadosHoras.add(empleado8);
    listaEmpleadosHoras.add(empleado9);
    listaEmpleadosHoras.add(empleado10);
    
    System.out.println("\n\n----Empleados por horas----");
    for (Empleado empleadoHoras : listaEmpleadosHoras) {
      System.out.println(empleadoHoras.getNombre() + " tiene un salario de " + empleadoHoras.calcularSalario() + " pesos.");
    }
    
    empleado6.setHorasTrabajadas(4);
        System.out.println("\n\n----Verificacion empleados por hora----");
for (Empleado empleadoHoras : listaEmpleadosHoras) {
      System.out.println(empleadoHoras.getNombre() + " tiene un salario de " + empleadoHoras.calcularSalario() + " pesos.");
    }
        System.out.println("\n\n----empleado especifico----");
System.out.println(empleado3.getNombre() + " tiene un salario de " + empleado3.calcularSalario() + " pesos.");
  }  
    
}
