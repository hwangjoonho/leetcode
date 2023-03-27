package jumpToJava.prac09;//package .prac09;

import java.util.stream.Stream;

public class test6 {

    public static void main(String[] args) {

        String origin = "aaabbcccccca";
        String[] k = origin.split("");
        String _c = k[0];
        int num = 0;
        String result = "";
        boolean same = false;
        for (int i = 0; i<k.length;i++ ) {


            if (_c.equals(k[i])) {
                num++;
            } else {
                result = result+ _c + num;
                _c = k[i];
                num = 1;
            }
            if (i == k.length - 1) {
                result = result+_c+num;
            }
        }
            System.out.println(result);


    }
}
