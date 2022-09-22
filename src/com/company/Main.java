package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


//rozwiązanie z listą
        ArrayList<Integer> numberList = new ArrayList<>();
        for(int i = 0; i<=10; i++){
            numberList.add(i);
        }

        System.out.println("Liczby które będą dodawane to: " + numberList);

        int sum = 0;
        for (int x : numberList) {
            sum = sum + x;
        }
        System.out.println("Suma tych liczb: " + sum);

    }
}
