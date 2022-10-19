package Homework03.SimpleFactory;

public class UnsupportedShapeException extends Exception{

    public UnsupportedShapeException() {
        super();
    }
    public UnsupportedShapeException(String message){
        super(message);
    }
}
