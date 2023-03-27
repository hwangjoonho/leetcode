package jumpToJava.prac09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class test3 {

    public static void main(String[] args) {


        try {
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/user/Desktop/TEST3.txt"));
        List a = new ArrayList();
        String s;
        int k =0;
//            System.out.println(br.lines());
//                while(true){
//            if((s = br.readLine()) != null){
//                a.add(s);
//                } else {
//                break;
//                        }
//            }
            a.add("1");
            a.add("2");
            a.add("3");
            a.add("4");
                System.out.println(a);
                for(int i = 0; i<a.size();i++){
                    k += Integer.valueOf(""+a.get(i));
                }
            System.out.println(k);

//                =========
           OptionalDouble sum = a.stream().mapToInt(x-> Integer.parseInt(""+x)).average();
//           Stream sum = a.stream().reduce((x,y)->x+y);
            System.out.println(sum.getAsDouble());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
