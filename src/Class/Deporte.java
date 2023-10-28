package Class;

public class Deporte {
   
    //Atributos
    private String nombre;
    private Persona[] personas;
    
    //Constructor
    public Deporte(String nombre) {
        this.nombre = nombre;
        this.personas = new Persona[5];
    }
    
    //Metodo para agregar personas a deportes 
    public void agregarPersona(Persona persona){
        for (int i=0; i < personas.length; i++ ){
            if(personas[i] == null){
                personas[i] = persona;
                persona.agregarDeporte(this);
                break;    
            }
        }
    }
    
    //Metodo para remover personas a deportes 
    public void removerPersona(Persona persona){
        for (int i=0; i < personas.length; i++ ){
            if(personas[i] == persona){
                personas[i] = null;
                persona.agregarDeporte(null);
                break; 
            }
        }
    }
    
    //Metodo para mostrar las personas que practican el deporte
    public void mostrarPersona(){
        System.out.println("Persona que practica el deporte "+ nombre + ":");
        for(Persona persona : personas){
            if(persona != null){
                System.out.println(persona.getNombre() 
                        + "\nDe altura: " + persona.getAltura()
                        + "\nGenero: " + persona.getGenero()
                        + "\nEdad: " + persona.getEdad());
            }
        }
    }
    
    //Getters y Setters para cada atributo

    public String getNombre() {
        return nombre;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }
    
    
    
}
