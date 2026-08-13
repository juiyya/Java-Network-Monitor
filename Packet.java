public class Packet {
    private String sourceIp;
    private String destinationIp;
    private String payload;
    private Protocol protocol;

    public Packet(String sourceIp, String destinationIp, String payload, Protocol protocol) {
        this.sourceIp = sourceIp;
        this.destinationIp = destinationIp;
        this.payload = payload;
        this.protocol = protocol;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public String getDestinationIp() {
        return destinationIp;
    }

    public String getPayload() {
        return payload;
    }

    public Protocol getProtocol() {
        return protocol;
    }

    // formata o texto
    @Override
    public String toString() {
        return String.format("[Pacote %s] %s -> %s | Dados: %s",
                protocol, sourceIp, destinationIp, payload);
    }
}