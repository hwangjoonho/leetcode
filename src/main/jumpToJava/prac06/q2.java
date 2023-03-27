package main.jumpToJava.prac06;

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine().toUpperCase();
        while (!(a.equals("END"))) {
            System.out.println(a);
        sc = new Scanner(System.in);
            a = sc.nextLine().toUpperCase();
}
    }
}
