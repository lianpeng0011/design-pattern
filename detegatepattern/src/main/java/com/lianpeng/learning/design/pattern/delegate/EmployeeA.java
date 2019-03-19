package com.lianpeng.learning.design.pattern.delegate;

/**
 * @author lianp
 * @date 2019/3/14 11:55
 * @since
 **/
public class EmployeeA {

    public String demand( String command ) {

        System.out.println("需求调研部门将需求采集整理");

        return "demand";
    }
}
