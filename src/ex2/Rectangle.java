package ex2;

public class Rectangle {
    private double width;
    private double length;
    Rectangle(){};

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return (width + length) * 2;
    }
}
