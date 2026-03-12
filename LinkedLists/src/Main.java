import java.util.LinkedList;
import java.util.ListIterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);
//        gettingElements(placesToVisit);
        printItinery3(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");
        //Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowumba");

        //stack methods
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Melbourne");
        System.out.println(list);
        String s1=list.remove();//removes first elem
        System.out.println(s1+" was removed");
        String s2=list.removeFirst();//removes first elem
        System.out.println(s2+" was removed");

        String s3=list.removeLast();//removes last elem
        System.out.println(s3+" was removed");

        //Queue/Deque methods

        String p1=list.poll(); //removes first elem
        System.out.println(p1+" was removed");
        String p2=list.pollFirst(); //removes first elem
        System.out.println(p2+" was removed");
        String p3=list.pollLast(); //removes last elem
        System.out.println(p3+" was removed");

        list.push("Sydney");
        list.push("Canberra");
        list.push("Melbourne");
        System.out.println(list);

        //Stack methodes
        String p4 = list.pop();
        System.out.println(p4+" was removed");

    }

    private static void gettingElements(LinkedList<String> list){
        System.out.println("Retrieved Element = "+list.get(4));

        System.out.println("first Element = "+list.getFirst());
        System.out.println("last Element = "+list.getLast());

        System.out.println("Darwin is at position: "+list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: "+list.lastIndexOf("Melbourne"));

        //Queue retrieval methods
        System.out.println("Element from element(): "+list.element()); //queue -fifo-returns first elem

        //Stack retrieval methods
        System.out.println("Element from peek(): "+list.peek()); //first elem
        System.out.println("Element from peekFirst(): "+list.peekFirst());//first elem
        System.out.println("Element from peekLast(): "+list.peekLast());//last elem
    }

    private static void printItinery(LinkedList<String> list){
        System.out.println("Trip starts at "+list.getFirst());
        for (int i=1;i<list.size();i++){
            System.out.println("---> From: "+list.get(i-1) +" to "+list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void printItinery2(LinkedList<String> list){
        System.out.println("Trip starts at "+list.getFirst());
        String prevTown =list.getFirst();

        for (String town: list) {
            System.out.println("---> From: "+prevTown +" to "+town);
            prevTown=town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    private static void printItinery3(LinkedList<String> list){
        System.out.println("Trip starts at "+list.getFirst());
        String prevTown =list.getFirst();
//        ListIterator<String> iterator = list.listIterator();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()){
            var town=iterator.next();
            System.out.println("---> From: "+prevTown +" to "+town);
            prevTown=town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }
}