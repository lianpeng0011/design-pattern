package com.lianpeng.pattern.observer.pubsub.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lianpeng
 * @date 2019/3/18 22:51
 * @since
 **/
public class Listener {


    private Map<String, EventHandle> map = new ConcurrentHashMap<>();


    public void addListener( String name, EventHandle tager ) {

        map.put( name, tager );
    }


    public void publishEvent( Event event ) {
        if ( map == null ) {
            System.out.println( "There is no reeiver for the current envet " );
            return;
        }
        for ( EventHandle handle : map.values() ) {
            handle.handler( event.getSource() );
        }
    }


}
