import dev.lpa.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>(List.of(
                new Employee("Raj", "Shamani", "23/03/2026"),
                new Employee("Swagata", "Sircar","23/05/2024"),
                new Employee("Lorem", "Ipsum", "4/04/2019"),
                new Employee("Bareb", "Sonata","17/04/2021")
        ));

       printOrderedList(employeeList,"name");
        System.out.println("-".repeat(30));
        System.out.println("-".repeat(30));
        System.out.println("-".repeat(30));
       printOrderedList(employeeList,"");
    }

    public static void printOrderedList(List<Employee> eList, String sortField){
        int currentYear= LocalDate.now().getYear();

        class MyEmployee{
            Employee containedEmployee;
            int yearWorked;
            String fullName;

            public MyEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                yearWorked = currentYear - Integer.parseInt(containedEmployee.hireDate().split("/")[2]);
                fullName = String.join(" ",containedEmployee.firstName(),containedEmployee.lastName());

            }

            @Override
            public String toString() {
                return "%s has been employed for %d years".formatted(fullName,yearWorked);
            }
        }

        List<MyEmployee> list = new ArrayList<>();
        for (Employee employee:eList){
            list.add(new MyEmployee(employee));
        }

        var comparator = new Comparator<MyEmployee>() {
            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {
                if (sortField.equals("name"))
                    return o1.fullName.compareTo(o2.fullName);
                return o1.yearWorked-o2.yearWorked;
            }
        };

        list.sort(comparator);


        for (MyEmployee em: list)
            System.out.println(em);


    }
}