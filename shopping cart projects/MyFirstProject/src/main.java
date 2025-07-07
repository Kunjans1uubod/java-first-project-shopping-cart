 import java.sql.SQLOutput;
 import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //shopping cart program

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency='$';
        double total;

        System.out.println("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.println("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How much quantity would you like to have?: ");
        quantity = scanner.nextInt();


        total = price * quantity;

        System.out.println("You have Brought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);


        scanner.close();
    }
}

