import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");



         Item[][] items = new Item[][] {
             { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
             { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
             { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
         };
         Machine machine = new Machine(items);


         while(true) {
            System.out.println("Pick a row: " );
            int row = scanner.nextInt();
            System.out.println("Pick a spot in the row");
            int spot = scanner.nextInt();


             if (machine.dispense(row, spot)) {
                 System.out.println("\n" + machine);
                 System.out.println("\nEnjoy your drink! Press 1 to purchase another: ");
                 int answer = scanner.nextInt();

                 if(answer != 1) {
                     System.out.println("Ok, bye!");
                     break;
                 }

             } else {
                 System.out.println("\n" + machine);
                 System.out.println("\nSorry, we're out of this item. Press 1 to purchase another: ");
                 int answer = scanner.nextInt();

                 if(answer != 1) {
                     System.out.println("Ok, bye!");
                     break;
                 }

             }
         }
        scanner.close();
    }
}