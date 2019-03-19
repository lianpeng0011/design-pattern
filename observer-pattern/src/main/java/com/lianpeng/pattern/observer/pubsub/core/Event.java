package com.lianpeng.pattern.observer.pubsub.core;

/**
 * @author lianpeng
 * @date 2019/3/18 22:50
 * @since
 **/
public class Event {

    private Object source;

    public Event( Object source ) {
        this.source = source;
    }

    public Object getSource() {
        return source;
    }
}
