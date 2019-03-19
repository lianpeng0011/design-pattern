package com.lianpeng.learning.design.pattern.delegate;

/**
 * @author lianp
 * @date 2019/3/14 11:55
 * @since
 **/
public class Leader {

    private static final String COMMAND_A = "demand";

    private static final String COMMAND_B = "programming";

    public String detegateWork( String command ) {
        String result = "不支持这个命令";
        if ( COMMAND_A.equals( command ) ) {
            EmployeeA a = new EmployeeA();
            result = a.demand( command );
        }
        if ( COMMAND_B.equals( command ) ) {
            EmployeeB b = new EmployeeB();
            result = b.programming( command );
        }
        return result;
    }
}
