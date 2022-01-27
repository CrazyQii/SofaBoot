package org.example;

import com.alipay.sofa.rpc.config.ConsumerConfig;
import com.alipay.sofa.rpc.config.ProviderConfig;
import com.alipay.sofa.rpc.config.ServerConfig;
import org.example.service.HelloService;
import org.example.service.impl.HelloServiceImpl;

/**
 * @program: StartClient
 * @description: 消费端
 * @author: hanLinQi
 * @create: 2022-01-27 15:37
 **/

public class StartClient {

    public static void main(String[] args) {
        ConsumerConfig<HelloService> consumerConfig = new ConsumerConfig<HelloService>()
                // 指定接口
                .setInterfaceId(HelloService.class.getName())
                // 指定协议
                .setProtocol("bolt")
                // 指定直连地址
                .setDirectUrl("bolt://127.0.0.1:12200");

        // 生成代理类
        HelloService helloService = consumerConfig.refer();

        while (true) {
            System.out.println(helloService.sayHello("bye bye"));
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
