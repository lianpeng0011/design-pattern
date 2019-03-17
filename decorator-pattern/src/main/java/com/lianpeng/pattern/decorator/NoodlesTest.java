package com.lianpeng.pattern.decorator;

/**
 * @author lianpeng
 * @date 2019/3/17 22:32
 * @since
 **/
public class NoodlesTest {


    public static void main( String[] args ) {

        Noodles noodles = new BaseNoodles();

        noodles = new BeefDecorator( noodles );

        noodles = new BeefDecorator( noodles );

        noodles = new EggsDecorator( noodles );

        System.out.println("订单:" + noodles.getMsg());

        System.out.println("价格："+ noodles.getPrice());
    }
}
