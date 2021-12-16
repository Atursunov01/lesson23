package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        for (Integer i = 50; i <= 100; i++) {
            if (i % 2 /* !*/ != 0)
                System.out.println("jup sandar :" + i);
        }

    }
}
