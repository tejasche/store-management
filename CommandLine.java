
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
                System.out.println("Would you like to create a peripheral or a device? ");
                String whichObject = input.next();
                whichObject.strip();
                whichObject.toLowerCase();

                System.out.println("What color is this device? ");
                String color = input.next();

                System.out.println("What brand is this device? ");
                String brand = input.next();

                System.out.println("What year was this device made in? ");
                int year = input.nextInt();

                System.out.println("What is the price of this device? ");
                double price = input.nextDouble();

                if (whichObject.equals("peripheral")){
                    System.out.println("What is the peripheral type (ex: mouse, keyboard)? ");
                    String deviceType = input.next();

                    Peripheral peripheral = new Peripheral(color, brand, year, price, deviceType);
                    objects.add(peripheral);
                }

                if (whichObject.equals("device")){
                    System.out.println("What is the device type (ex: phone, laptop)? ");
                    String deviceType = input.next();

                    System.out.println("Does this device have cellular connectivity? ");
                    Boolean hasCellular = input.nextBoolean();

                    Device device = new Device(color, brand, year, price, deviceType, hasCellular);
                    objects.add(device);
                }
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