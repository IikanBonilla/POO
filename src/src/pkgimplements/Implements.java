package pkgimplements;
import Class.Forma;
import Class.Circulo;
import Class.Cuadrado;
import Class.Paralelogramo;
import Class.Triangulo;
public class Implements {

    public static void main(String[] args) {
        Cuadrado miCuadrado = new Cuadrado(5);
        Circulo miCirculo = new Circulo(3);
        Triangulo miTriangulo = new Triangulo(3,3,3,3);
        Paralelogramo miParalelogramo = new Paralelogramo(5,2,3);
        // Calcular y mostrar áreas y perímetros
        System.out.println("Area del cuadrado: " + miCuadrado.calcularArea());
        System.out.println("Perimetro del cuadrado: " + miCuadrado.calcularPerimetro());

        System.out.println("\nArea del circulo: " + miCirculo.calcularArea());
        System.out.println("Perimetro del circulo: " + miCirculo.calcularPerimetro());
        
        System.out.println("\nArea del triangulo: " + miTriangulo.calcularArea());
        System.out.println("Perimetro del triangulo: " + miTriangulo.calcularPerimetro());
        
        System.out.println("\nArea del paralelogramo: " + miParalelogramo.calcularArea());
        System.out.println("Perimetro del paralelogramo: " + miParalelogramo.calcularPerimetro());
    }
    
}

