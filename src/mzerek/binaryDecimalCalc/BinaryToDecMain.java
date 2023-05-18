package mzerek.binaryDecimalCalc;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;

public class BinaryToDecMain {

    public static void main(String[] str) {
        System.out.println("Program konwertujacy liczbe w systemie binarnym, na liczbe w systemie dziesietnym");
        System.out.println("Podaj liczbę zapisaną w systemie dziesetnym: ");
        Scanner scanner = new Scanner(System.in);

        StringBuilder strBuild = new StringBuilder().append(scanner.next());
        String binValue = strBuild.reverse().toString();

        System.out.println("Wartość binarna: " + binValue);
        int[] binIntTable = Arrays.stream(binValue.split(""))
                                  .mapToInt(Integer::valueOf)
                                  .toArray();

        double decValue = 0;
        for (int i = 0; i < binIntTable.length; i++) {
            decValue = decValue + (binIntTable[i] * pow(2, i));
        }

        System.out.println("Wartość dziesietna: " + decValue);

    }
}
