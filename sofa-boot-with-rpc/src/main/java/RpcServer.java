import com.alipay.sofa.rpc.config.ServerConfig;

/**
 * @Program: RpcServer
 * @Description: rpc服务端
 * @Author: HanLinqi
 * @Date: 2022/01/25 22:18:31
 */
public class RpcServer {

    public static void main(String[] args) {
        ServerConfig serverConfig = new ServerConfig()
                // 设置协议，默认bolt
                .setProtocol("bolt")
                // 设置端口，默认12200
                .setPort(12200)
                // 非守护线程
                .setDaemon(false);
    }
}
