package Class;

/**
 *
 * @author IngSis
 */
public abstract class Empleado {
  private String nombre;
  private double salarioBase;

  public Empleado(String nombre, double salarioBase) {
    this.nombre = nombre;
    this.salarioBase = salarioBase;
  }

  public String getNombre() {
    return this.nombre;
  }

  public double getSalarioBase() {
    return this.salarioBase;
  }
  public abstract double calcularSalario();
}