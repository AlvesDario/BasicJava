package Exercise_Day_03.Exercise_01;

import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {
        System.out.println("Ensira o primeiro e o segundo número:");
        Scanner inp = new Scanner(System.in);
        int num1, num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        System.out.println(
                "Escolha: \n1 - Adição \n2 - subtração \n3 - Multiplicação \n4 - divisão\n");
        int choose;
        choose = inp.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Escolheu: "+choose+"\nResultado: "+add(num1, num2));
                break;
            case 2:
                System.out.println(sub(num1, num2));
                break;
            case 3:
                System.out.println(mult(num1, num2));
                break;
            case 4:
                System.out.println(div(num1, num2));
                break;
            default:
                System.out.println("Illigal Operation");

        }
        inp.close();
    }

    static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    static int sub(int x, int y) {
        int result = x - y;
        return result;
    }

    static int mult(int x, int y) {
        int result = x * y;
        return result;
    }

    static int div(int x, int y) {
        int result = x / y;
        return result;
    }

}