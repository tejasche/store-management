import java.util.ArrayList;
import java.util.Scanner;

public class Commandline {
    private ArrayList<String> objects = new ArrayList<>();

    public void commandLine() {
        Scanner input = new Scanner(System.in);
        boolean running = true;
            while(running) {  
                System.out.println("\n=== Device Manager ===");
                System.out.println("1. Add new device");
                System.out.println("2. List all devices");
                System.out.println("3. Delete a device");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");

                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Input device name: ");
                        String name = input.nextLine();
                        objects.add(name);
                        System.out.println("Device \"" + name + "\" added@");
                        break;


                        case 2:
                    if (objects.isEmpty()) {
                        System.out.println("No devices found.");
                    } else {
                        System.out.println("Devices:");
                        for (int i = 0; i < objects.size(); i++) {
                            System.out.println((i + 1) + ". " + objects.get(i));
                        }
                    }
                    break;

                    
                }


            }
       
    }
}
