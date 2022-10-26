package Homework06.Command;

public abstract class Command {
    protected RoomLight roomLight;

    public Command(RoomLight roomLight) {
        this.roomLight = roomLight;
    }
    public abstract void execute();
}
