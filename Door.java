public class Door {
    private State state;

    Door() {
        state = State.CLOSED; // CHANGE THIS
    }

    public void changeState(State a) {
        state = a;
    }
}
