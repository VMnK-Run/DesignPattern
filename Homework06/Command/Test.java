package Homework06.Command;

public class Test {
    public static void main(String[] args) {
        System.out.println("Command模式测试");
        RoomLight roomLight = new RoomLight();
        SettingCommand settingCmd = new SettingCommand(roomLight);
        settingCmd.setMapping(0, 0);
        settingCmd.setMapping(1, 3);
        settingCmd.setMapping(2, 1);
        settingCmd.setMapping(3, 2);
        settingCmd.setMapping(4, 4);
        SwitchCommand switchCmd = new SwitchCommand(roomLight);
        switchCmd.turn(2);
        switchCmd.turn(3);
        switchCmd.turn(2);
        switchCmd.turn(3);
    }
}
