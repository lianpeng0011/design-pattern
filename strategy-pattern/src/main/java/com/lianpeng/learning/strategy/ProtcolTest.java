package com.lianpeng.learning.strategy;

import com.lianpeng.learning.strategy.vo.SP;

/**
 * @author lianp
 * @date 2019/3/19 11:05
 * @since
 **/
public class ProtcolTest {


    public static void main( String[] args ) {

        SP sp = new SP();
        sp.setAddr( "111" );
        sp.setType( "1" );
        sp.setName( "BUS" );
        ProtocolHandler handler = ProtcolType.get( 1 );
        System.out.print("BUS protocol check :" +handler.paramCheck( sp ));

    }


    /**
     * 策略目录，清晰表明什么类型对应何种处理方式，不同协议对应同等策略时，可以直接查询
     */
    enum  ProtcolType {
        DEFAULT( 999, new DefaultProtcolHandler() ),
        Bus( 1, new BusProtcolHandler() );

        private int type ;

        private ProtocolHandler protocolHandler;

        ProtcolType( int type, ProtocolHandler protocolHandler ) {
            this.type = type;
            this.protocolHandler = protocolHandler;
        }

        static ProtocolHandler get( int type ) {
            for ( ProtcolType p : ProtcolType.values() ) {
                if ( p.type == type ) {
                    return p.protocolHandler;
                }
            }
            return DEFAULT.protocolHandler;
        }
    }
}
