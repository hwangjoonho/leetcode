package main.jumpToJava.prac06;

import java.awt.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class q4 {

    public static void main(String[] args) throws IOException {


//        BufferedWriter fw = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\sample.txt",true));
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        fw.write(str);
//        fw.close();
//
//
//        BufferedReader fr = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\sample.txt"));
//        String str2;
//        while ((str2 = fr.readLine())!=null) {
//            System.out.println(str2);
//        }
//        fr.close();

//        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("C:\\Users\\user\\Desktop\\sample2.txt", true));
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        bo.write(str.getBytes());
//        bo.close();
//
//        BufferedInputStream bi = new BufferedInputStream(new FileInputStream("C:\\Users\\user\\Desktop\\sample2.txt"));
//        int i;
//        byte[] b = new byte[];
//        if ((i = bi.read()) != -1) {
//            System.out.println("탄건가");
//            System.out.println((char)i);
//        }
//        bi.close();

        BufferedInputStream bi = new BufferedInputStream(new FileInputStream("C:\\Users\\user\\Desktop\\sample.txt"));
        int i;
        String str ="";
//        byte b[] = bi.

//        byte[] b = new byte[9999];
//        int nRLen = bi.read(b);
//        String strBuff = new String(b, 0, nRLen);
//        System.out.println(strBuff);

//        while (true) {
            while((i = bi.read()) != -1) {
//            System.out.println("탄건가");
                str += (char) i;
            }
        System.out.println(str);
        String str2 = str.replaceAll("python", "java");
        System.out.println(str2);
//        String[] a = str.split(" ");
//        System.out.println(Arrays.toString(a));
//        String q;
//        for (String ele : a){
//            ele.replaceAll("python", "java");
//        }
//        System.out.println(Arrays.toString(a));
//        Arrays.stream(a).forEach(zzz-> System.out.println(zzz));

//        }
        bi.close();






    }
}
