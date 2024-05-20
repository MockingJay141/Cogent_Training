package com.logicalQuestions;

public class Example1 {

    public static void main(String[] args) {

        String str = "***a*b*c**";
        int k = 3;
        int count = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            if (charArray[i] == '*'){
                count++;
                if (count == k){
                    System.out.println("k consecutive * found");
                    break;
                }
            }
            else if(charArray[i] != '*'){
                count = 0;
            }
        }
    }
}
