package dev.lpa;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListChallenge {

    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place adelaide = new Place("Adelaide",1374);

        addPlaces(placesToVisit,adelaide);
        addPlaces(placesToVisit,new Place("adeliate",200));
        addPlaces(placesToVisit,new Place("Brisbane",917));
        addPlaces(placesToVisit,new Place("Perth",3923));
        addPlaces(placesToVisit,new Place("Alice Springs",2717));
        addPlaces(placesToVisit,new Place("Darwin",3972));
        addPlaces(placesToVisit,new Place("adeliate",200));
        addPlaces(placesToVisit,new Place("Melbourne",877));

        placesToVisit.addFirst(new Place("Sydney",0));
        System.out.println(placesToVisit);

        Scanner sc = new Scanner(System.in);
        var iterator =placesToVisit.listIterator();
        boolean quitLoop=false;
        boolean forward = true;
        printText();
        while(!quitLoop){

            if (!iterator.hasPrevious()){
                System.out.println("Originating: "+iterator.next());
                forward=true;
            }

            if (!iterator.hasNext()){
                System.out.println("Final: "+iterator.previous());
                forward=false;
            }

            System.out.println("Enter Value: ");
            String menuItem=sc.nextLine().toUpperCase().substring(0,1);
            switch(menuItem){
                case "F":
                    System.out.println("User wants to go forward");
                    if(!forward){
                        forward=true;
                        if(iterator.hasNext())
                            iterator.next(); //adjusts position forward
                    }
                    if(iterator.hasNext())
                        System.out.println(iterator.next());
                    break;
                case "B":
                    if(forward){
                        forward=false;
                        if(iterator.hasPrevious())
                            iterator.previous(); //adjusts position backwards
                    }
                    System.out.println("User wants to go backwards");
                    if(iterator.hasPrevious())
                        System.out.println(iterator.previous());
                    break;
                case "M":
                    printText();
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
                default:
                    quitLoop=true;
                    break;
            }
        }

    }

    private static void printText() {
        String textBlock= """
                Available Actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""";
        System.out.println(textBlock);
    }

    private static void addPlaces(LinkedList<Place> list, Place place) {
        if(list.contains(place)){
            System.out.println("Found Duplicate: "+place);
            return;
        }
        for (Place p:list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found Duplicate: "+place);
                return;
            }
        }
        int matchedIndex=0;
        for(var listPlace: list){
            if(place.distance()<listPlace.distance()){
                list.add(matchedIndex,place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }
}
