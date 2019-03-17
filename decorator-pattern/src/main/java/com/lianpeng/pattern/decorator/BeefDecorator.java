package com.lianpeng.pattern.decorator;

/**
 * @author lianpeng
 * @date 2019/3/17 22:20
 * @since
 **/
public class BeefDecorator extends Noodles {

    Noodles noodles;

    public BeefDecorator( Noodles noodles ) {
        this.noodles = noodles;
    }

    String getMsg() {
        return this.noodles.getMsg() + "+一份牛肉";
    }

    int getPrice() {
        return this.noodles.getPrice() + 5;
    }
}
