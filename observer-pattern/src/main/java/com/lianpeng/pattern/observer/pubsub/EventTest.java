package com.lianpeng.pattern.observer.pubsub;

import com.lianpeng.pattern.observer.pubsub.core.Event;
import com.lianpeng.pattern.observer.pubsub.core.Listener;
import com.lianpeng.pattern.observer.pubsub.core.Teacher;
import com.lianpeng.pattern.observer.vo.Question;

/**
 * @author lianpeng
 * @date 2019/3/18 22:50
 * @since
 **/
public class EventTest {

    public static void main( String[] args ) {
        Question question = new Question();
        question.setMsg( "适配器模式和装饰器模式的区别?" );
        question.setName( "刘德华" );

        Teacher teacher = new Teacher();
        teacher.setTeacherName( "Tom" );
        Teacher teacher1 = new Teacher();
        teacher1.setTeacherName( "Mic" );

        Listener listener = new Listener();
        listener.addListener( teacher.getTeacherName(), teacher );
        listener.addListener( teacher1.getTeacherName(),teacher1 );
        listener.publishEvent( new Event( question ) );
    }
}
