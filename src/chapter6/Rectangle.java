package chapter6;
// Fields: private
// Methods to access the field : Public
public class Rectangle {
    private double length;
    private double width;

    //default constructor
    public Rectangle(){
        length = 0;
        width = 0;
    }

    // We can have as many constructors as we want
    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calculatePerimeter(){
        return (2*width) + (2*length);
    }

    public double calculateArea(){
        return width * length;
    }
}


