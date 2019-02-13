package org.bran.branproxy.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * @Auther: BranSummer
 * @Date: 2019-2-6 16:04
 * @Description:
 */
public interface BaseRepository<T,I extends Serializable> extends
        PagingAndSortingRepository<T,I>,JpaSpecificationExecutor<T> {
}