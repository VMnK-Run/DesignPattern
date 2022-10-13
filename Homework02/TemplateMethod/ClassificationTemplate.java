package Homework02.TemplateMethod;

public abstract class ClassificationTemplate {
    protected Classifier classifier;

    public ClassificationTemplate() {
        this.classifier = new Adaptor();
    }

    public void readIn(){
        System.out.println("1.读取数据");
    }

    public void renderData(){
        System.out.println("2.转换数据格式");
    }

    public abstract void classifyAlgorithm();

    public void display(){
        System.out.println("4.显示数据分类结果");
    }

    public void classifyMethod(){
        readIn();
        renderData();
        System.out.print("3.");
        classifyAlgorithm();
        display();
    }

}
