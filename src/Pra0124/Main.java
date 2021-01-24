package Pra0124;

public class Main {
    public static void main(String[] args) {
        Shape shape=new Flower();
        if(shape instanceof Flower){
            Flower flower=(Flower)shape;
            flower.draw();
        }
//        Shape shape1=new Circle();
//        Shape shape2=new Rect();
//        Shape shape3=new Flower();
//        drawShape(shape1);
//        drawShape(shape2);
//        drawShape(shape3);
//        Shape[] shapes={new Circle(),new Rect(),new Flower()};
//        for(Shape x:shapes){
//            drawShape(x);
//        }
    }
    public static void drawShape(Shape shape){
        shape.draw();
    }
}
