package com.dengyin2000.andpatch;

import com.dengyin2000.andpatch.antilazyload.AntilazyLoad;

import java.math.BigDecimal;

/**
 * Created by denny on 2015/11/10.
 */
public class MatchService {

    public MatchService() {
        System.out.println(AntilazyLoad.class);
    }

    public Result divide(BigDecimal num1, BigDecimal num2) {
/*        try {*/
        BigDecimal rt = new BigDecimal(num1.doubleValue() / num2.doubleValue());
        return new Result(1, "success", rt);
/*        } catch (Exception e) {
            return new Result(0, "被除数不能为0", null);
        }*/
    }
}
