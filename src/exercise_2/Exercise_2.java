package exercise_2;
import exercise.Personal;
public class Exercise_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i;
        Personal[] arrayPerson = new Personal[3];
        
        arrayPerson[0] = new Personal("Iikan", "Bonilla", "1077172383");
        arrayPerson[1] = new Personal("Miguel", "Cardona", "1074656240");
        arrayPerson[2] = new Personal("Pacho", "Bonilla", "1003914448");
        
    for(i=0; i < arrayPerson.length; i++){ 
        System.out.println(arrayPerson[i].getFirstName());
    }
    for(Personal personal : arrayPerson){
        System.out.println(personal.getFirstName());
    }    
    }  
 }
