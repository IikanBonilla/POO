package Class;

/**
 *
 * @author IngSis
 */
public class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;
  private double tarifaPorHora;

  public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaPorHora) {
    super(nombre, 0);
    this.horasTrabajadas = horasTrabajadas;
    this.tarifaPorHora = tarifaPorHora;
  }

  public int getHorasTrabajadas() {
    return this.horasTrabajadas;
  }

  public void setHorasTrabajadas(int horasTrabajadas) {
    this.horasTrabajadas = horasTrabajadas;
  }

  public double getTarifaPorHora() {
    return this.tarifaPorHora;
  }

  public void setTarifaPorHora(double tarifaPorHora) {
    this.tarifaPorHora = tarifaPorHora;
  }

  @Override
  public double calcularSalario() {
    return getHorasTrabajadas() * getTarifaPorHora();
  }
    
}