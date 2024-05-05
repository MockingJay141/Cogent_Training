package com.stringHandling;

public class ImmutableDemo {

    public static void main(String[] args) {
        String str = new String("Hello");
        String str1 = str.concat("Welcome");
        String str2 = str1.concat("Fine");

        StringBuffer sb = new StringBuffer("Hello");
        StringBuffer sb1 = sb.append("Welcome");
        StringBuffer sb2 = sb1.append("Fine");

        System.out.println(str + " = " + str1 + " = " + str2);
        System.out.println("=================");
        System.out.println(sb + " = " + sb1 + " = " + sb2);
    }
}
