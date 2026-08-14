package simulador;

// O Record cria getters, setters e construtores automaticamente nos bastidores
public record Packet(String sourceIp, String destinationIp, String payload, String protocol) {
}