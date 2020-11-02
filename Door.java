public class Door {
    private State state;

    Door() {
        state = State.OPEN;
    }

    public void changeState(State a) {
        state = a;
    }
}
