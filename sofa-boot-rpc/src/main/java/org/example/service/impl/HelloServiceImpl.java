package org.example.service.impl;

import org.example.service.HelloService;

/**
 * @program: HelloServiceImpl
 * @description:
 * @author: hanLinQi
 * @create: 2022-01-27 15:35
 **/

public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String str) {
        System.out.println("Service Hello, " + str);
        return "successful";
    }
}
