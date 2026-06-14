class Animals {
    String color;
    String foodItems;

    Animals(String color, String foodItems) {
        this.color = color;
        this.foodItems = foodItems;
    }
}

class Dog extends Animals {
    Dog(String color, String foodItems) {
        super(color, foodItems);
    }

    public void printDisplay() {
        System.out.println("Color of animals: " + color);
        System.out.println("FoodItems of animals: " + foodItems);
    }

    public static void main(String args[]) {
        Dog dog = new Dog("Black", "bread");
        dog.printDisplay();
    }
}