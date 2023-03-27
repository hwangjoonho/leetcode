package prac03;

import java.util.ArrayList;
import java.util.Arrays;

public class test9 {

    public static void main(String[] args) {

        int[] data = {1, 3, 5, 7, 9};
        Calculator cal = new Calculator();
        int result = cal.avg(data);
        System.out.println(result);

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size());


    }

    static class Calculator {

        int avg(int[] k) {
            int avg = (int) Arrays.stream(k).average().getAsDouble();
            return avg;
        }

    }



}
