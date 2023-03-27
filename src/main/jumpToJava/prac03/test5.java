package prac03;

import java.util.Arrays;

public class test5 {

    public static void main(String[] args) {

//        String a = "write once, run anywhere";
//        if (a.contains("wife")) {
//            System.out.println("wife");
//        } else if (a.contains("once") && a.contains("run")) {
//            System.out.println("once");
//        } else if (!a.contains("everywhere")) {
//            System.out.println("everywhere");
//        } else if (a.contains("anywhere")) {
//            System.out.println("anywhere");
//        } else {
//            System.out.println("none");
//        }


//        int i = 0;
//            String a = "";
//        while (!(i == 5)) {
//            a = a + "*";
//            i++;
//        System.out.println(a);
//        }

        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        double v = Arrays.stream(marks).average().getAsDouble();
        System.out.println(v);


    }
}
