package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String mmp1 = male(16, 24) +
                male(69, 25) +
                male(26, 30) +
                male(12, -3) +
                male(6, 17);
        System.out.println(mmp1);
    }

    public static String male(int age, int temperature) {
        //
        String str1 = "Можно идти гулять!-\n";
        String str2 = "Остовайтесь дома-\n";

        if ((age >= 20 && age <= 45) && temperature >= -20 && temperature <= 30) {
            return str1;
        } else if (age < 20 && temperature > 0 && temperature <= 28) {
            return str1;
        } else if (age >= 45 && temperature >= -10 && temperature <= 25) {
            return str1;
        } else {
            return str2;
        }


    }


}

