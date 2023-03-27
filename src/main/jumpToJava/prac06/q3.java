package main.jumpToJava.prac06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class q3 {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("sample.txt");
        fw.write("Write once, run anywhere");
//        fw.flush();
        fw.close();
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line = br.readLine();
        System.out.println(line);  // null 이 출력된다.
        br.close();
    }



}
