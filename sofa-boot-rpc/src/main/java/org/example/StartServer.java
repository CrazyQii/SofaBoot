package org.example;

import com.alipay.sofa.rpc.config.ProviderConfig;
import com.alipay.sofa.rpc.config.ServerConfig;
import org.example.service.HelloService;
import org.example.service.impl.HelloServiceImpl;

/**
 * @program: StartServer
 * @description: 服务端
 * @author: hanLinQi
 * @create: 2022-01-27 15:37
 **/

public class StartServer {

    public static void main(String[] args) {
        ServerConfig serverConfig = new ServerConfig()
                // 设置协议，默认bolt
                .setProtocol("bolt")
                // 设置线程端口，默认12200
                .setPort(12200)
                // 非守护线程
                .setDaemon(false);

        ProviderConfig<HelloService> providerConfig = new ProviderConfig<HelloService>()
                // 指定接口
                .setInterfaceId(HelloService.class.getName())
                // 指定实现
                .setRef(new HelloServiceImpl())
                // 指定服务端
                .setServer(serverConfig);

        // 发布服务
        providerConfig.export();

    }
}
