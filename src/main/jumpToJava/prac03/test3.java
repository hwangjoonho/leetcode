package prac03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class test3 {

    public static void main(String[] args) {

//        int[] a = {1, 3, 5, 4, 2};
//        System.out.println(a);

        String a = "13542";
        String[] b = a.split("");
//        Stream<String> stream = Arrays.stream(b).sorted(Comparator.reverseOrder());
        List<String> list = Arrays.stream(b).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list);


        Comparator compr = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 9;
            }
        };

        System.out.println(compr.compare("a", "b"));

//        Arrays.sort();
//        Collections.sort();
        Comparable comp = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
        System.out.println(a.compareTo(a));

//                new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.sort((o1, );
    }
}
