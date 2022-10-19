package persona;

import java.time.ZonedDateTime;

/**
 *
 * @author loris.veizi
 */
public class Persona3Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona();
        Persona3 p3 = new Persona3(1.80, "Veizi", "28/09/2022", "Loris", 70f);
        
        String info = p3.info();
        
        System.out.println(info);
        
        Integer eta=p3.calcolaEta();
        
        System.out.println(eta);
    }

}
