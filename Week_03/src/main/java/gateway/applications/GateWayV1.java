package gateway.applications;

import gateway.inbound.HttpInboundServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class GateWayV1 {
    public final static String GATEWAY_NAME = "NIOGateway";
    public final static String GATEWAY_VERSION = "1.0.0";

    public static void main(String[] args) {
        // this is API gateway
        String apiGatewayPort = System.getProperty("apiGatewayPort","1234");

        // this is real backend server
        String proxyServer = System.getProperty("proxyServer","http://localhost:5678");

        //  http://localhost:1234/api/hello  ==> gateway API
        //  http://localhost:5678/api/hello  ==> backend service

        int port = Integer.parseInt(apiGatewayPort);
        System.out.println(GATEWAY_NAME + " " + GATEWAY_VERSION +" starting...");

        // start the proxy server and then start the backend server
        HttpInboundServer server = new HttpInboundServer(port, proxyServer);

        System.out.println(GATEWAY_NAME + " " + GATEWAY_VERSION +" started at http://localhost:" + port + " for server:" + proxyServer);

        try {
            server.run();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
