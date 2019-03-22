package com.lianpeng.pattern.template;

/**
 * @author lianp
 * @date 2019/3/21 16:34
 * @since
 **/
public class WesternFood extends AbstractCook {

    public WesternFood( String menu ) {
        super( menu );
    }

    @Override
    protected void cook() {
        System.out.println( "使用米其林餐厅技艺进行事物烹调" );
    }

    @Override
    protected boolean cleckMenu() {

        return "western".equals( getMenu() );
    }
}
