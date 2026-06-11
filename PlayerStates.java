public final class PlayerStates {
    public static final State standingState = new StandingState();
    public static final State crouchingState = new CrouchingState();
    public static final State jumpingState = new JumpingState();

    private PlayerStates() {
        // Classe utilitária: não deve ser instanciada.
    }
}
