
import java.util.ArrayList;
import java.util.Scanner;

public class CommandLine {
    public void runCommandLine(){
        ArrayList<Object> objects = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("\n1: Add an Object\n2: List an Object\n3: Delete an Object\n4: Quit");
            int userChoice = input.nextInt();
            if (userChoice == 1) {
                //Add object code
                System.out.println("which object would you like to add?");
                String addedObject = input.next();
                objects.add(addedObject);
            }
            else if (userChoice == 2) {
                //list object code
            }
            else if (userChoice == 3) {
                System.out.println("What object do you want to delete? ");
                String deletedObject = input.next();
                objects.remove(deletedObject);
            }
            else if (userChoice == 4) {
                System.out.println("Bye!");
                break;
            }
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
