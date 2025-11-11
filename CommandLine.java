
import java.util.ArrayList;
import java.util.Scanner;

public class CommandLine {
    public void runCommandLine(){
        ArrayList<Object> objects = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("1: Add an Object\n2: List an Object\n3: Delete an Object\n4: Quit");
        while (true){
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
                System.out.println("What object do you want to delet? ");
                String deletedObject = input.next();
                objects.delete(deletedObject);
            }

            else if (userChoice == 4) {
                break;
            }

            else{
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
