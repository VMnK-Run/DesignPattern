package Homework02.TemplateMethod;

public class Adaptor extends ClassifyAlgorithm implements Classifier{

    @Override
    public void knn() {
        knnAlgorithm();
    }

    @Override
    public void naiveBayes() {
        naiveBayesAlgorithm();
    }

    @Override
    public void decisionTree() {
        decisionTreeAlgorithm();
    }
}
