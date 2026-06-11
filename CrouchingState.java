
public class CrouchingState implements State {
    private static final int INITIAL_COUNTER = 3;
    private int counter = INITIAL_COUNTER;

    @Override
    public String getName() {
        return "Agachado";
    }

    @Override
    public void onEnter(Player player) {
        counter = INITIAL_COUNTER;
        State.super.onEnter(player);
    }

    @Override
    public State execute(Player player, float deltaTime) {
        System.out.println("Executando estado '" + getName() + "'");
        counter--;

        if (counter == 0) {
            return PlayerStates.jumpingState;
        }

        return this;
    }
}
