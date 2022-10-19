package Homework03.Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Car construct() {
        builder.makeBody();
        builder.makeEngine();
        builder.makeTyre();
        builder.makeGearbox();
        return builder.getCar();
    }
}
