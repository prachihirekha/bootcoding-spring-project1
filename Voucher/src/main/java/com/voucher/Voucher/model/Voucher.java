package com.voucher.Voucher.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Voucher {
    private String id;
    private String type;
    private int validFor;
}
