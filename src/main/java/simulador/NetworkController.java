package simulador;

import org.springframework.web.bind.annotation.*;
import java.util.LinkedList;
import java.util.Queue;

@RestController
@RequestMapping("/api/network")
public class NetworkController {

    private Queue<Packet> buffer = new LinkedList<>();
    private final int MAX_BUFFER = 5;

    // Rota POST: Recebe um JSON e converte automaticamente para o Record 'Packet'
    @PostMapping("/send")
    public String receivePacket(@RequestBody Packet packet) {
        if (buffer.size() < MAX_BUFFER) {
            buffer.offer(packet);
            return "Sucesso: Pacote de " + packet.sourceIp() + " no buffer. Total: " + buffer.size();
        } else {
            return "ERRO: Buffer cheio (Drop) para " + packet.sourceIp();
        }
    }

    // Rota GET: Retorna a fila atual convertida em JSON
    @GetMapping("/status")
    public Queue<Packet> getStatus() {
        return buffer;
    }
}