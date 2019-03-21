package com.lianpeng.pattern.adapter;

/**
 * @author lianp
 * @date 2019/3/21 15:59
 * @since
 **/
public class ProgrammingTest {


    public static void main( String[] args ) {
        JavaProgramming java = new JavaProgramming();

        Programming programming = new ProgrammingLanguageAdapter( java );
        programming.writeCode();
    }
}
