package com.lianpeng.pattern.observer.pubsub.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lianpeng
 * @date 2019/3/18 22:51
 * @since
 **/
public class Listener {


    private Map<String, Object> map = new ConcurrentHashMap<>();


    public void addListener(String type ,Object source){

        map.put( type, source );
    }


}
