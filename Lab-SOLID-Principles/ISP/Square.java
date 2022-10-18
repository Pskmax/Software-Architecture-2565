package ISP;

public class Square implements Interface {

    private int width;
    private int height;

    Square() {
    }
    
    Square(int side) {
        this.setSide(side);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSide(int side) {
        this.setWidth(side);
        this.setHeight(side);
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public int getArea(){
        return width*height;
    }
}
