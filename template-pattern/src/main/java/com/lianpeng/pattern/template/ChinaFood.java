package com.lianpeng.pattern.template;

/**
 * @author lianp
 * @date 2019/3/21 16:37
 * @since
 **/
public class ChinaFood extends AbstractCook {

    public ChinaFood( String menu ) {
        super( menu );
    }

    @Override
    protected void cook() {
        System.out.println( "使用宫廷技法进行制作" );
    }

    @Override
    protected boolean cleckMenu() {
        return "china".equals( getMenu() );
    }
}
