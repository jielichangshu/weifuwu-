package com.tensquare.base.controller;

import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 公共异常处理类  底层是spring aop
 */
@RestControllerAdvice  // ==  @ControllerAdvice+@ResponseBody
public class BaseExceptionHandler {

    /**
     * 处理所有的异常
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Result error(Exception e){
        ///在当前这个微服务中 可以具体的异常返回相应的错误？
        /*if(e instanceof  NullPointerException){
            return new Result(false, StatusCode.ERROR,"查询的数据不存在");
        }*/
        return new Result(false, StatusCode.ERROR,e.getMessage());
    }
}
