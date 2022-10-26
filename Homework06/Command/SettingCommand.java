package Homework06.Command;

public class SettingCommand extends Command{
    private int index; // 开关坐标
    private int light; // 对应的灯光

    public SettingCommand(RoomLight roomLight) {
        super(roomLight);
    }

    public void setMapping(int index, int light) {
        this.index = index;
        this.light = light;
        this.execute();
    }

    @Override
    public void execute() {
        System.out.println("设置开关" + index + "对应第" + light + "号房间");
        this.roomLight.setIndex(this.index, this.light);
    }
}
