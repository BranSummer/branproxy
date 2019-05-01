package org.bran.branproxy.config;

import lombok.extern.slf4j.Slf4j;
import org.bran.branproxy.common.vo.ResultResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author lizhle
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResultResponse errorHandler(Exception ex) {
        log.error("",ex);
        return ResultResponse.buildFail("系统异常:" + ex.getMessage());
    }
}
