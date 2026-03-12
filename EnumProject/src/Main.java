import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DayOfWeek day =DayOfWeek.TUES;
        for(int i=0;i<10;i++){
            day=getRandomDay();
//            System.out.printf("Name is %s, Ordinal value =%d\n", day.name(), day.ordinal());
//
//            if(day==DayOfWeek.FRI)
//                System.out.println("Found a Friday");
            switchDayOfWeek(day);

        }

        for(Topping topping: Topping.values()){
            System.out.println(topping.name()+": "+topping.getPrice());
        }

    }

    public static DayOfWeek getRandomDay() {
        int randomInt = new Random().nextInt(7);
        var allDay=DayOfWeek.values();
        return allDay[randomInt];
    }

    public static void switchDayOfWeek(DayOfWeek day){
        int dayInt = day.ordinal()+1;
        switch (day){
            case WED -> System.out.println("Wednesday is Day: "+dayInt);
            case SAT -> System.out.println("Saturday is Day: "+dayInt);
            default -> System.out.println(day.name().charAt(0)+day.name().substring(1).toLowerCase()
            +"day is Day: "+dayInt);
        }
    }
}