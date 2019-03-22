package com.lianpeng.pattern.proxy.jdk;

import com.lianpeng.pattern.proxy.IHouse;
import com.lianpeng.pattern.proxy.SmallCompany;

/**
 * @author lianp
 * @date 2019/3/22 11:36
 * @since
 **/
public class JdkProxyTest{


    public static void main( String[] args ) throws Throwable {
        JdkProxy jdkProxy = new JdkProxy();
        IHouse obj = (IHouse) jdkProxy.getInstance( new SmallCompany() );
        obj.rent();

//        byte [] bytes = ProxyGenerator.generateProxyClass( "$Proxy0", new Class[]{ IHouse.class} );
//        FileOutputStream os = new FileOutputStream( "E://$Proxy0.class");
//        os.write(bytes);
//        os.close();

    }

}
