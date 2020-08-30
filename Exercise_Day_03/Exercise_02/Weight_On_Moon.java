package Exercise_Day_03.Exercise_02;

import java.util.Scanner;

public class Weight_On_Moon {
    public static void main(final String[] args) {
        final Scanner inp = new Scanner(System.in);

        System.out.println("Ensira seu peso(kg):");
        final double earth_weight = inp.nextDouble();
        System.out.println("Peso na lua(kg): " + calculate(earth_weight));

        inp.close();
    }

    static double calculate(final double num) {
        return  num / 9.81 * 1.62;
    }
}