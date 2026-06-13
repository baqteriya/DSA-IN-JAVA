public class Rectangle {
    int length;
    int width;

    public Rectangle(int length,int width) {
        this.length = length;
        this.width = width;
    }
    public void printRectangleDetails(){
        int area = length * width;
        System.out.println("------");
        System.out.println("*******");
        System.out.println("Length of Rectangle:"+ length);
        System.out.println("Width of Rectangle:"+ width);
        System.out.println("Area of Rectangle:"+ area);
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(22,43);
        r1.printRectangleDetails();
        
    }
    
}
