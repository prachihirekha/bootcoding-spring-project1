package com.coupon.application.util;

import java.util.Random;

public class GenerateIsActive {
    public static boolean isActive(){
        boolean [] a ={true,false};
        Random random =new Random();
        int i = random.nextInt(a.length);
        return a[i];
    }

}
