package dev.lpa;

import dev.lpa.domain.Employee;
import dev.lpa.domain.StoreEmployee;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Employee> employees= new ArrayList<>(List.of(
                new Employee(10001,"Ralph", 2015),
                new Employee(10005,"Carole", 2021),
                new Employee(10022,"James", 2013),
                new Employee(13151,"Laura", 2020),
                new Employee(10050,"Jin", 2018)
        ));

//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);

        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());


        for (Employee e: employees)
            System.out.println(e);

        System.out.println("-".repeat(30));
        System.out.println("Store Members");

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
            new StoreEmployee(10015, "Mustufa", 2019,"Target"),
            new StoreEmployee(10515, "Rumaisa", 2021,"Walmart"),
            new StoreEmployee(10105, "Humair", 2020,"Macycs"),
            new StoreEmployee(10251, "Rohani", 2022,"Walmart"),
            new StoreEmployee(10215, "Humayun", 2024,"Target"),
            new StoreEmployee(10312, "Rukaiya", 2025,"Macycs")
        ));

//        var storeEmployComparator = new Employee.EmployeeComparator<>();
//        storeEmployees.sort(storeEmployComparator);

//        var genericEmployee = new StoreEmployee();
        StoreEmployee.StoreComparator comparator = new StoreEmployee().new StoreComparator<>();
        storeEmployees.sort(comparator);

        for (StoreEmployee se: storeEmployees)
            System.out.println(se);

        System.out.println("-".repeat(30));
        System.out.println("With Pig Latin Names");
        addPigLatinName(storeEmployees);

    }

    public static void addPigLatinName(List<? extends StoreEmployee> list){
        String lastName="piggy";

        class DecoratedEmployee extends StoreEmployee implements Comparable<DecoratedEmployee>{
            private String pigLatinName;
            private Employee originalInstance;

            public DecoratedEmployee(String pigLatinName, Employee originalInstance) {
                this.pigLatinName = pigLatinName+" "+lastName;
                this.originalInstance = originalInstance;
            }

            @Override
            public String toString() {
                return originalInstance.toString()+" "+ pigLatinName;
            }

            @Override
            public int compareTo(DecoratedEmployee o) {
                return pigLatinName.compareTo(o.pigLatinName);
            }
        }

        List<DecoratedEmployee> newList = new ArrayList<>(list.size());

        for (var employee:list){
            String name=employee.getName();
            String pigLatinName= name.substring(1)+name.charAt(0)+"ay";
            newList.add(new DecoratedEmployee(pigLatinName,employee));
        }

        newList.sort(null);
        for (var dEmp: newList){
            System.out.println(dEmp.originalInstance.getName() +" "+ dEmp.pigLatinName);
        }
    }
}