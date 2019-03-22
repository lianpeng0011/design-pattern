package com.lianpeng.pattern.proxy;

import com.lianpeng.pattern.proxy.IHouse;

/**
 * @author lianp
 * @date 2019/3/22 11:28
 * @since
 **/
public class SmallCompany implements IHouse {



    public void rent() {
        System.out.println("我是小中介，我要想想如何坑客户");
    }
}
