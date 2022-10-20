package Homework05.Mediator;

import java.util.List;

public abstract class Mediator {
    protected List<SubSystem> subSystems;
    public abstract void send(SubSystem subSystem, String message);

    public abstract void addSubSystem(SubSystem subSystem);
}
