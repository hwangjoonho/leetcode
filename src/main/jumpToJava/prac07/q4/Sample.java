package jumpToJava.prac07.q4;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        Arrays.stream(numbers).filter(s-> s%2 == 1).forEach(z-> System.out.println(z*2));
        int[] ints = Arrays.stream(numbers).filter(s -> s % 2 == 1).map(s->s * 2).toArray();
        System.out.println(Arrays.toString(ints));

//        ArrayList<Integer> temp = new ArrayList<>();
//        for (int num : numbers) {
//            if (num % 2 == 1) {  // 홀수이면
//                temp.add(num * 2);  // 2를 곱하여 temp에 담는다.
//            }
//        }
//
//        // 정수 리스트를 정수배열로 변환한다.
//        int[] result = new int[temp.size()];
//        for (int i = 0; i < temp.size(); i++) {
//            result[i] = temp.get(i);
//        }
    }
}

