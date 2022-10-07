package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String[] weekdays = new String[7];
        System.out.println(Arrays.toString(weekdays));

        weekdays[0] = "monday";

        System.out.println(Arrays.toString(weekdays));

        String[] weekdays2 = new String[]{"Mon","Tue","Wed"};

        for(String day : weekdays2){
            System.out.println("day: "+ day);
        }
        for(int i=0; i < weekdays2.length; i++){
            weekdays2[i] = weekdays2[i].toUpperCase();
        }
        System.out.println(Arrays.toString(weekdays2));
    }
}
