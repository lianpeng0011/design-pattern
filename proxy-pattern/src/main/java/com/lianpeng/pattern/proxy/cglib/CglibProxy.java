package com.lianpeng.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author lianp
 * @date 2019/3/22 13:19
 * @since
 **/
public class CglibProxy implements MethodInterceptor {



    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass( clazz );
        enhancer.setCallback( this );

        return enhancer.create();
    }

    public Object intercept( Object o, Method method, Object[] objects, MethodProxy methodProxy ) throws Throwable {

        before();

        Object obj = methodProxy.invokeSuper( o, objects );

        after();
        return obj;
    }

    private void after() {
        System.out.println( "签合同");
    }

    private void before() {
        System.out.println( "带人去看房子");
    }
}
