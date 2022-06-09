import jdk.nashorn.internal.ir.CatchNode;

public class lesson5 {
    public static void main(String[] args) {
        Student student = new Student("schevchenko", "vasiliy");
        System.out.println(student.age);
        String str = new String("Schevchenko");
        student.print();
        Student student1 = new Student("Ivanov", "Ivan");
        student1.print();
        Student student2 = new Student("Tarasov", "SAAA", 12, 122233);
        //student2.print();
        Student.str = "Animal";


      //  Student student3= new Student();
        //student3.print();


        ///////////ENCAPSULATION/////////
        System.out.println(student.getAge());
        int studentage=student.getAge();
        studentage++;
      Eyes eyes = new Eyes()

    }
}
