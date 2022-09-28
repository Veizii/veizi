package classeMoto;

import java.util.Scanner;

public class ProvaMoto {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        String colore = "", marca = "", modello = "";
        Integer cilindrata, cavalli;
        Boolean isAcceso = false;
        Moto m = new Moto("", "", "", 0, 0, 6, 300, 0);

        System.out.println("Inserisci la marca della moto: ");
        marca = input.nextLine();
        m.setMarca(marca);

        System.out.println("Inserisci il modello della moto: ");
        modello = input.nextLine();
        m.setModello(modello);

        System.out.println("Inserisci il colore della moto: ");
        colore = input.nextLine();
        m.setColore(colore);

        System.out.println("Inserisci la cilindrata della moto: ");
        cilindrata = input.nextInt();
        m.setCilindrata(cilindrata);

        System.out.println("Inserisci i cavalli della moto: ");
        cavalli = input.nextInt();
        m.setCavalli(cavalli);

        m.accendiMotore(isAcceso);

        m.cambiaMarcia(1);

        m.accelera(50f);

        System.out.println(m.info());
        
    }
}
