public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5,"red",false);

        Shape s2 = new Circle();
        s2.setColor("red");

        Shape s3 = new Rectangle(1.0, 2.0, "red", false);

        Shape s4 = new Square(6.6);


        System.out.println(s1);
        System.out.println("El color del circulo es " + s2.getColor());
        System.out.println(s3);
        System.out.println(s4);


    }

}
