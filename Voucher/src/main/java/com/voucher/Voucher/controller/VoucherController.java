package com.voucher.Voucher.controller;

import com.voucher.Voucher.model.Voucher;
import com.voucher.Voucher.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/voucher")
public class VoucherController {
    @Autowired
    private Service s ;
    @GetMapping("/getVoucher")

    public Voucher getVoucher(){
        return s.newVoucher();
    }
}
