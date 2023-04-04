package leet;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class q0330_2 {

    public static void main(String[] args) {



//        int[] nums = {1, 7, 3, 6, 5, 6};
//        int[] nums = {1, 2, 3};
        int[] nums = {2, 1, -1};
//          int[] nums = {-1,-1,-1,-1,-1,0};

        int sum1 = 0 ;
        int sum2 = 0 ;
        loop1 :
        for (int i = 1; i <= nums.length; i++) {         // 배열에서 i번째 pivot index
                sum1=0;
//                sum2=0;
            for (int j = 0; j <= i - 1; j++) {          // 배열에서 파이봇 인덱스 좌측 합을 기준
                    sum1 +=nums[j];
                System.out.println("sum1 : " + sum1);
                    sum2 = 0;
                for (int k = 0; k <= nums.length - 1; k++) { // 배역에서 파이봇 인덱스 우측 합

                     sum2 +=nums[nums.length-1-k];

                    if (((sum1 == sum2 || i+j==nums.length) &&(i<j-))) {
                        System.out.println("sum1 : " + sum1 + "은 이거고 sum2는 왼쪽이거다 : " + sum2 + "파이봇인덱스는 : "+i+"이고 j는 뭐지"+j);
                        break loop1;
                    } else if (( sum1 == 0 || sum2 == 0 )&& i + j == nums.length) {
                        System.out.println("The pivot index is 0.");
                        break loop1;
                    } else if (i+j==nums.length){
                        System.out.println("There is no index that satisfies the conditions in the problem statement.");
                        break loop1;
                    }

                }
//                    System.out.println("sum2 : "+sum2);
            }
//                System.out.println("i가"+i+"일때" +sum1+"fkjsdaflasd"+sum2);
        }







//        for (int a : nums) {
//            System.out.println(a);
//        }
//        for (int i = 0; i < nums.length - 1; i++) {
//            System.out.println(nums[i]);
//        }
        // int 와같은 기본자료형 원소로 이루어진 배열은 list로 변경 불가능 boxing후 변경가능함
//        List<Integer> intList = Arrays.stream(nums).boxed().collect(Collectors.toList());       // array를 list로 변경
//        Collections.reverse(intList);           // Arraylist  reverse 하는방법
//        intList.sort(Comparator.reverseOrder());
//        System.out.println("intListReverse"+intList);
//        Object[] numsRev = intList.toArray();       // List를 array로 변경
//        System.out.println(Arrays.toString(objects));

//        int sum1 = 0;
//        int sum2 = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            sum1 += nums[i];
//            sum2 += nums[nums.length-i-1];
//            if (sum1 != sum2 ) {
//
//            }
//        }
//        int i = 0;
//        int k = nums.length-1-i;
//        int sum1 = 0;
//        int sum2 =  nums[k];
//        boolean bool = true;
//        while (bool) {
//            sum1 += nums[i];
//            i++;
//            System.out.println("sum1 : "+sum1);
//            if ((i == nums.length - 1) || k == 0) {
//                System.out.println("There is no index that satisfies the conditions in the problem statement. -1");
//                break;
//            } else if (sum1 != sum2 && sum1>sum2) {
//                k--;
//            sum2 += nums[k];
//                System.out.println("sum2 : "+sum2);
//            } else if (sum1 == sum2 && k-i==1) {
//                System.out.println("The pivot index is "+ (i));
//                break;
//            }
//
//            if ((sum1 == 0 || sum2 == 0)) {
//                System.out.println("The pivot index is 0");
//                break;
//            }
//
//        }

        

//        String[] strs = new String[3];
//        strs[0] = "hi";
//        strs[1] = "hi2";
//        strs[2] = "hi3";
//
//        // 배열을 리스트로 Arrays.asList(nums)
//        for (String p : Arrays.asList(strs)) {
//            System.out.println(p);
//        }


//        ArrayList list = new ArrayList<>(Arrays.asList(nums));    // int배열은 Arrays.asList()를 사용할 수 없으므로, 반목문사용해 List변환
//        for(int p:list){
//            System.out.println(p);
//        }


//        System.out.println("aaa" + Arrays.toString(objects));
//        list.stream().forEach(s -> System.out.println(s));
    }
}
