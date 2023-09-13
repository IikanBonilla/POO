/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractClass;

/**
 *
 * @author iikan
 */
public abstract class pajaro extends Animal{
    
     private String especie;
    
    public pajaro(String nombre, String tipo_alimentacion, int edad, String especie) {
        super(nombre, tipo_alimentacion, edad);
        
        this.especie = especie;
        
    }

       public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void mostrar(){
        System.out.println(getNombre() + "-"+getTipo_alimentacion()+"-"+getEdad()+"-"+getEspecie());
    }

    @Override
    public void Alimentarse() {
        System.out.println("Me alimento de lombrices");
    }
    
}
