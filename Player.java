public class Player {
    protected final FiniteStateMachine fsm;

    public Player(FiniteStateMachine fsm) {
        this.fsm = fsm;
    }

    public void update(float deltaTime) {
        fsm.update(this, deltaTime);
    }
}
