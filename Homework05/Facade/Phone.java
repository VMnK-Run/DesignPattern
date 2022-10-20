package Homework05.Facade;

public class Phone {
    private Contacts contacts;
    private Image image;
    private Message message;
    public Phone() {
        this.contacts = new Contacts();
        this.image = new Image();
        this.message = new Message();
    }

    public void backup() {
        System.out.println("手机备份开始···");
        this.contacts.backup();
        this.image.backup();
        this.message.backup();
        System.out.println("手机备份完成！");
    }
}
