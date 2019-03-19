package com.lianpeng.learning.design.pattern.delegate;

/**
 * @author lianp
 * @date 2019/3/14 11:56
 * @since
 **/
public class EmployeeB {

    public String programming( String demand ) {

        System.out.println( "程序员根据需求进行开发" );

        return "programming" ;
    }
}
