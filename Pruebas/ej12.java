package Pruebas;

import java.util.*;
public class ej12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int[] v = new int[n];
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            v[i]= i;
        }
        for (int i = n -1; i >= 0; i--) {
            System.out.print(v[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
