public class Node {
    private String name;
    private String ipAddress;

    public Node(String name, String ipAddress) {
        this.name = name;
        this.ipAddress = ipAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    // simular o envio
    public void sendPacket(Packet packet, Node destination) {
        System.out.println(">> [" + this.name + "] Enviando pacote para " + destination.getIpAddress() + "...");
        // chamada direta para o método do outro objeto (de forma síncrona)
        destination.receivePacket(packet);
    }

    // simular o recebimento
    public void receivePacket(Packet packet) {
        System.out.println("<< [" + this.name + "] Pacote recebido!");
        System.out.println("   Detalhes: " + packet.toString() + "\n");
    }
}