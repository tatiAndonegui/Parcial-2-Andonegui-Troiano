public class Square extends Rectangle {

    public Square (){
    super();};
    public Square (double side){
        super(side,side);
    }
    public Square (double side, String color, boolean filled){
       super(side,side);
        this.color=color;
        this.filled=filled;
    }

    public double getSide() {
        return super.lenght;
    }

    public void setSide(double side) {
        super.setLenght(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLenght(double side) {
        super.setLenght(side);
    }

    @Override
    public String toString() {
        return "Square [color="+ super.color + "filled= " + super.filled + "lenght= "+ lenght + "width=" + width + "]";
    }
}
