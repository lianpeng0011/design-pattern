package com.lianpeng.pattern.template;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lianp
 * @date 2019/3/21 16:39
 * @since
 **/
public class CookTest {

    public static void main( String[] args ) {
        AbstractCook cook = new WesternFood( "china" );
        cook.Cook();


        List<String> list = new ArrayList<String>();
        list.add( "1" );
        list.add( "2" );

//        Iterator<String> iterator = list.iterator();
//        while ( iterator.hasNext() ){
//            String s = iterator.next();
//            if("1".equals( s )){
//                iterator.remove();
//            }
//        }
//        System.out.print(list.get( 0 ));
//        list.add( "1" );
//        list.add( "2" );
        for ( String item : list ){
            if("1".equals( item )){
                list.remove( item );
            }
        }
        System.out.print(list.get( 0 ));
    }
}
