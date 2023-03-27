package prac03;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test4 {


    public static void main(String[] args) {


//        ArrayList<String> strings = new ArrayList<>(Arrays.asList("LIife", "is", "to", "short", "2"));
//        String ac="";
////        for (String s : strings) {
//            ac = String.join(" ", strings);
////        }
//            System.out.println(ac);
//
//        }

//        HashMap<String, Integer> grade = new HashMap<>();
//        grade.put("A", 90);
//        grade.put("B", 80);
//        grade.put("C", 70);
//        int a = grade.remove("B");
//        System.out.println(a);

//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
//        ArrayList ab = new ArrayList(numbers.stream().distinct().collect(Collectors.toList()));
//        System.out.println(ab);
//        Set a = new HashSet(numbers);
//        System.out.println(a);

        HashMap<Integer, Integer> priceMap = new HashMap<>();
        priceMap.put(1, 3000);  // 1: 아메리카노
        priceMap.put(2, 4000);  // 2: 아이스 아메리카노
        priceMap.put(3, 5000);  // 3: 카페라떼

        Stream.of(priceMap).collect(Collectors.toSet());

        int k = Integer.parseInt(null);




    }
    }
