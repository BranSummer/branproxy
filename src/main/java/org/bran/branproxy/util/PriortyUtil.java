package org.bran.branproxy.util;

import org.omg.CORBA.TIMEOUT;

/**
 * @Auther: BranSummer
 * @Date: 2018-10-12 21:24
 * @Description:
 */
public class PriortyUtil {

    private static int MAX_TIMEOUT = 5000;

    private static int PRIORTY_NUM = 5;

    public static int getPriorty(int timeout) {
        if (timeout < 0 || timeout > MAX_TIMEOUT) {
            return -1;
        }
        return PRIORTY_NUM - PRIORTY_NUM * timeout / MAX_TIMEOUT ;
    }

}
