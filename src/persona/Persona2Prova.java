package persona;

/**
 *
 * @author loris.veizi
 */
public class Persona2Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona2 p1 = new Persona2();
        Persona2 p2 = new Persona2(1.80, "Veizi", "28/09/2022", "Loris", 70f);
        
        String info = p2.info();
        
        System.out.println(info);
    }

}
