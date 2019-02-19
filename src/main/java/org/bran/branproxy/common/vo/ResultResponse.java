package org.bran.branproxy.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: BranSummer
 * @Date: 2019-2-17 17:02
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultResponse {

    public static final int SUCCESS = 0;

    public static final int FAILURE = -1;

    private Integer code;

    private Object data;

    private String msg;

    public static ResultResponse buildSuccess(Object data, String msg){
        return new ResultResponse(SUCCESS,data,msg);
    }

    public static ResultResponse buildSuccess(){
        return buildSuccess(null,"success");
    }

    public static ResultResponse buildSuccess(Object data){
        return buildSuccess(data,"success");
    }

    public static ResultResponse buildFail(int code, Object data , String msg){
        return new ResultResponse(code,data,msg);
    }

    public static ResultResponse buildFail(String msg){
        return buildFail(FAILURE,null,msg);
    }
}
