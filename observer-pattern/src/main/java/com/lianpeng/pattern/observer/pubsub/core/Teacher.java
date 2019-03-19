package com.lianpeng.pattern.observer.pubsub.core;

import com.lianpeng.pattern.observer.vo.Question;

/**
 * @author lianp
 * @date 2019/3/19 9:56
 * @since
 **/
public class Teacher implements EventHandle {

    private String teacherName;

    @Override
    public void handler( Object source ) {
        if ( !check( source ) ) {
            System.out.println( " Events are out of scope " );
            return;
        }
        Question question = (Question) source;
        StringBuilder sb = new StringBuilder( getTeacherName() );
        sb.append( "老师: \n 您有一个新问题需要回答。问题内容：" )
                .append( question.getMsg() )
                .append( "\n 提问者:" )
                .append( question.getName() );
        System.out.println( sb.toString() );

    }

    @Override
    public boolean check( Object source ) {
        return source instanceof Question;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName( String teacherName ) {
        this.teacherName = teacherName;
    }
}
