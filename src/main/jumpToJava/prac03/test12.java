package prac03;

public class test12 {

        public static void main(String[] args) {
            Animal a = new Lion();
            Lion b = new Lion();
            Predator c = new Lion();

            System.out.println(a.hello());  // 1번
//            System.out.println(a.bark());   // 2번
            System.out.println(b.hello());  // 3번
            System.out.println(b.bark());   // 4번 상속된 인터페이스의 메서드는 인터페이스 객체 생성없이 바로 사용 가능
//            System.out.println(c.hello());  // 5번 상속된 클래스의 메서드는 부모 객체 생성 후 사용 가능
            System.out.println(c.bark());   // 6번
        }

}

    interface Predator {
        String bark();
    }

    abstract class Animal {
        public String hello() {
            return "hello";
        }
    }

    class Dog extends Animal {
    }

    class Lion extends Animal implements Predator {
        public String bark() {
            return "Bark bark!!";
        }
    }
