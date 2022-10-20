package Homework05.Mediator;

import java.util.ArrayList;

public class ConcreteMediator extends Mediator{

    public ConcreteMediator() {
        this.subSystems = new ArrayList<>();
    }

    public void addSubSystem(SubSystem subSystem) {
        this.subSystems.add(subSystem);
    }

    @Override
    public void send(SubSystem subSystem, String message) {
        for(SubSystem s : subSystems) {
            if (s != subSystem) {
                s.receive(subSystem, message);
            }
        }
    }
}
