public class Main {
    public static void main(String[] args) {
        System.out.println("iniciar simulador de rede...\n");

        Node routerA = new Node("roteador A", "192.168.0.10");
        Node server = new Node("servidor", "10.0.0.50");

        // criando alguns pacotes
        Packet ping = new Packet(routerA.getIpAddress(), server.getIpAddress(), "PING_REQUEST", Protocol.ICMP);
        Packet httpReq = new Packet(routerA.getIpAddress(), server.getIpAddress(), "GET /index.html", Protocol.TCP);

        // simulando o tráfego
        routerA.sendPacket(ping, server);
        routerA.sendPacket(httpReq, server);
    }
}