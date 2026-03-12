import util.QueryList;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int studCount=10;
        List<Student> students = new ArrayList<>();
        for (int i=0;i<studCount;i++){
            students.add(new Student());
        }
        students.add(new LPAStudent());
        printList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i=0;i<studCount;i++){
            lpaStudents.add(new LPAStudent());
        }
        printList(lpaStudents);

        testList(new ArrayList<String>(List.of("Apple, Mango, Bama")));
        testList(new ArrayList<Integer>(List.of(1,2,3)));

        var queryList = new QueryList<>(lpaStudents);
        var matches = queryList.getMatches("Course","Python");
        printList(matches);

        var student2021 = QueryList.getMatches(students,"YearStarted","2021");
        printList(student2021);

    }


    public static void printList(List<? extends Student> students){

        for(var student: students){
            System.out.println(student.getYearStarted()+": "+student);
        }
        System.out.println();
    }
    public static void testList(List<?> list){
        for (var elem:list){
            if(elem instanceof String s){
                System.out.println("String: "+s.toUpperCase());
            }else if(elem instanceof Integer e)
                System.out.println("Integer: "+e.floatValue());
        }
    }

//    public static void testList(List<String> list){
//        for (var elem:list){
//            System.out.println("String: "+elem.toUpperCase());
//        }
//    }
//
//    public static void testList(List<Integer> list){
//        for (var elem:list){
//            System.out.println("String: "+elem.floatValue());
//        }
//    }
//    public static <T extends Student> void printList(List<T> students){
//        for(var student: students){
//            System.out.println(student.getYearStarted()+": "+student);
//        }
//        System.out.println();
//    }
}