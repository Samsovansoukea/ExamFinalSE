import java.util.ArrayList;
import java.util.Scanner;

public class Contactlist{
	static ArrayList<Contact> contacts = new ArrayList<>();

    public static void addnewcontact(){
        Scanner sc = new Scanner(System.in);
        String firstName, lastName, number, purpose;
        int n;
        ArrayList<Telephone> phoneNumber = new ArrayList<>();
        System.out.print("FirstName: ");
        firstName = sc.next();
        System.out.print("LastName: ");
        lastName = sc.next();
        System.out.print("Among number want to add: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++){
        System.out.print("Phone Number: ");
        number = sc.next();
        System.out.print("Purpose: ");
        purpose = sc.next();
        phoneNumber.add(new Telephone(number, purpose));
        }
        contacts.add(new Contact(firstName, lastName, phoneNumber));
    }

    public static void listContast(){
        for(int i=0; i<contacts.size(); i++){
            System.out.println(contacts.get(i));
        }
    }

    public static void update(){
        Scanner sc = new Scanner(System.in);
        int place, n; 
        String firstName, lastName, number, purpose;
        System.out.print("Enter index as 0 is the first record contact list: ");
        place = sc.nextInt();
        Contact c = contacts.get(place);
        ArrayList<Telephone> t = new ArrayList<>();
        if(c!=null){
            System.out.print("FirstName: ");
            firstName = sc.next();
            System.out.print("LastName: ");
            lastName = sc.next();
            System.out.print("Amount of phone number you want to add: ");
            n = sc.nextInt();
            for(int i=0; i<n; i++){
            System.out.print("Phone Number: ");
            number = sc.next();
            System.out.print("Purpose: ");
            purpose = sc.next();
            t.add(new Telephone(number, purpose));
            }
            c.updateContact(firstName, lastName, t);
        }
        else{
            System.out.println("Index does not exit!!!");
        }
    }

    public static void delete(){
        Scanner sc = new Scanner(System.in);
        int index;
        System.out.print("Index: ");
        index = sc.nextInt();
        contacts.remove(index);

    }
    static class Menu{
    public static void main(String[] args){
        int choice;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("1. Add new contact\n"+"2. Update contact by index\n"+"3. Delete contact by index\n"+"4. List all contact\n"+
                                "5. Quit\n");
            System.out.print("Choose your option: ");
            choice =sc.nextInt();
            switch(choice){
                case 1: addnewcontact(); 
                break;
                case 2: update();
                break;
                case 3: delete();
                break;
                case 4:listContast();
                break;
                case 5: System.out.print("Thank for using program !Have a nice day!");
                break;
                default:
                System.out.println("Error input option!");
            }
        }while(choice!=5);
        sc.close();
    }
}
}