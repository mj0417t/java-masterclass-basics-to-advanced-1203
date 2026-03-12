import java.util.ArrayList;

public class MobilePhone {
    // write code here
    private String myNumber;
    private ArrayList<Contact> myContacts;


    public MobilePhone(String myNumber){
        this.myNumber=myNumber;
        this.myContacts=new ArrayList<>();

    }

    public boolean addNewContact(Contact contact){
        int index = findContact(contact);
        if(index>=0)
            return false;
        myContacts.add(contact);
        return true;

    }

    public boolean updateContact(Contact oldCont,Contact newCont){
        int index=findContact(oldCont);
        if(index>=0){
            myContacts.set(index,newCont);
            return true;
        }
        return false;
    }


    public boolean removeContact(Contact contact){
        int index = findContact(contact);
        if(index>=0){
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact){
        boolean flag=false;
        for(Contact con: myContacts){
            if(con.getName().equalsIgnoreCase(contact.getName())){
                flag=true;
                break;
            }
        }
        if(flag)
            return myContacts.indexOf(contact);
        else
            return -1;
    }

    private int findContact(String name){
        for(Contact con: myContacts){
            if(con.getName().equalsIgnoreCase(name)){
                return myContacts.indexOf(con);
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        int index =findContact(name);
        if(index>=0){
            return myContacts.get(index);
        }
        return null;
    }

    public void printContacts(){
//        Contact List:
//        1. Bob -> 31415926
//        2. Alice -> 16180339
//        3. Tom -> 11235813
//        4. Jane -> 23571113
        System.out.println("Contact list:");
        int i=1;
        for(Contact con: myContacts){
            System.out.printf("%d. %s -> %s\n",i++,con.getName(),con.getPhoneNumber());
        }

    }


}
