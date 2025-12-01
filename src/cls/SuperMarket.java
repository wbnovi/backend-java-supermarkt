package cls;

public class SuperMarket  {
    private Product bread;
    private Product cheese;
    private Product fruit;
    private Product toiletPaper;

    public SuperMarket(Product bread, Product cheese, Product fruit, Product toiletPaper) {
        this.bread = bread;
        this.cheese = cheese;
        this.fruit = fruit;
        this.toiletPaper = toiletPaper;
    }

    public void buyBread(int amount) {
        buyItem(bread, amount);
    }
    public void buyCheese(int amount) {
        buyItem(cheese, amount);
    }
    public void buyFruit(int amount) {
        buyItem(fruit, amount);
    }
    public void buyToiletPaper(int amount) {
        buyItem(toiletPaper, amount);
    }

    public void buyItem(Product product, int amount) {
        if (amount < 1) {
            System.out.println("Invalid amount\n");
        } else if (product.amount < amount) {
            System.out.printf("You cannot buy %d %s, we only have %d %s in stock.\n", amount, product.name, product.amount, product.name);
        } else {
            product.amount -= amount;
            System.out.printf("You bought %d %s for %.2f euro\n", amount, product.name, amount * product.price);
        }
    }

    @Override
    public String toString() {
        return "SuperMarket{" +
                "bread=" + bread +
                ", cheese=" + cheese +
                ", fruit=" + fruit +
                ", toiletPaper=" + toiletPaper +
                '}';
    }
}
