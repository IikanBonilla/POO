package herenciaypolimorfismo;

import AbstractClass.Animal;
import AbstractClass.caballo;
import AbstractClass.gato;
import AbstractClass.oso;
import AbstractClass.pajaro;
import AbstractClass.perro;

public class HerenciaYPolimorfismo {

    public static void main(String[] args) {
       
        //-->Declaracion del objeto perro
	    Animal perro = new perro("Stich","Carnivoro",15,"Doberman");
        perro.Alimentarse();
        //-->Declaracion del objeto Gato
        Animal gato = new gato("Pelusa","Galletas",15,"Siames");
        gato.Alimentarse();
        //-->Declaracion del objeto Caballo
        Animal caballo = new caballo("Spark","Pasto",25,"Fino");
        caballo.Alimentarse();
        //-->Declaración del objeto oso
         Animal oso = new oso("Spark","Pescado",25,"Fino"){};
        oso.Alimentarse();
        //-->Declaración del objeto pajaro
         Animal pajaro = new pajaro("Spark","Lombrices",25,"Fino"){};
        pajaro.Alimentarse();

    }
    
}
