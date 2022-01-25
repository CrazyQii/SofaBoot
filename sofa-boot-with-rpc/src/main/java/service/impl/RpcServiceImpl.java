package service.impl;

import service.RpcService;

/**
 * @Program: RpcServiceImpl
 * @Description: rpc service
 * @Author: HanLinqi
 * @Date: 2022/01/25 22:20:45
 */
public class RpcServiceImpl implements RpcService {

    @Override
    public String sayHello(String str) {
        System.out.println("Service receive" + str);
        return "hello " + str + " !";
    }
}
