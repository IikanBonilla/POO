package relacion.muchos.a.muchos;
import Class.Deporte;
import Class.Persona;
public class RelacionMuchosAMuchos {

    public static void main(String[] args) {
       
        //Crear objetos de Persona
        Persona persona1 = new Persona("Perisic","Masculino",1.86,34);
        Persona persona2 = new Persona("Laura","Femenino",1.70,17);
        Persona persona3 = new Persona("Maryuri","Femenino",1.75,18);
        Persona persona4 = new Persona("Fabian","Masculino",1.85,18);
        
        //Crear objetos de Deporte
        Deporte deporte1 = new Deporte("Voleibol");
        Deporte deporte2 = new Deporte("Futbol");
        Deporte deporte3 = new Deporte("Basquetball");
        Deporte deporte4 = new Deporte("Natacion");
        
        //Asignar personas a deportes
        deporte1.agregarPersona(persona1);
        deporte1.agregarPersona(persona2);
        deporte2.agregarPersona(persona4);
        deporte3.agregarPersona(persona3);
        deporte3.agregarPersona(persona4);
       
        
        //Mostrar las personas que practican cada deporte
        deporte1.mostrarPersona();
        System.out.println("-----------------------------------------");
        deporte2.mostrarPersona();
        System.out.println("-----------------------------------------");
        deporte3.mostrarPersona();
        System.out.println("-----------------------------------------");
        deporte4.mostrarPersona();
        System.out.println("-----------------------------------------");
        
        //Asignar deportes a personas
        persona1.agregarDeporte(deporte2);
        persona2.agregarDeporte(deporte3);
        persona3.agregarDeporte(deporte2);
        persona4.agregarDeporte(deporte1);
      
        //Mostrar los deportes que practica cada persona
        persona1.mostrarDeporte();
        System.out.println("-----------------------------------------");
        persona2.mostrarDeporte();
        System.out.println("-----------------------------------------");
        persona3.mostrarDeporte();
        System.out.println("-----------------------------------------");
        persona4.mostrarDeporte();
    }
    
}
