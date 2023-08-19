package com.voucher.Voucher.service;

import com.voucher.Voucher.model.Voucher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
@Component
public class Service {
    public Voucher newVoucher(){
        return Voucher.builder()
                .id(UUID.randomUUID()
                        .toString())
                .validFor(20).type("Gift Voucher")
                .build();
    }
}


