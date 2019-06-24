package com.java.training.day1.java_apis;

public class StringAPI {

    public static void main(String[] args) {
        /*
        length(), charAt(), indexOf(), substring(), toLowerCase(), toUpperCase(), equals(),
        equalsIgnoreCase(), startsWith(), endsWith(), contains(), replace(), trim()
         */
        char c = '1';
        String ana = "Ana";
        String s2 = "Blandiana";
        System.out.println(ana + s2);        //AnaBlandiana
        System.out.println(ana.concat(s2)); //AnaBlandiana
        System.out.println(ana.length());   //3

        System.out.println(ana.charAt(0));  //A
        System.out.println(ana.charAt(1));  //n
        System.out.println(ana.charAt(2));  //a
        //System.out.println(ana.charAt(4));  //StringIndexOutOfBoundsException

        System.out.println(s2.indexOf('d')); //4
        System.out.println(s2.indexOf('w')); //-1
        System.out.println(s2.indexOf("dia")); //

        System.out.println(s2.substring(6));  //ana
        System.out.println(s2.substring(6, 9));  //ana
        //System.out.println(s2.substring(6, s2.length() +1));  //StringIndexOutOfBoundsException

        String upperAna = ana.toUpperCase();

        System.out.println(upperAna);   //ANA
        System.out.println(ana.toLowerCase());  //ana

        String s3 = new String("Ana");
        //ana = s3;
        System.out.println(ana == s3); //false
        System.out.println(ana.equals(s3)); //true
        System.out.println(ana.toLowerCase().equalsIgnoreCase(s3)); //true

        System.out.println("s3.endsWith(\"na\")-->" + s3.endsWith("na")); //rtrue
        System.out.println("s3.startsWith(\"An\")-->" + s3.startsWith("An")); //true


        System.out.println("s2.contains(\"andian\")-->" + s2.contains("andian")); //
        System.out.println("s2.replace('a','x')-->" + s2.replace('a', 'x'));

        System.out.println("ana-->" + ana + "\ns2-->" + s2 + "\ns3-->" + s3);

        String trimmed = "                       jsnkajsn        ";
        System.out.println(trimmed);
        System.out.println(trimmed.trim());

        String anaAlta = "ana";
        String anaInternata = ana.toLowerCase().intern();
        String ana2 = "a"+"na";
        System.out.println(anaInternata == anaAlta);
        System.out.println(ana2 == anaAlta);

    }
}
