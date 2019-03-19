package com.lianpeng.learning.strategy;

import com.lianpeng.learning.strategy.vo.SP;

/**
 * @author lianp
 * @date 2019/3/19 10:55
 * @since
 **/
public interface ProtocolHandler {

    /**
     * 参数检查
     * @param sp 参数对象
     * @return
     */
    boolean paramCheck( SP sp );
}
