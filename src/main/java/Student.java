public class Student {
    private String family;
    private  String name;
    public int age;
    private int id;
    private int level;
static public String str = "Human";

    public int getAge() {
        return age;
    }

    public Student(String family, String name) {
        int id;
        this.family = family;
        this.name = name;
        this.age = validate(age);
        this.id=(int) Math.random()*100;
        this.level=0;
    }

    private int validate(int age) {
        if ((age>15)&&(age<45)){
    return  age;
        }
        return 16;
    }

    public void setLevel(int level) {
        if((level<10)&&(level>0)){

        }
        this.level = level;
    }

    public Student(String family, String name, int age, int id) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Student() {
        System.out.println("constructor error");
        this.family="Antonov";
        this.name="Anton";
        this.age=16;
        this.id=13123;
        this.level=1212;
    }

    public void print(){
        System.out.println("Family"+this.family);
        System.out.println("NAME"+this.name);
        System.out.println("AGE"+this.age);
        System.out.println("id"+this.id);
        System.out.println(str);
    }
}


