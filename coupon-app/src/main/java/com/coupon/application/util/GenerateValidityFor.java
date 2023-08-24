package com.coupon.application.util;

import java.util.Random;

public class GenerateValidityFor {
    public static int generateValidity(){
        Random random =new Random();
        int validity =random.nextInt(90)+1;
        String[] unit ={"days","weeks","months"};
        String r = unit[random.nextInt(unit.length)];
        return Integer.parseInt(validity +""+r);
    }
}

