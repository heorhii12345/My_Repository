package maindemos;

public class BuilderPatternDemo {

    public static void main(String[] args) {

        ProductBuilder productBuilder = new ProductBuilder();

        Selection sportShop = productBuilder.prepareSportshop();
        System.out.println("Sport-shop");
        sportShop.showItems();
        System.out.println("Total Cost: " + sportShop.getCost());

        Selection acquired2Orders = productBuilder.prepareAcquired2Items();
        System.out.println("\nAcquired 2 orders:");
        acquired2Orders.showItems();
        System.out.println("Total Cost: " + acquired2Orders.getCost());
    }
}
