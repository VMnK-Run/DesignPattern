package Homework06.Command;

public class SwitchCommand extends Command{
    private int index;

    public SwitchCommand(RoomLight roomLight) {
        super(roomLight);
    }

    public void turn(int index) {
        this.index = index;
        this.execute();
    }

    @Override
    public void execute() {
        this.roomLight.turn(index);
    }
}
