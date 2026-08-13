## Sprint 1: Setup e Rede (Orientação a Objetos)

- *Extension Pack for Java* 
.criar as classes base: `Packet` (o pacote de dados contendo IP de origem, destino e payload) e `Node` (representando um roteador ou servidor).

## Sprint 2: Buffers e Fluxo de Dados 

Um roteador tem um *buffer*. Se chegarem pacotes demais, ele enfileira; se a fila lotar, pacotes são descartados (*packet drop*).

- Implementar a lógica de recebimento de pacotes dentro dos nossos `Nodes`.
- *Collections Framework* vamos usar `Queue` e `List` e introduzir tratamento de exceções (`try/catch`).

## Sprint 3: Threads e Concorrência

Uma rede não funciona de forma sequencial. Vários pacotes estão transitando ao mesmo tempo entre diferentes nós.

- Fazer com que cada `Node` rode de forma independente, processando sua fila de pacotes simultaneamente.
- Implementação da interface `Runnable`, criação de `Threads`, e o mais importante: sincronização (`synchronized`, `Locks`), para evitar condições de corrida quando múltiplos pacotes tentarem acessar o mesmo recurso.

#### Sprint 4: Terminal

loop de monitoramento que atualiza o terminal em tempo real com o status da rede.

- Um "painel" no terminal que mostra pacotes enviados, recebidos, descartados e a taxa de transferência.
- Formatação avançada de `String`, `System.out.printf`, e manipulação de *streams* de dados.

