
import java.util.Scanner;

public class Commandline {
    public void commandLine(){
    
    
    Scanner input = new Scanner(System.in);
    System.out.println("1: Add an Object\n2: List an Object\n3: Delete an Object");
    int userDesire = input.nextInt();
    if (userDesire == 1) {
        //Add object code
        System.out.println("which object would you like to add?");
        String addedObject = input.next();
        LISTNAME.add(addedObject);
    }
    if (userDesire == 2) {
        //list object code
    }
    if (userDesire == 3) {
        System.out.println("What object do you want to delet? ");
        String deletedObject = input.next();
        LISTNAME.delete(deletedObject);
    }

    }
}
