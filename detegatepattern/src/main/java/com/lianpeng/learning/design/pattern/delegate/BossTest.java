package com.lianpeng.learning.design.pattern.delegate;

/**
 * @author lianp
 * @date 2019/3/19 10:39
 * @since
 **/
public class BossTest {


    public static void main( String[] args ) {
        Boss boss = new Boss(new Leader());

        boss.command( "demand" );

        boss.command( "programming" );

        boss.command( "扯淡" );
    }
}
