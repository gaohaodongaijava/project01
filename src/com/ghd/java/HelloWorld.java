package com.ghd.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by asus on 2018/10/8.
 */
public class HelloWorld {

    public HelloWorld() {
    }

    public static void main(String [] args){
        System.out.print("Hello World!");
        int i,j;
        int sjfksjfksjf  = 11;
        ArrayList list1 = new ArrayList();

        Date date = new Date();
        list1.add(123);
        method1();
    }

    public static  void method1(){
          int i;
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
