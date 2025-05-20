package exercicio03;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        int n1, n2 = 0;
        Scanner Objtest = new Scanner(System.in);
        System.out.println("informe quantos elementos o vetor terá:");
        n1 = Objtest.nextInt();
        int[] ve = new int[n1];
        System.out.println(Arrays.toString(ve));
        n1--;
        while (n1 >= 0) {
            System.out.println("digite o valor de um dos elemento");
            n2 = Objtest.nextInt();
            ve[n1] = n2;
            n1--;
        }
        System.out.println(Arrays.toString(ve));
        int re = vetor(ve, n1, n2);
        System.out.println(re);
    }

    public static int vetor(int[] ve, int n1, int n2) {
        int n3 = n2;
        for (int i = 0; i < ve.length; i++) {
            int n4 = Math.abs(ve[i]);
            if (n4 > n3) {
                n3 = n4;
            }
        }
        return n3;
    }
}
