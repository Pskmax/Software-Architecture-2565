package ISP;

public class Main {

    private static final int width = 4;
    private static final int height = 5;
    private static final int side = 5;

    public static void main(String[] args) {
        regtangle();

        square();
    }

    public static void regtangle(){
        Interface reg = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + reg.getWidth());
        System.out.println("Height = " + reg.getHeight());
        System.out.println("Area = " + reg.getArea());
    }

    public static void square(){
        Interface reg = new Square(side);
        System.out.println("====   Square  ====");
        System.out.println("Width = " + reg.getWidth());
        System.out.println("Height = " + reg.getHeight());
        System.out.println("Area = " + reg.getArea());
    }
}
