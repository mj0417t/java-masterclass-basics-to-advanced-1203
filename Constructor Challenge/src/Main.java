//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Customer c1=new Customer();
//        Customer c2 = new Customer("Saraswati", "saras@gmail.com");
//        Customer c3 = new Customer("Musarrat Jahan","mj.0417@gmail.com", 1000000);
//        System.out.println(c1.getName() +" " +c1.getEmail()+ " "+c1.getCredit_limit());
//        System.out.println(c2.getName() +" " +c2.getEmail()+ " "+c2.getCredit_limit());
//        System.out.println(c3.getName() +" " +c3.getEmail()+ " "+c3.getCredit_limit());

        for(int i=1;i<=5;i++){

            LPAStudent s = new LPAStudent("20260"+i,
            //Student s = new Student("20260"+i,
                    switch (i){
                case 1 ->"Mary";
                case 2 ->"Carol";
                case 3 ->"Soud";
                case 4 ->"Raima";
                case 5 ->"Imran";
                        default -> "Anonymous";
                    },
                    "23/01/2000","Java");

            System.out.println(s);


        }


        Point p = new Point(1,-1);
        Point q = new Point(3,4);

        System.out.println(p.distance());
        System.out.println(p.distance(q));
        System.out.println(p.distance(1,2));
    }
}