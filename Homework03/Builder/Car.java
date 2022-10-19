package Homework03.Builder;

public class Car {
    private String body;
    private String engine;
    private String tyre;

    private String gearbox;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public String getTyre() {
        return tyre;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=======Car Info==========");
        sb.append("\nBody is ").append(this.body);
        sb.append("\nEngine is ").append(this.engine);
        sb.append("\nTyre is ").append(this.tyre);
        sb.append("\nGearbox is ").append(this.gearbox);
        return sb.toString();
    }
}
