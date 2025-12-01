import cls.Customer;
import cls.Product;
import cls.SuperMarket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      Declare objects
        Customer wis = new Customer("Wis");
        Product bread = new Product("Bread", 100, 2.5F);
        Product cheese = new Product("Cheese", 100, 2.5F);
        Product fruit = new Product("Fruit", 100, 2.5F);
        Product toiletPaper = new Product("Toilet Paper", 100, 2.5F);
        SuperMarket picnic = new SuperMarket(bread, cheese, fruit, toiletPaper);
        Scanner scanner = new Scanner(System.in);
        boolean isShopping = true;

//      Give supermarket object to customer
        wis.goToSuperMarket(picnic);

//      START THE SHOPPING
        System.out.println("Welcome to the market!");
        while (isShopping) {
            String productName;
            int amount;

            System.out.println("Enter the name of the product you want to buy (or type exit to exit the market): ");
            productName = scanner.next();
            if (productName.equalsIgnoreCase("exit")) {
                System.out.println("ty see ya!!!");
                isShopping = false;
                break;
            } else {
                System.out.println("Enter the amount of products you want to buy: ");
                if (scanner.hasNextInt()) {
                        amount = scanner.nextInt();
                    } else {
                    amount = 0;
                }
            }
            wis.buyItem(productName, amount);
        }

//        TESTING STUFF
//        System.out.println("picnic = " + picnic);
//        wis.goToSuperMarket(picnic);
//        wis.buyItem("bread", 95);
//        wis.buyItem("bread", 6);
//        wis.buyItem("rhizomatic abstraction", 6);
    }
}