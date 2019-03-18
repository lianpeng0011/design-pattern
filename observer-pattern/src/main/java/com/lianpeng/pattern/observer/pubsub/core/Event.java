package com.lianpeng.pattern.observer.pubsub.core;

/**
 * @author lianpeng
 * @date 2019/3/18 22:50
 * @since
 **/
public class Event {

    private Object source;

    private String type;

    public Event(String type, Object source ) {
        this.source = source;
        this.type = type;
    }

    public void publish(String type){

    }


}
