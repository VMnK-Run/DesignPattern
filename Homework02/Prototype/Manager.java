package Homework02.Prototype;

import java.util.HashMap;

public class Manager {
    private HashMap<String, ResumeTemplate> templates = new HashMap<String, ResumeTemplate>();

    public Manager() {}

    public void registerTemplate(String name, ResumeTemplate template) {
        this.templates.put(name, template);
    }

    public ResumeTemplate create(String name, int flag) throws CloneNotSupportedException {
        if(flag == 0) {
            return (ResumeTemplate) this.templates.get(name).createClone();
        } else {
            return (ResumeTemplate) this.templates.get(name).createDeepClone();
        }
    }
}
