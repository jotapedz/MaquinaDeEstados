/**
 * Interface base da FSM.
 *
 * No equivalente em C++ dos slides, os estados concretos expõem a mesma
 * "interface" por herança e polimorfismo virtual. Em Java, a forma mais
 * direta de representar esse contrato comum é com uma interface.
 */
public interface State {
    /**
     * Retorna o nome do estado para fins de debug e impressão.
     */
    String getName();

    /**
     * Ação executada quando a máquina entra no estado.
     *
     * Foi definido como default para concentrar o comportamento comum,
     * evitando repetição nas classes concretas, sem tirar a possibilidade
     * de sobrescrita se necessário.
     */
    default void onEnter(Player player) {
        System.out.println("  entrando no estado '" + getName() + "'");
    }

    /**
     * Ação executada quando a máquina sai do estado.
     */
    default void onExit(Player player) {
        System.out.println("  saindo do estado '" + getName() + "'");
    }

    /**
     * Executa a lógica do estado atual e devolve o próximo estado.
     *
     * A própria implementação concreta conhece a transição seguinte,
     * mantendo a FSM desacoplada dos estados concretos.
     */
    State execute(Player player, float deltaTime);
}
