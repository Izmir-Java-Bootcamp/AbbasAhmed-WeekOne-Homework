package com.company.WeeklyHomeWork;

import java.util.Scanner;

public class StringPattern {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String pattern = "s*h*l";

        while(true){
            System.out.print("Enter word : ");
            String str = in.nextLine();

            if(str.contains("exit")){
                System.out.println("Bye");
                break;
            }else{
                occursIn(pattern,str);
            }
        }
    }

    public static void occursIn(String pattern,String str){

        String result ="";
        int count=0;

        for (int i = 0; i < pattern.length(); i++) {
            if(pattern.charAt(i) != '*'){
                result+=pattern.charAt(i);
            }
        }

        for (int i = 0; i < result.length(); i++) {

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)==result.charAt(i)){
                    count+=1;
                }
            }
        }

        /**
        System.out.println(result);
        System.out.println(count);
         **/

        if (count >= result.length()) {
            System.out.println("s*h*l occurs in "+str);
        }else{
            System.out.println("s*h*l does NOT occur in "+str);
        }


    }

}
