package org.ford.Assignment5;

public class MathOperations {

    public void add(int data1, int data2){
        System.out.println("Adding " + data1 + " and " + data2+":"+" "+(data1+data2));
    }

    public void add(double data1, double data2){
        System.out.println("Adding " + data1 + " and " + data2+":"+" "+(data1+data2));
    }

    public void add (int[] numbers_list){
        int sum = 0;
        for (int number:numbers_list){
            sum += number;
        }
        System.out.println("Sum of the array: " + sum);
    }
}
