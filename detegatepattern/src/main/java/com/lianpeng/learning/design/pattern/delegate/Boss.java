package com.lianpeng.learning.design.pattern.delegate;

/**
 * @author lianp
 * @date 2019/3/14 11:54
 * @since
 **/
public class Boss {

    private Leader leader;

    public Boss( Leader leader ) {
        this.leader = leader;
    }

    void command( String command ){
        String result = leader.detegateWork( command );

        System.out.println( "Boss 得到最总的结果:" + result );
    }
}
