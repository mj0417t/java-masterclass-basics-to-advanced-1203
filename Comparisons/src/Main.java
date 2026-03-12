import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Integer i=5;
    Integer[] others ={0,5,10,15,20,-50,50};
    for(Integer val:others){
        int comp=i.compareTo(val);
        System.out.printf("%d %s %d: compareTo=%d%n",i,
                (val==0?"==":(val<0)?"<":">"),val,comp);
    }

    String banana="banana";
    String[] fruits={"apple","banana","peer","BANANA"};

    for(String s: fruits){
        int val=banana.compareTo(s);
        System.out.printf("%s %s %s: compareTo=%d%n",banana,
                (val==0?"==":(val<0)?"<":">"),s,val);
    }
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

        System.out.println("A:"+(int)'A'+" "+"a:"+(int)'a');
        System.out.println("B:"+(int)'B'+" "+"b:"+(int)'b');
        System.out.println("P:"+(int)'P'+" "+"p:"+(int)'p');

        Student tim = new Student("Tim");
        Student[] students = {
                new Student("Rosalie"),
                new Student("Jamie"),
                new Student("Celine"),
                new Student("Romaro")
        };

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        System.out.println("result: "+tim.compareTo(new Student("TIM")));

//        for (Student st:students){
//
//        }

        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students,gpaSorter.reversed());
        System.out.println(Arrays.toString(students));


    }
}



class StudentGPAComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.gpa+o1.getName()).compareTo(o2.gpa+o2.getName());
    }
}

class Student implements Comparable<Student> {
    private static int LAST_ID=1000;
    private static Random random = new Random();

    private String name;
    private int id;
    protected double gpa;

    public String getName() {
        return name;
    }

    public Student(String name) {
        this.name = name;
        this.id=LAST_ID++;
        this.gpa=random.nextDouble(1.0,4.0);
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id,name,gpa);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }
}