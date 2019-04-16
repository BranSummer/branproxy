package org.bran.branproxy.common.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collections;

/**
 * @author lizhle
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PagedResponse extends ResultResponse {

    private Integer count;

    public static PagedResponse buildPage(Object data, int count){
        PagedResponse pagedResponse = new PagedResponse();
        pagedResponse.setCount(count);
        pagedResponse.setData(data);
        pagedResponse.setCode(ResultResponse.SUCCESS);
        pagedResponse.setMsg("success");
        return pagedResponse;
    }

    public static PagedResponse buildEmpty(){
        return buildPage(Collections.emptyList(),0);
    }
}
