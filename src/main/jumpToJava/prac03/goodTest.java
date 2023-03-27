package prac03;

public class goodTest {

    interface Predator {
    }

    static class Animal {

        int add(int e) {
            return 9;
        }

        int ap(int k) {
            return 999;
        }
    }

    static class Dog extends Animal {

        int minus(int k) {
            return 7;
        }

        int add(int j) {
            return 11;
        }
    }

    static class Lion extends Animal implements Predator {
    }

        public static void main(String[] args) {
            Animal a = new Animal();  // 1번     static -> static : OK
            System.out.println(a.add(8));
            Animal b = new Dog();  // 2번        상속: 자식은 부모 자료형으로 객체 생성이 가능하다.
            System.out.println(b.add(8));
            System.out.println(b.ap(0));
            System.out.println();
            Animal c = new Lion();  // 3번       자식은 부모 자료형으로 객체 생성이 가능
//            Dog d = new Animal();  // 4번        부모는 자식 자료형으로 객체 생성 불가능
            Predator e = new Lion();  // 5번     인터페이스 상속
//            Dog f = new Animal();  // 6번        상속 : 자식은 부모객체 사용 불가능하다.
//            a.minus();
//            b.minus();
        }
}
