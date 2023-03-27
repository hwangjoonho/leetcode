package prac03;

public class test8 {

        int a =0;
    boolean isOdd(int p) {
        return p % 2 == 1;
//        if (p % 2 == 0) {
//            return false;
//        } else {
//            return true;
//        }
    }


    public static void main(String[] args) {

        test8 cal = new test8();
        System.out.println(cal.isOdd(3));  // 3은 홀수이므로 true 출력
        System.out.println(cal.isOdd(4));

    }




}
