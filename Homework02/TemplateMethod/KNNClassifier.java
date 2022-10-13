package Homework02.TemplateMethod;

public class KNNClassifier extends ClassificationTemplate{

    @Override
    public void classifyAlgorithm() {
        this.classifier.knn();
    }
}
