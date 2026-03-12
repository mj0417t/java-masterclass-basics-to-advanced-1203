//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
//        Animal animal = new Animal("Generic Animal","Huge", 400);
//        doAnimalStuff(animal,"slow");
//        Dog dog = new Dog();
//        doAnimalStuff(dog, "fast");
//
//        Dog yorkie = new Dog("Yorkie",15);
//        doAnimalStuff(yorkie,"fast");
//
//        Dog retriever = new Dog("Labrador Retriever",65, "Floppy", "Swimmer");
//        doAnimalStuff(retriever, "slow");
//
//        Dog wolf= new Dog("Wolf",40);
//        doAnimalStuff(wolf,"slow");
//
//        Fish goldfish = new Fish("Goldfish",0.23,2,3);
//        doAnimalStuff(goldfish,"fast");
        Employee tim = new Employee("Tim Cook","19/07/1998","05/02/2026");
        System.out.println(tim);
        System.out.println("Age: "+tim.getAge());
        System.out.println("Pay: "+tim.collectPay());
        SalariesEmployee joe = new SalariesEmployee("Rashid Bolt","19/07/1998","05/02/2026",35000);
        System.out.println(joe);
//        System.out.println("Employees age: "+salariesEmployee.getAge());
        System.out.println("Joe's pay check: $"+joe.collectPay());
        joe.retire();
        System.out.println("Joe's pension check = $"+joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary Johns", "12/04/2002","20/09/2025",35.5);
        System.out.println(mary);
        System.out.println("Mary's pay check: $"+mary.collectPay());
        System.out.println("Joe's Holiday check = $"+mary.getDoublePay());
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("____");
    }
}