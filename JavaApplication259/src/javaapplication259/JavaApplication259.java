package javaapplication259;

public class JavaApplication259 {

    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 6;
        boolean re = Exercicio1(n1, true, n2, n3, n4);
        System.out.println(re);
    }

    public static boolean Exercicio1(int n1, boolean re, int n2, int n3, int n4) {
        return n1 + n2 + n3 == n4;

    }

}
