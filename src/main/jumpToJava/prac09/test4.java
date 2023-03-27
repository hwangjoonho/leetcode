package jumpToJava.prac09;

import java.util.Arrays;
import java.util.stream.Stream;

public class test4 {

     static class Calculator {

        int[] p;

        public Calculator(int[] data1) {
            this.p = data1;
        }

        public int sum() {
//            int[] a = this.p;
            int total = Arrays.asList(p).stream().flatMapToInt(k -> Arrays.stream(k)).sum();
            return total;
        }

        public double avg() {
//            int[] a = p;
            System.out.println(Arrays.asList(p).stream());
//            double average = IntStream.of(p).average().getAsDouble(); //------------> 잘됨
            double average = Arrays.stream(p).average().getAsDouble();  //------------> 잘됨
//            int average = Arrays.asList(p).stream().mapToInt(value -> value).average();
//            int average = Arrays.asList(p).stream().mapToDouble(k->k).average();

//            int[] j = {1,2,3,4,5};
//            double sum = Stream.of(j).mapToDouble(Integer::intValue).sum();
            Stream.of(p).forEach(a-> System.out.println("된건가"+ Arrays.stream(a).sum()));
//            System.out.println("jjj" + kkk);
//            double kkk = Arrays.stream(j).average().getAsDouble(); //----------------> 잘됨
            return  average;

        }


    }


    public static void main(String[] args) {

        int[] data1 = {1, 2, 3, 4, 5};
        Calculator cal1 = new Calculator(data1);
        System.out.println(cal1.sum()); // 15 출력
        System.out.println(cal1.avg()); // 3.0 출력

        int[] data2 = {6, 7, 8, 9, 10};
        Calculator cal2 = new Calculator(data2);
        System.out.println(cal2.sum()); // 40 출력
        System.out.println(cal2.avg()); // 8.0 출력


    }




}



