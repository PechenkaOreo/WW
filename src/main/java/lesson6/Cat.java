package lesson6;

public class Cat extends Animal {
    private String color;

    public Cat(boolean vegetarian, String eats, String color) {
        super(vegetarian, eats);
        this.color = color;
    }
    public Cat(String color){
        this.color="red";
    }
}



