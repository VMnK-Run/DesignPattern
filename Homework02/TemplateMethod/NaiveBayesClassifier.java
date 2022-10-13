package Homework02.TemplateMethod;

public class NaiveBayesClassifier extends ClassificationTemplate{
    @Override
    public void classifyAlgorithm() {
        this.classifier.naiveBayes();
    }
}
