class Student{
    String name;
    String grade;
    int marks;
}

public class array1{
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Hello";
        s1.grade = "A";
        s1.marks = 10;

        Student s2 = new Student();
        s2.name = "Hey";
        s2.grade = "b";
        s2.marks = 20;

        Student s3 = new Student();
        s3.name = "Hi";
        s3.grade = "c";
        s3.marks = 30;



for (int i = 0; i < Student.length; i++) {
    
        System.out.print(Student[i].name + " " + Student[i].grade + " " + Student[i].marks);
    }
    System.out.println();
}

}
