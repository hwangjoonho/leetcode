package jumpToJava.prac09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test5 {

    public static <Int> void main(String[] args) {
        String DI = "4546793";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(DI.split("")));
        Stream origin = Arrays.stream(DI.split("")).map(k->String.valueOf(Integer.valueOf(k)%2)); // 계산을 위해 int로 바꿔준후 다시 String 형변환 처리
        // Int -> String으로 변환시 String.valueOf() 또는 Integer.toString();
        // String -> int로 변환시 Integer.valueOf() 또는 Integer.parseInt();

//        int[] array = origin.toArray(new int[]); // 왜안되는지 모르겟다 Integer로도 안됨 그럼 origin의 원소의 자료형값은 뭘까?
//        System.out.println("?"+array);
//        List list2 = Arrays.asList(array);
//        for (Object s : list2) {
//            System.out.println(s);
//        }
//        Supplier<IntStream> origin = (Supplier<IntStream>) origin2;
//        origin.get(z-> System.out.println(z));

//        IntStream a = origin.mapToInt(k->Integer.valueOf((String) k)%2);
//        a.forEach(x-> System.out.println(x));
//        a.forEach(j-> System.out.println(j));

//      List<String> p = origin.boxed.collect(Collectors.toList());
        ArrayList<String> p = (ArrayList<String>) origin.collect(Collectors.toList()); // list로 바꾸려면 원소들 boxed 박싱처리 감싸주기
//        p.forEach(w-> System.out.println(w));
        System.out.println("p"+p);
        for(int i =1; i<p.size();i++){
            System.out.println(p.get(i));
            if ((p.get(i - 1).equals(p.get(i)) && p.get(i).equals("1"))) {
                list.add(i, "-");
                p.add(i, "-");
            }
        }
        for(int i =1; i<p.size();i++) {
            if ((p.get(i - 1).equals(p.get(i)) && p.get(i).equals("0"))) {
                list.add(i, "*");
                p.add(i, "*");

            }
        }
        System.out.println(p);
        System.out.println(list);
//        List<Integer> list = a.boxed().toArray(value -> );
//        for(Int k : p){
//            System.out.println(k);
//        }


//        if(a.reduce())
    }

}
