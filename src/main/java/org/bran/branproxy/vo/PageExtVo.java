package org.bran.branproxy.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lizhle
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PageExtVo<T> extends BasePageVo<T> {

    /**
     * 每页记录数
     */
    private int pageSize;
    /**
     * 总页数
     */
    private int totalPage;
    /**
     * 当前页数
     */
    private int currPage;

    public int getTotalPage() {
        if (this.getCount() == 0) {
            return 0;
        }
        return (int) Math.ceil((double) this.getCount() / pageSize);
    }
}
