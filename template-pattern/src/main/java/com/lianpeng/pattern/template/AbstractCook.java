package com.lianpeng.pattern.template;

/**
 * @author lianp
 * @date 2019/3/21 16:18
 * @since
 **/
public abstract class AbstractCook {


    private String menu;

    public AbstractCook( String menu ) {
        this.menu = menu;
    }

    public void Cook(){
        if(!cleckMenu()){
            System.out.println( "菜品无法制作" );
            return ;
        }

        materialSelection();

        materialHandle();

        materialClean();

        cook();


    }

    /**
     * 烹饪事物
     */
    protected abstract void cook();

    private void materialHandle() {
        System.out.print("材料处理");
    }

    private void materialClean() {
        System.out.println("洗菜");
    }

    void materialSelection(){
        System.out.println("准备菜单中的材料");
   };


    /**
     * 检查菜单是否会做
     * @return
     */
    protected abstract boolean cleckMenu();

    public String getMenu() {
        return menu;
    }

    public void setMenu( String menu ) {
        this.menu = menu;
    }
}
