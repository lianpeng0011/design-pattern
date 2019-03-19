package com.lianpeng.pattern.observer.pubsub.core;

/**
 * @author lianp
 * @date 2019/3/19 9:46
 * @since
 **/
public interface EventHandle {


    /**
     * 事件处理器
     * @param source 事件源
     */
    void handler(Object source);

    /**
     * 类型检查
     * @param source 事件源
     * @return true 检查通过
     */
    boolean check( Object source );




}
