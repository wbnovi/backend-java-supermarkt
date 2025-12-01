//import cls.SuperMarket;

import cls.Customer;
import cls.Product;
import cls.SuperMarket;

import java.util.Scanner;

public class main  {
    public static void main(String[] args) {
        Customer wis = new Customer("Wis");
        Product bread = new Product("Bread", 100, 2.5F);
        Product cheese = new Product("Cheese", 100, 2.5F);
        Product fruit = new Product("Fruit", 100, 2.5F);
        Product toiletPaper = new Product("Toilet Paper", 100, 2.5F);
        SuperMarket picnic = new SuperMarket(bread, cheese, fruit, toiletPaper);
        Scanner scanner = new Scanner(System.in);
//        System.out.println("picnic = " + picnic);
        wis.goToSuperMarket(picnic);
        wis.buyItem("bread", 95);
        wis.buyItem("bread", 6);
        wis.buyItem("bre ad", 6);
    }
}