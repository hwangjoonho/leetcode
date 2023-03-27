package prac03;
//
//import jumpToJava.prac09.test;
//
public class test6 {
//
//
        int value;
//
        test6() {
            this.value = 0;
        }
//
        test6(int a) {
            System.out.println("아니그냥 여기타나");
                this.value = 999999;
        }
//
//        void add(int val) {
//            this.value += val;
//        }
//
//        int getValue() {
//            return this.value;
//        }
//    }
//
////     class Sample {
////        public static void main(String[] args) {
////            jumpToJava.prac09.test6 cal = new jumpToJava.prac09.test6();
////            cal.add(10);
////            System.out.println(cal.getValue());  // 10 출력
////
////            UpgradeCalculator cal2 = new UpgradeCalculator();           // child 객체 생성시 부모 기본생성자 훝고온다.
//////            UpgradeCalculator cal2 = (UpgradeCalculator) new jumpToJava.prac09.test6();
//////            jumpToJava.prac09.test6 cal2 = new UpgradeCalculator();
////            cal2.add(10);
////            System.out.println(cal2.getValue());
////            cal2.minus(3);
////            System.out.println(cal2.getValue());
////        }
//
//
//static class UpgradeCalculator extends jumpToJava.prac09.test6 {
////    void add(int k) {
////
////    }
//    int minus(int j) {
//        super.value -= j; // getValue() 로 값자체를 호출하므로 값자체를 바꿔줘야한다. return값은 그저 표현값. 이후 메소드에서 활용시 사용하는값 원본 value자체에 변화없음
//        return super.value;
//    }
//
//
}
//
//}