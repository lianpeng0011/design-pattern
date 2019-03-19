package com.lianpeng.pattern.observer.vo;

/**
 * @author lianpeng
 * @date 2019/3/18 22:42
 * @since
 **/
public class Question {


    private String name;
    private String msg;
    private String target;

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg( String msg ) {
        this.msg = msg;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget( String target ) {
        this.target = target;
    }
}
