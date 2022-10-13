package Homework02.TemplateMethod;

public class DecisionTreeClassifier extends ClassificationTemplate{
    @Override
    public void classifyAlgorithm() {
        this.classifier.decisionTree();
    }
}
