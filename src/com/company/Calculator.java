package com.company;

public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("sum of a,b is : " +

                sum(a, b));
        System.out.println("minus of a,b is ;" +

                sub(a, b));
        System.out.println("division of a,b is ;" +

                divide(a, b));
        System.out.println(

                divideWithDecimal(a, (float) b));
        System.out.println(multiply(53, 178));
        System.out.println(multiplication(123, 132));

        Assignment.getFullName("Yagna", "Kothapalli");
        Assignment.square(3);
        Assignment.sum(2, 3, 4);
        Assignment.areaofRectangle(10, 20);
        Assignment.areaofaCircle(9);
    }


    // method :: >  accessIdentifier static/final/(what kind of method) returnType(signature)(output)
    // name of the method (arguments....)
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int sub(int x, int y) {
        int sub = x - y;
        return sub;
    }

    public static int divide(int a, int b) {
        int divide = a % b;
        return divide;
    }

    public static double divideWithDecimal(float a, float b) {
        double divide = a / b;
        return divide;
    }

    public static int multiply(int x, int y) {
        int multiple = x * y;
        return multiple;
    }

    public static int multiplication(int a, int b) {
        int result = a * b;
        return result;
    }
}
