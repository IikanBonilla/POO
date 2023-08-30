package com.mycompany.exercise_1;

import call.unicauca.edu.co.ex_atrr;
//Se importó la clase call.unicauca.edu.co.ex_atrr
public class exercise_class {
    
   
    public static void main(String[] args) {
        
        ex_atrr atrr = new ex_atrr();
        
        System.out.println("Access var: ");
        System.out.println("Impoprt name 1: " + atrr.name);
        
        atrr.name = "rodrigo";
        
        System.out.println("Import name 2: " + atrr.name);
        System.out.println("Import year: " + atrr.hbd);
        
        
                
    }

}
