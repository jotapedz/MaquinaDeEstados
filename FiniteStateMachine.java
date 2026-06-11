/**
 * Máquina de Estados Finitos genérica que opera apenas sobre a interface State.
 *
 * Assim como no modelo orientado a objetos em C++, a FSM conhece somente o
 * contrato do estado atual. Ela não precisa conhecer StandingState,
 * CrouchingState ou JumpingState diretamente.
 */
public class FiniteStateMachine {
    private State currentState;
    private State newState;

    public FiniteStateMachine(State initialState) {
        this.currentState = null;
        this.newState = initialState;
    }
    public void update(Player player, float deltaTime) {
        if (newState != currentState) {
            if (currentState == null && newState != null) {
                System.out.println("  Estado atual: '" + newState.getName() + "'");
            } else if (currentState != null && newState != null) {
                System.out.println(
                    "Transição: '" + currentState.getName() + "' --> '" + newState.getName() + "'"
                );
            }

            if (currentState != null) {
                currentState.onExit(player);
            }

            currentState = newState;

            if (currentState != null) {
                currentState.onEnter(player);
            }
        }

        if (currentState != null) {
            newState = currentState.execute(player, deltaTime);
        }
    }

    public State getCurrentState() {
        return currentState;
    }
}
