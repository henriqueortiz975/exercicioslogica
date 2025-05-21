package exericico06;

import java.util.Scanner;

public class Exericico06 {

    public static void main(String[] args) {
        Scanner Objtest = new Scanner(System.in);
        System.out.println("escreva uma palavra");
        String p1 = Objtest.nextLine();
        boolean re = sla(p1);
        System.out.println("sua palavra é palíndroma? " + re);
    }

    public static boolean sla(String p1) {
        p1 = p1.toUpperCase();
        p1 = p1.replace(" ", "");
        int n1 = 0;
        int n2 = p1.length() - 1;

        while (n1 < n2) {
            if (p1.charAt(n1) != p1.charAt(n2)) {
                return false;
            }
            n1++;
            n2--;
        }
        return true;
    }

}
