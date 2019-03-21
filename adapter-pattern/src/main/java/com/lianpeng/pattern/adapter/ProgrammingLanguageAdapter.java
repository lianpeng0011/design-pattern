package com.lianpeng.pattern.adapter;

/**
 * @author lianp
 * @date 2019/3/21 15:38
 * @since
 **/
public class ProgrammingLanguageAdapter implements Programming {

    private JavaProgramming programming;

    public ProgrammingLanguageAdapter( JavaProgramming programming ) {
        this.programming = programming;
    }

    public void writeCode() {
        programming.mainCode();
    }
}
