package com.codecool;

import java.util.Random;

public class Weather {

    private static boolean rain;

    static void setRaining() {
        Random randomNumber = new Random();
        int pickedNumber = randomNumber.nextInt(10) + 1;

        if (pickedNumber <= 3) {
            rain = true;
        } else {
            rain = false;
        }
    }

    static boolean isRaining() {
        return rain;
    }

}
