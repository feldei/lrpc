package com.lrpc.provider.service.impl;

import com.irpc.service.IHelloService;

/**
 * 服务端接口实现
 */
public class HelloServiceImpl implements IHelloService {

    private static final long serialVersionUID = 1L;

    @Override
    public String sayHi(String name, String msg) {
        return new StringBuffer().append("hi~! ").append(name).append(",").append(msg).toString();
    }

}