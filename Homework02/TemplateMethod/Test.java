package Homework02.TemplateMethod;

public class Test {
    public static void main(String[] args) {
        System.out.println("TemplateMethod模式测试");
        ClassificationTemplate classify1 = new KNNClassifier();
        classify1.classifyMethod();
        System.out.println("===========");
        ClassificationTemplate classify2 = new NaiveBayesClassifier();
        classify2.classifyMethod();
        System.out.println("===========");
        ClassificationTemplate classify3 = new DecisionTreeClassifier();
        classify3.classifyMethod();
        System.out.println("===========");
    }
}
