package com.zeroten.javales;

import org.testng.annotations.Test;

public class DemoTest {
    @Test
    public  void  Test(){
        int n1 = 10;

        {
            //int n1 = 11;
            int n2 = 20;
            System.out.println(n1);
            System.out.println(n2);

            {
                //int n1 = 111;
                //int n2 = 222;
                int n3 = 30;
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
            }
            System.out.println(n1);
            System.out.println(n2);
            //System.out.println(n3);
        }
        System.out.println(n1);
        //System.out.println(n2);
        //System.out.println(n3);
    }

}