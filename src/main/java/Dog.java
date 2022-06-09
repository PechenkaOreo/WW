public class Dog {
    public static Object print;
    private String name;
private int age;
private String color;
private int height;

    public Dog(String name, int age, String color, int height) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.height = height;

    }

    public void print() {
        System.out.println("Name "+this.name);
        System.out.println("Age "+this.age);
        System.out.println("Color "+this.color);
        System.out.println("Height "+this.height);
        
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Dog(){
        System.out.println("Creating object of the class Dog.");
    }
}

