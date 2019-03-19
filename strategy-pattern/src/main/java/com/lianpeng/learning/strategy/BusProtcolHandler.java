package com.lianpeng.learning.strategy;

import com.lianpeng.learning.strategy.vo.SP;
import org.apache.commons.lang3.StringUtils;

/**
 * @author lianp
 * @date 2019/3/19 11:04
 * @since
 **/
public class BusProtcolHandler implements ProtocolHandler {


    public boolean paramCheck( SP sp ) {
        return StringUtils.isNotBlank( sp.getAddr() ) && StringUtils.isNotBlank( sp.getType() );
    }
}
