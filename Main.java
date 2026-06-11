public class Main {
    public static void main(String[] args) {

        FiniteStateMachine fsm = new FiniteStateMachine(PlayerStates.standingState);
        Player player = new Player(fsm);

        System.out.println("Iniciando a máquina...");

        do {
            player.update(0.016f);
        } while (fsm.getCurrentState() != null);

        System.out.println("[FIM]");
    }
}
