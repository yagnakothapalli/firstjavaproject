package com.company;

public class Demostring {
    public static void main(String[] args) {

//        String name = "yagna";
//        char[] chars = name.toCharArray();
//        name.concat("kothapalli");
        //char[] reverseArr = new char[name.length()];
        String name="yagvy kothapalli";
//        System.out.println(name);
//        System.out.println(name.concat("kothapalli"));
//        System.out.println(name);
        System.out.println(name.substring(3,7));
        char c=name.charAt(3);
        System.out.println(c);
        System.out.println(name.indexOf("vy"));
        System.out.println(name.indexOf("vy",6));
        name.indexOf("vy",6);
        System.out.println(name.indexOf('y',6));
        System.out.println(name.replace('y','$'));
        System.out.println(name.replaceFirst("y","%"));

        int ii=12;
        Integer.valueOf(12);
//        int length = chars.length;
//
//        int lastIndex = length - 1;
//        for (int i = 0; i <= lastIndex; i++){
//                reverseArr[lastIndex-i] = chars[i];
//            }
//        String reverse = new String(reverseArr);
//        System.out.println(reverseArr);
    }
}
