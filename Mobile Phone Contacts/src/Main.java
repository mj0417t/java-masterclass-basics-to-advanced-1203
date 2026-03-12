//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static MobilePhone myMob;

    public static void main(String[] args) {
        myMob = new MobilePhone("Rajsss");
        for(int i=0;i<5;i++){
            Contact con = new Contact("Raj - "+i,"3345342"+(9-i));
            myMob.addNewContact(con);
        }

        myMob.printContacts();
        Contact con = new Contact("Piyush","1234");
        System.out.println(myMob.addNewContact(con));
        myMob.printContacts();
        Contact con2 = new Contact("Piyush Grewal","1234");
        myMob.updateContact(con,con2);
        myMob.printContacts();
        myMob.removeContact(con2);
        myMob.printContacts();
        System.out.println(myMob.queryContact("Raj - 1"));



    }
}