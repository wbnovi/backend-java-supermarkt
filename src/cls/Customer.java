package cls;

public class Customer {
    public String name;
    public SuperMarket superMarket;

    public Customer(String name) {
        this.name = name;
//        this.supermarket = supermarket;
    }

    public void goToSuperMarket(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }

    public void buyItem(String productName, int amount) {
        String productNameFormat = productName.trim().toUpperCase();
        if (productNameFormat.equals("BREAD")) {
            superMarket.buyBread(amount);
        } else if (productNameFormat.equals("CHEESE")) {
            superMarket.buyCheese(amount);
        } else if (productNameFormat.equals("FRUIT")) {
            superMarket.buyFruit(amount);
        } else if (productNameFormat.equals("TOILETPAPER")) {
            superMarket.buyToiletPaper(amount);
        } else {
            System.out.printf("The market has no %s available.\n", productName);
        }
    }
}
