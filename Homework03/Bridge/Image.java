package Homework03.Bridge;

public class Image {
    protected Filter imageFilter;

    public Image() {
    }

    public void setImageFilter(Filter imageFilter) {
        this.imageFilter = imageFilter;
    }

    public void filter() {
        this.imageFilter.filter();
    }
}
