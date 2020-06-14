package com.ultlog.common.exception;

/**
 * @program: common
 * @link: github.com/ultlog/collector
 * @author: will
 * @create: 2020-05-24
 **/
public class FailedGetIpException extends RuntimeException {

    public FailedGetIpException(String message) {
        super(message);
    }
}
