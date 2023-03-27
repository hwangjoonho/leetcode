package prac03;

public class test7 {


        int value;

        test7() {
            this.value = 0;
        }

        void add(int val) {
            this.value += val;
        }

        int getValue() {
            return this.value;
        }

    public static class MaxLimitCalculator extends test7 {

        void add(int a) {
            super.value += a;
            if (super.value > 100) {
                super.value = 100;
            }

        }

    }


    public static void main(String[] args) {

        MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);  // 50 더하기
        cal.add(60);  // 60 더하기
        System.out.println(cal.getValue());  // 100 출력



    }





}
