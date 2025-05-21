package exericico06;

import java.util.Scanner;

public class Exericico06 {

    public static void main(String[] args) {
        Scanner Objtest = new Scanner(System.in);
        System.out.println("escreva uma palavra");
        String p1 = Objtest.nextLine();
        sla(p1);
    }

    public static void sla(String p1) {
        p1 = p1.toUpperCase();
        p1 = p1.replace(" ", "");
        System.out.println(p1);

    }

}
