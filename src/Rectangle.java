public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return width * length;
    }

    public double getDiagonal(){
        double dia = Math.sqrt(length * length + width * width);
        return Math.sqrt(length * length + width * width);
    }

    public boolean isSquare(){
        if (length == width){
            return true;
        } else {
            return false;
        }
    }

}
