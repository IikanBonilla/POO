package Class;
public class Persona {
    //Atributos
    private String nombre,genero;
    private double altura;
    private int edad;
    private Deporte[] deportes;

    //Constructor
    public Persona(String nombre, String genero, double altura, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.altura = altura;
        this.edad = edad;
        this.deportes =new Deporte[5];
    }    
    //Metodo para agregar deportes a personas 
    public void agregarDeporte(Deporte deporte){
        for(int i = 0; i < deportes.length; i++){
            if(deportes[i]== null){
                deportes[i] = deporte;
                break;
            }
        }        
    }    
    //Metodo para remover deportes a personas
    public void removerDeporte(Deporte deporte){       
        for(int i = 0; i < deportes.length; i++){
            if(deportes[i]== deporte){
                deportes[i] = null;
                break;
            }
        } 
    }    
    //Metodo para mostrar los deportes que juega cada persona
    public void mostrarDeporte(){
        System.out.println("Deporte que juega "+ nombre + ":");
        for (Deporte deporte : deportes){
            if(deporte != null){
                System.out.println(deporte.getNombre()); 
            }          
        }
    }
    /*
     * Getters y Setters de los atibutos
     */
    public Deporte[] getDeportes() {
        return deportes;
    }
    public void setDeportes(Deporte[] deportes) {
        this.deportes = deportes;
    }
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
