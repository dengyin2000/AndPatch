package com.dengyin2000.andpatch;

import java.math.BigDecimal;

/**
 * Created by denny on 2015/11/10.
 */
public class Result {

    // 0: 异常， 1:正常
    private int code;

    private String message;

    private BigDecimal rt;

    public Result(int code, String message, BigDecimal rt) {
        this.code = code;
        this.message = message;
        this.rt = rt;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public BigDecimal getRt() {
        return rt;
    }
}
