import java.util.Arrays;

public class leet {

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 10, 1};
        for (int i = 0; i < nums.length-1; i++) {
            nums[i+1] += nums[i];
        }
        System.out.println(Arrays.toString(nums));

//        int a = Arrays.stream(nums).reduce((x,y)->x+y)
//        System.out.println(a);
//        System.out.println(Arrays.toString(a));

    }
}
