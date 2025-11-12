
import java.util.ArrayList;
import java.util.Scanner;

public class CommandLine {
    public void runCommandLine(){
        ArrayList<Object> objects = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Tech Store Management");

        while (true){
            System.out.println("\nOptions:\n1: Add an Object\n2: List an Object\n3: Delete an Object\n4: Quit");
            int userChoice = input.nextInt();

            if (userChoice == 1) {
                String whichObject = "";

                while (true) {
                    System.out.println("Would you like to create a peripheral or a device? ");
                    whichObject = input.next().toLowerCase();

                    if (whichObject.equals("peripheral") || whichObject.equals("device")) break;
                    System.out.println("Errror, type peripheral or device.");
                }

                System.out.println("What is the name of this item? ");
                String name = input.next();

                System.out.println("What color is this item? ");
                String color = input.next();

                System.out.println("What brand is this item? ");
                String brand = input.next();

                System.out.println("What year was this item made in? ");
                int year = input.nextInt();

                System.out.println("What is the price of this item? ");
                double price = input.nextDouble();

                System.out.println("What type of item is this (ex: phone, mouse, laptop, keyboard? ");
                String deviceType = input.next();

                if (whichObject.equals("peripheral")){
                    System.out.println("What is the connection type (ex: USB, Bluetooth)? ");
                    String peripheralType = input.next();

                    System.out.println("Does this device have battery, true or false? ");
                    boolean hasBattery = input.nextBoolean();

                    Peripheral peripheral = new Peripheral(name, color, brand, year, price, deviceType, peripheralType, hasBattery);
                    objects.add(peripheral);
                }

                if (whichObject.equals("device")){
                    System.out.println("What is the architecture type (ex: arm, x64)? ");
                    String architectureType = input.next();

                    System.out.println("Does this device have cellular connectivity, true or false? ");
                    boolean hasCellular = input.nextBoolean();

                    Device device = new Device(name, color, brand, year, price, deviceType, architectureType, hasCellular);
                    objects.add(device);
                }
            }
            else if (userChoice == 2) {
                if (objects.isEmpty()) {
                    System.out.println("No devices found.");
                }
                else {
                    System.out.println("Items:");
                    int i = 1;
                    for (Object object : objects) {
                        System.out.println();
                        System.out.println((i++) + ". " + object.toString());
                    }
                }
            }
            else if (userChoice == 3) {
                System.out.println("What object do you want to delete? ");
                int index = input.nextInt();
                objects.remove(index - 1);
            }
            else if (userChoice == 4) {
                System.out.println("Bye!");
                break;
            }
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        input.close();
    }
}