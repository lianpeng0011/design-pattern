package com.lianpeng.pattern.observer.guava;

import com.google.common.eventbus.EventBus;
import com.lianpeng.pattern.observer.vo.Question;

/**
 * @author lianpeng
 * @date 2019/3/18 22:45
 * @since
 **/
public class QuestionEventTest {


    public static void main( String[] args ) {
        EventBus bus = new EventBus();

        Question question = new Question();
        question.setName( "小明" );
        question.setMsg( "适配器模式和装饰器模式的区别是什么？" );
        question.setTarget( "Tom" );

        QuestionEvent event = new QuestionEvent();

        bus.register( event );

        bus.post( question );
    }
}
