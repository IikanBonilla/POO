/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
