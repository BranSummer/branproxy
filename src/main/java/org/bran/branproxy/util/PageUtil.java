package org.bran.branproxy.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lizhle
 */
public class PageUtil {

    public static int getPageCount(int size, int pageSize) {
        if (size % pageSize == 0) {
            return size / pageSize;
        } else {
            return size / pageSize + 1;
        }
    }


    /**
     * 获取分页后的列表集合
     *
     * @param entityList 原数据列表
     * @return 分页后的列表集合
     */
    public static  <T> List<List<T>> getGroupedListWithPaged(List<T> entityList,int pageSize) {
        // 获取总明细数（一条供应商对应一条明细）
        int totalCount = entityList.size();
        // 总页数
        int totalPageCount = totalCount % pageSize == 0
                ? totalCount / pageSize
                : totalCount / pageSize + 1;
        List<List<T>> groupedList = new ArrayList<>(totalPageCount);
        // 分页后的list加入到集合
        for (int i = 1; i <= totalPageCount; i++) {
            List<T> pagedList = getPagedList(entityList, i, pageSize);
            groupedList.add(pagedList);
        }
        return groupedList;
    }

    /**
     * 获取分页数据
     *
     * @param data     原数据列表
     * @param pageNum  页码
     * @param pageSize 页容量
     * @return 分页集合
     */
    public static   <T> List<T> getPagedList(List<T> data, Integer pageNum, Integer pageSize) {
        // 起始位置
        int fromIndex = (pageNum - 1) * pageSize;
        // 起始位置超出最大长度
        if (fromIndex >= data.size()) {
            return new ArrayList<>(0);
        }
        // skip: 返回一个丢弃原Stream的前N个元素后剩下元素组成的新Stream，如果原Stream中包含的元素个数小于N，那么返回空Stream；
        // limit: 对一个Stream进行截断操作，获取其前N个元素，如果原Stream中包含的元素个数小于N，那就获取其所有的元素；
        return data.stream().skip(fromIndex).limit(pageSize).collect(Collectors.toList());
    }
}
