package com.coupon.application.util;

import java.util.Random;

public class GenerateValidityFor {
    public static String generateValidity(){
        Random random =new Random();
        String[] unit ={"1day","2day","9day","1weeks","1months"};
        int index=random.nextInt(unit.length) ;
        return unit[index];
    }

//    public static void main(String[] args) {
//        System.out.println(generateValidity());

}

