import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
   
    public String toString() {
        return "Student [age = " + age + ", name = " + name + "]";
    }

    
    public int compareTo(Student that) {
       if(this.age < that.age)  
          return -1;  
       else 
            return 1;
    }
    
}
public class comparator3 {
    public static void main(String[] args) {
        
        //Comparator<Student> c1 = new Comparator<Student>()
        Comparator<Student> c1 = (Student i, Student j) -> i.age % 100 > j.age % 100 ? 1: -1;
        //{
            // public int compare(Student i, Student j) {
            //     if(i.age%100 > j.age%100 )
            //         return 1;
            //     else 
            //         return -1;
            // }
        //};
        List<Student> Li = new ArrayList<>();
            Li.add(new Student(25,"John"));
            Li.add(new Student(24,"Alice"));
            Li.add(new Student(19,"Bob"));
            Li.add(new Student(37,"Charlie"));
            Li.add(new Student(18,"David"));
            Li.add(new Student(36,"Eva"));
        
            Collections.sort(Li ,c1); 

            for(Student s : Li)
                System.out.println(s);
        }
    }

