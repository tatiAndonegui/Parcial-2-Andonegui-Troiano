public class Rectangle extends Shape {

    protected double width;
    protected double lenght;

    public Rectangle (){
        this.width=1.0;
        this.lenght=1.0;
    };
    public Rectangle (double width,double lenght){
        this.width=width;
        this.lenght=lenght;
    }
    public Rectangle (double width, double lenght, String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.lenght=lenght;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLenght() {
        return lenght;
    }
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea(){
        return getWidth() * getLenght();
    };

    public double getPerimeter(){
        return 2 * (getWidth() + getLenght()) ;
    };


    @Override
    public String toString() {
        return "Rectangle [color= " + super.color + "filled= "+ super.filled +"lenght= "+ lenght + "width=" + width + "]";
    }

}
