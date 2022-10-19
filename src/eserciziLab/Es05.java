package eserciziLab;

import java.util.Scanner;

public class Es05 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        double num1, num2,differenza;

        System.out.println("Inserire numero1:");
        num1 = input.nextDouble();

        System.out.println("Inserire numero2:");
        num2 = input.nextDouble();

        if (num1 > num2) {
            differenza = (num1 - num2);
            System.out.println("differenza=" + differenza);
        } else {
            differenza = (num2 - num1);
            System.out.println("differenza=" + differenza);
        }
    }
}
