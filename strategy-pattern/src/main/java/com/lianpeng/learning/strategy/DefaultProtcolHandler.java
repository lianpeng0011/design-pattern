package com.lianpeng.learning.strategy;

import com.lianpeng.learning.strategy.vo.SP;
import org.apache.commons.lang3.StringUtils;

/**
 * 默认检查设备只要有地址
 * @author lianp
 * @date 2019/3/19 11:01
 * @since
 **/
public class DefaultProtcolHandler implements ProtocolHandler {


    public boolean paramCheck( SP sp ) {

        return StringUtils.isNotBlank( sp.getAddr() );
    }
}
