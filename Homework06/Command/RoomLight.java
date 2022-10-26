package Homework06.Command;

public class RoomLight {
    private int[] map;
    private boolean[] lights; // true表示灯开，false表示灯灭

    public RoomLight() {
        this.map = new int[5];
        for(int i = 0; i < 5; i++) {
            this.map[i] = i;
        }
        this.lights = new boolean[5];
        for (int i = 0; i < 5; i++) {
            lights[i] = false;
        }
    }

    public void setIndex(int index, int light) {
        this.map[index] = light;
    }

    public void turn(int index) {
        if(lights[map[index]]) {
            this.turnOff(index);
        } else {
            this.turnOn(index);
        }
    }

    public void turnOn(int index) {
        System.out.print("按下了开关" + index + "，");
        this.lights[map[index]] = true;
        System.out.println("房间" + map[index] + "的灯光已打开！");
    }

    public void turnOff(int index) {
        System.out.print("按下了开关" + index + "，");
        this.lights[map[index]] = false;
        System.out.println("房间" + map[index] + "的灯光已关闭！");
    }
}
