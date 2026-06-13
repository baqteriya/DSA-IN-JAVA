public class Cars {
    String color;
    String model;
    int speed;
    Cars( String color, String model, int speed){
        this.color = color;
        this.model = model;
        this.speed = speed;

    }
    public void start(){
        System.out.println("Cars is started");
    }
    public void printCarsdetails(){
        System.out.println("color of cars:"+ color);
        System.out.println("model of cars:"+ model);
        System.out.println("speed of cars:"+ speed);
        System.out.println("--------");
        System.out.println("*******");

    }
    public void stop(){
        System.out.println("cars is stoped");
    }
    public static void main(String[] args) {
        Cars cars = new Cars("Black","Kia",170);
         cars.printCarsdetails();
         Cars c1 = new Cars("Red", "Honda", 100);
         c1.printCarsdetails();

        
    }
}
