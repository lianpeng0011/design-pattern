package com.lianpeng.pattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lianp
 * @date 2019/3/22 11:03
 * @since
 **/
public class JdkProxy implements InvocationHandler {

    private Object target;

    public Object getInstance( Object target ) {
        this.target = target;

        return Proxy.newProxyInstance( target.getClass().getClassLoader(), target.getClass().getInterfaces(), this );
    }


    public Object invoke( Object proxy, Method method, Object[] args ) throws Throwable {

        befer();

        method.invoke( target, args );

        after();

        return null;
    }

    private void after() {
        System.out.println( "签合同");
    }

    private void befer() {
        System.out.println( "带人去看房子");
    }

}
