/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author iikan
 */
public class Triangulo implements Forma{
    double base, altura, ladoa, ladob;

    public Triangulo(double base, double altura, double ladoa, double ladob) {
        this.base = base;
        this.altura = altura;
        this.ladoa = ladoa;
        this.ladob = ladob;
    }
    
    @Override
    public double calcularArea(){
        return (base * altura)/2;
    }
    @Override
    public double calcularPerimetro(){
        return (ladoa + ladob + base);
    }
}
