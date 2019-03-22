package com.lianpeng.pattern.proxy.cglib;

import com.lianpeng.pattern.proxy.IHouse;
import com.lianpeng.pattern.proxy.SmallCompany;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author lianp
 * @date 2019/3/22 15:45
 * @since
 **/
public class CglibProxyTest {

    public static void main( String[] args ) throws Exception {
        CglibProxy cglibProxy = new CglibProxy();
        IHouse obj = (IHouse) cglibProxy.getInstance( SmallCompany.class );
        obj.rent();


        byte [] bytes = ProxyGenerator.generateProxyClass( "$Proxy1", new Class[]{ IHouse.class} );
        FileOutputStream os = new FileOutputStream( "E://$Proxy1.class");
        os.write(bytes);
        os.close();
    }
}
