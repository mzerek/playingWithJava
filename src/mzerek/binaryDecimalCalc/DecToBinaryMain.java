package mzerek.binaryDecimalCalc;

import java.util.Scanner;

public class DecToBinaryMain {

    public static void main(String[] str) {
        System.out.println("Program konwertujacy liczbe w systemie dziesietnym, na liczbe w systemie binarnym");
        System.out.println("Podaj liczbę zapisaną w systemie dziesetnym: ");
        Scanner scanner = new Scanner(System.in);

        int decCopyValue = scanner.nextInt();

        System.out.println("Wartość dziesiętna: " + decCopyValue);

        StringBuilder stringBuilder = new StringBuilder();

        while (decCopyValue > 0) {
            //System.out.println("decCopyValue: " + decCopyValue);
            if (decCopyValue % 2 == 0) {
                //System.out.println("Value: " + 0);
                stringBuilder.append("0");
            } else {
                //System.out.println("Value: " + 1);
                stringBuilder.append("1");
            }
            decCopyValue = decCopyValue / 2;
        }

        System.out.println("Wartość binary: " + stringBuilder.reverse());

    }
}
