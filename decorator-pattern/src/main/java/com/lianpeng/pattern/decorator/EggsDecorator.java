package com.lianpeng.pattern.decorator;

/**
 * @author lianpeng
 * @date 2019/3/17 22:30
 * @since
 **/
public class EggsDecorator extends Noodles {
    Noodles noodles;

    public EggsDecorator( Noodles noodles ) {
        this.noodles = noodles;
    }

    String getMsg() {
        return this.noodles.getMsg()+ "+鸡蛋";
    }

    int getPrice() {
        return this.noodles.getPrice() + 2;
    }
}
