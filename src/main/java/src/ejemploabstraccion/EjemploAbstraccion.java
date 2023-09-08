package ejemploabstraccion;

public class EjemploAbstraccion {

    public static void main(String[] args) {
     // Crear un objeto Circulo
        Circulo circulo = new Circulo(5.0);

        // Calcular y mostrar el área del círculo
        double area = circulo.calcularArea();
        System.out.println("Area del circulo: " + area);
    }
    
}
