public class Door {
    private State state;

    Door(State a) {
        state = a;
    }

    public void changeState(State a) {
        state = a;
    }
}
