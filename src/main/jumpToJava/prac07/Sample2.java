package jumpToJava.prac07;

import java.lang.reflect.Array;
import java.util.ArrayList;

class HeavyWork implements Runnable{
    String name;

    HeavyWork(String name) {
        this.name = name;
    }

    @Override
    public void run() {

    }

    public void work() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);  // 0.1 초 대기한다.
            } catch (Exception e) {
            }
        }
        System.out.printf("%s done.\n", this.name);
    }

}

public class Sample2 {
    public static void main(String[] args) {
        ArrayList<Thread> t = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 1; i < 5; i++) {
//            HeavyWork w = new HeavyWork("w" + i);
            Thread z = new Thread( new HeavyWork("w" + i));
            z.start();
            t.add(z);
        }
        long end = System.currentTimeMillis();
        System.out.printf("elapsed time:%s ms\n", end - start);
    }
}
