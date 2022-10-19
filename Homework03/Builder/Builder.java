package Homework03.Builder;

public abstract class Builder {
    protected Car car;

    public Builder() {
        this.car = new Car();
    }

    public abstract void makeBody();

    public abstract void makeEngine();

    public abstract void makeTyre();

    public abstract void makeGearbox();

    public Car getCar() {
        return this.car;
    }
}
