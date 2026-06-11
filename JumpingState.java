
public class JumpingState implements State {
    private static final int INITIAL_COUNTER = 5;
    private int counter = INITIAL_COUNTER;

    @Override
    public String getName() {
        return "Pulando";
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
            return null;
        }

        return this;
    }
}
