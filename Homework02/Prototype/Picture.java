package Homework02.Prototype;

public class Picture implements Product{
    @Override
    public Product createClone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }

    @Override
    public Product createDeepClone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }
}
