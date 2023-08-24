package com.coupon.application.util;

import java.util.Random;

public class GenerateDescription {
    public static String description(){
        String[] s ={"Grab our exclusive coupon and enjoy irresistible discounts on your favorite products or experiences today!"};
        Random random = new Random();
        int index = random.nextInt(s.length);
        return s[index];
    }
}
