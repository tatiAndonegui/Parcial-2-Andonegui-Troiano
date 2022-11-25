public class Circle extends Shape{

    protected double radius;

    public Circle(){
        this.radius=1.0;
    };
    public Circle(double radius,String color, boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public Circle(double radius){
        this.radius=radius;
    }


    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 3.14 * radius;
    };

    public double getPerimeter(){
        return 2 * 3.14 * radius ;
    };


    @Override
    public String toString() {
        return "Circle [color=" + super.color + "filled= " + super.filled + "radius=" + radius + "]";
    }


}
