package Class;

/**
 *
 * @author IngSis
 */
public class EmpleadoAsalariado extends Empleado{
  private double deducciones;

  public EmpleadoAsalariado(String nombre, double salarioBase, double deducciones) {
    super(nombre, salarioBase);
    this.deducciones = deducciones;
  }

  public double getDeducciones() {
    return this.deducciones;
  }

  public void setDeducciones(double deducciones) {
    this.deducciones = deducciones;
  }

  @Override
  public double calcularSalario() {
    return getSalarioBase() - getDeducciones();
  }

    public void getDeducciones(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
