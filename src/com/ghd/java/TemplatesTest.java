package com.ghd.java;

import java.util.ArrayList;

/**
 * @author ghd
 * @date 2018/10/8 - 20:50
 */
public class TemplatesTest {

    //模板六：prsf可以生成 private static final
    private static final ArrayList CUSTOMER = new ArrayList();



      //模板一：psvm
      public static void main(String[] args) {

          //模板二：sout
          System.out.println("hello!");
          //sout变形：soutp / soutv / xxx.sout
          System.out.println("args = [" + args + "]");

          System.out.println("TemplatesTest.main");

          int num = 1;
          System.out.println(num);
          System.out.println("num = " + num);

          //模板三：fori
          String [] arr = new String[]{"Tom","jj","lsss"};
          for (int i = 0; i < arr.length; i++) {
              System.out.println(arr[i]);
          }

          //变形：iter
          for (String s : arr) {
              System.out.println(s);
          }



      }
}
