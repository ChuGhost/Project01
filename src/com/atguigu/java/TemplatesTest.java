package com.atguigu.java;

import com.atguigu.been.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author xiaowangzi
 * @date 2022/9/22 - 20:33
 *
 * 1.IDEA中代码模板所处的位置：setting - Editor - Live Templates / Postfix Completion
 * 2.常用的模板
 *
 */
public class TemplatesTest {
    //模板6：prsf：可生成 private static final
    private static final Customer CUST = new Customer();

    //变形：psf
    public static final int NUM = 1;
    //变形：psfi
    public static final int NUM2 = 2;
    //变形：psfs
    public static final String NATION = "China";

    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println("Hello!");
        //拓展：soutp / soutm / soutv / xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));

        System.out.println("TemplatesTest.main");

        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);//就近选一个：soutv

        System.out.println(num1);//num1.sout

        //模板3：fori
        String[] arr = new String[]{"Tom","Jerry","LiMing","June"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板4：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {
            System.out.println(o);
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }

    public void method(){
        System.out.println("TemplatesTest.method");
        //模板5：ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }
        //变形：xxx.nn/xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }

}
