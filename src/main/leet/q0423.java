package leet;

import java.util.Arrays;
import java.util.Scanner;

public class q0423 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] nums = Arrays.stream(str.split(",")).mapToInt(s -> Integer.valueOf(s)).toArray();
        for (int i = 0; i < nums.length-1; i++) {
            nums[i+1] += nums[i];
        }
        Arrays.stream(nums).forEach(System.out::println);


    }
}
