package Homework06.State;

public class TCP {
    private State state = CloseState.getInstance();

    public void changeState(State state) {
        this.state = state;
    }

    public void open(){
        if (state instanceof CloseState) {
            state.open(this);
        }
    }

    public void listen() {
        if (state instanceof OpenState) {
            state.listen(this);
        }
    }

    public void close() {
        if (state instanceof ListenState || state instanceof OpenState) {
            state.close(this);
        }
    }
}
