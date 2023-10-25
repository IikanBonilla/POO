/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author iikan
 */
public class Paralelogramo implements Forma{
    double altura, base, lado;

    public Paralelogramo(double base, double altura, double lado) {
        this.altura = altura;
        this.base = base;
        this.lado = lado;
        
    }
    
    @Override
    public double calcularArea(){
        return (base * altura);
    }
     @Override
    public double calcularPerimetro(){
        return 2 * (lado + base);
    }
}
