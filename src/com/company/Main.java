package com.company;



import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

import custom.vudang.Person;

public class Main {
   static final float pi =  3.141592654f;
    enum test{
        YEU,
        GIOI,
        KHA
    }
    public static void main(String[] args)  {
	// write your code here
        /*int a = 100;
        boolean flag = true;
        //showValue();
        int sums = sum(-30,20);
        test gioi = test.GIOI;
        double div = Math.floor(Math.random()*333);
        double res = Math.toRadians(Math.sin(123));

        String myName = "V@ud@ang@";
        String myClone = "V@ud@ang@"; */


       /* System.out.println("Sin alpha : " + res);
        System.out.println(div);
        System.out.println(gioi);
        System.out.println(sums);
        System.out.println(a);
        System.out.println(flag); */

        /*String myString = myName.substring(0,3);
        String[] listString = myName.split("");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("vudanghahaha");
        System.out.println(myString);
        for (String e:listString
             ) {
            System.out.println(e.charAt(e.indexOf(e)) + "NEW");
        }
        System.out.println(myName.length());
        System.out.println(myClone.equals(myName));
        int len = stringBuilder.length();
        System.out.println(stringBuilder.insert(stringBuilder.length()-1,"vu")); */

        /*
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        String b = scanner.next();
        char c = scanner.next().charAt(0);
        System.out.println(c); */

        /*
        String urlData = "/Users/vudang/Desktop/Mobile Development/PetProject/tracking-location/back-end/src/index.js";
        try {
            Scanner scanner = new Scanner(
                    Paths.get(urlData));
            String input ;
            try {
                PrintWriter writter = new PrintWriter("RES.VUDANG");
                while(scanner.hasNext()){
                    input=scanner.next();
                    writter.println(input);

                }
                writter.close();
            } catch (Exception e){
                System.out.println(e);
            }

        }catch (Exception e){
            System.out.println(e);
        } */


        Person person = new Person("Vudang",21);
        Object res = person.toString();
        System.out.print(res);


    }
    /*
    public static void showValue(){
        System.out.println(pi);
    } */

    public static int sum(int a,int b){
        return a + b > 10 ? a +b : a -b;
    }
}
