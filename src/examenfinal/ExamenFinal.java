package examenfinal;

import java.util.Scanner;

public class ExamenFinal {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        while (true) {
            int op = 0;

            System.out.println("---Menú---");
            System.out.println("1. Problema 1");
            System.out.println("2. Problema 2");
            System.out.println("3. Problema 3");

            System.out.println("Ingrese opcion");
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();

            switch (op) {
                case 1:
                    problema1();
                    break;
                case 2:
                    int x;
                    System.out.println("NUMEROS IMPARES PARA HACER UNA PIRAMIDE");
                    Scanner s = new Scanner(System.in);
                    x = s.nextInt();

                    problema2(x);
                    break;
                case 3:
                    problema3();
                    break;
            }

        }

    }

    public static void problema1() {
        System.out.println("Ingrese número 1");
        Scanner n1 = new Scanner(System.in);
        int numero1 = n1.nextInt();

        System.out.println("Ingrese número 2");
        Scanner n2 = new Scanner(System.in);
        int numero2 = n2.nextInt();

        if (numero1 > numero2) {
            System.out.println("El número mayor es " + numero1);
        } else {
            System.out.println("El número mayor es " + numero2);
        }

    }

    public static void problema2(int z) {
        int a = 1;
        int e = z - 1;
        for (int f = 0; f < z; f++) {
            for (int ec = 0; ec < e; ec++) {
                System.out.print(" ");
            }
            for (int ac = 0; ac < a; ac++) {
                System.out.print(" *");
            }
            System.out.println();
            a ++;
            e--;
        }
    }

    public static void problema3() {

    }

}
