package persona;

/**
 *
 * @author loris.veizi
 */
public class PersonaProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona();
        Persona p2 = new Persona(1.80, "Veizi", "28/09/2022", "Loris", 70f);
        
        String info = p2.info();
        
        System.out.println(info);
    }

}
