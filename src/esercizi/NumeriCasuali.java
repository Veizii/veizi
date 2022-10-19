package esercizi;

import java.util.Random;

public class NumeriCasuali {

    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 30; i++) {
            int r = (int) (Math.random() * 10) + 1;
            System.out.println(r);
        }

        Random rand = new Random();

        for (int i = 0; i < 30; i++) {
            int num = rand.nextInt(10) + 1;
            System.out.println(num);
        }
    }

}
