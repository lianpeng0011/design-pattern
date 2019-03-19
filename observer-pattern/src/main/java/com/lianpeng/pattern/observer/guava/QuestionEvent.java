package com.lianpeng.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;
import com.lianpeng.pattern.observer.vo.Question;

/**
 * @author lianpeng
 * @date 2019/3/18 22:40
 * @since
 **/
public class QuestionEvent {


    @Subscribe
    public void subscribe( Question question ){
        System.out.print(question.getTarget() +"老师:\n您有一个新问题需要回答。问题内容："
                         +question.getMsg()+"\n" + "提问者:"+question.getName());
    }
}
