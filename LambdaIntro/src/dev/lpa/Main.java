package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "alpha","bravo","charlie","delta"
        ));

        for (String s: list)
            System.out.println(s);

        System.out.println("-".repeat(30));

        list.forEach(myStr-> System.out.println(myStr));

        System.out.println("-".repeat(30));
        list.forEach((var myStr)->{
            char first = myStr.charAt(0);
            System.out.println(myStr+" means " +first);
        });

        int result= calculator((a,b)->a+b,5,2);
        var res2= calculator((a,b)->a/b,10.2,2.5);
        var res3= calculator((a,b)->a.toLowerCase()+" "+ b.toUpperCase(),"Ralph","Spencer");


        var coords= Arrays.asList(
                new double[]{47.523,-95.2343},
                new double[]{29.1432,-98.3242},
                new double[]{35.1556,-90.06943}
        );

        coords.forEach(s-> System.out.println(Arrays.toString(s)));

        BiConsumer<Double,Double> p1=(lat,lon)->
                System.out.printf("[lat:%.3f lon:%.3f]%n",lat,lon);

        var firstPoint = coords.get(0);
        processPoint(firstPoint[0],firstPoint[1],p1);

        System.out.println("-".repeat(53));
        coords.forEach(s->processPoint(s[0],s[1],p1));
        coords.forEach(s->processPoint(s[0],s[1],(lat,lon)->
                System.out.printf("[lat:%.3f lon:%.3f]%n",lat,lon)));

        list.removeIf(s -> s.equalsIgnoreCase("bravo"));
        list.forEach(s->System.out.println(s));

        list.addAll(List.of("echo","easy","earmest"));
        list.forEach(s -> System.out.println(s));

        System.out.println("-".repeat(34));
        list.removeIf(s->s.startsWith("ea"));
        list.forEach(s -> System.out.println(s));

        list.replaceAll(s->s.charAt(0) +"--"+ s.toUpperCase());
        System.out.println("-".repeat(30));
        list.forEach(s -> System.out.println(s));

        String emptyString[] = new String[10];
        Arrays.fill(emptyString,"");
        System.out.println(Arrays.toString(emptyString));
        Arrays.setAll(emptyString,(i)->""+(i+1)+". "
        +switch (i){
            case 0 -> "one";
            case
                    default -> ;
                }
                );
        System.out.println(Arrays.toString(emptyString));
    }

    public static <T> T calculator(BinaryOperator<T> function, T val1, T val2){
        T result = function.apply(val1,val2);
        System.out.println("Result of Operation: "+result);
        return result;
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T,T> consumer){
        consumer.accept(t1,t2);
    }
}
