package com.lrpc.provider;

import com.irpc.service.IHelloService;
import com.lrpc.provider.service.impl.HelloServiceImpl;
import com.lrpc.provider.service.impl.ServerCenter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LRpcProviderApplication {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(LRpcProviderApplication.class, args);
        final ServerCenter serverCenter = new ServerCenter();
        serverCenter.regist(IHelloService.class, HelloServiceImpl.class);
        serverCenter.start();
    }

}
