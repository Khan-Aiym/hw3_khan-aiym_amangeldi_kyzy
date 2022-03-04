package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double[] sun = {12, -3, 8, 2, -54, 4, -7, 5, -3, 7, 1, -34, 9, -2, -9};
        boolean chair = false;
        double room = 0;
        double sky = 0;
        for (Double table : sun
        ) {
            if (table < 0) {
                chair = true;


            } else {
                if (chair) {
                    room += table;
                    sky++;
                }
            }
        }
        System.out.println(room / sky);
        System.out.println(Arrays.toString(street(sun)));
    }

    public static double[] street(double[] cicly) {
        for (int i = 0; i < cicly.length; i++) {
            double min = cicly[i];
            int flower = i;
            for (int j = i + 1; j < cicly.length; j++) {
                if (cicly[j] < min) {
                    min = cicly[j];
                    flower = j;


                }


            }
            if (i != flower) {
                double tree = cicly[i];
                cicly[i] = cicly[flower];
                cicly[flower] = tree;
            }
        }
        return cicly;
    }
}