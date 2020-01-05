package com.zeroten.javales;

public class AgeCheck {
    public static String getAgeName(int age){
        if (age <7){
            return "儿童";
        }
        if (age <18){
            return "少年";
        }
        if (age <41){
            return "青年";
        }
        if (age <46){
            return "中年";
        }
        return "老年";
    }
}
