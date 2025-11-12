import java.util.ArrayList;
import java.util.Scanner;

public class CommandLine {
    private ArrayList<String> objects = new ArrayList<>();

    public void commandLine() {
        Scanner input = new Scanner(System.in);
        boolean running = true;
            while(running) {
                System.out.println("=== Device Manager ===");
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
                        System.out.println("Device \"" + name + "\" added");
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

                    case 3:
                    if (objects.isEmpty()) {
                        System.out.println("No devices to delete.");
                    } else {
                        System.out.println("Enter the number of the device to delete:");
                        for (int i = 0; i < objects.size(); i++) {
                            System.out.println((i + 1) + ". " + objects.get(i));
                        }

                        int index = input.nextInt();
                        input.nextLine();

                        if (index > 0 && index <= objects.size()) {
                            String removed = objects.remove(index - 1);
                            System.out.println("Device \"" + removed + "\" deleted.");
                        } else {
                            System.out.println("Invalid selection.");
                        }
                    }
                    break;

                    case 4: 
                        running = false;
                        System.out.println("Program exited.");
                        break;

                }
            }
            input.close();

            
        }
}