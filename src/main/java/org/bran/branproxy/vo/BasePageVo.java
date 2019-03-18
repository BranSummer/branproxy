package org.bran.branproxy.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizhle
 */
@Data
public class BasePageVo<T> {

    private Integer count = 0;

    private List<T> list = new ArrayList<>();
}
