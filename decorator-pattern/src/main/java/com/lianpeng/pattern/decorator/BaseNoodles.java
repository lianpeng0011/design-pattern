package com.lianpeng.pattern.decorator;

/**
 * @author lianpeng
 * @date 2019/3/17 22:17
 * @since
 **/
public class BaseNoodles extends Noodles {

    String getMsg() {
        return "一碗面条";
    }

    int getPrice() {
        return 6;
    }
}
