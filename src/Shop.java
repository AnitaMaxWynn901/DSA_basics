public class Shop {
    private static int shirtAmount;
    private static double shirtPrice;
    private static int bagAmount;
    private static double bagPrice;
    private static int shoesAmount;
    private static double shoesPrice;
    public Shop() {
        shirtAmount = 0;
        shirtPrice = 150.0;
        bagAmount = 0;
        bagPrice = 990;
        shoesAmount = 0;
        shoesPrice = 1690;
    }
    public static void addShirtAmount() {
        shirtAmount++;
    }
    public static void addBagAmount() {
        bagAmount++;
    }
    public static void addShoesAmount() {
        shoesAmount++;
    }
    public static void viewCart() {
        System.out.println("--- Cart Summary ---");
        System.out.println("Shirt: "+ shirtAmount);
        System.out.println("Bag: "+ bagAmount);
        System.out.println("Shoes: "+ shoesAmount);
        System.out.println("Total price = "+
                ((shirtAmount*shirtPrice)+(bagAmount*bagPrice)+(shoesAmount*shoesPrice
                )) + " baht");
        System.out.println("--------------------");
    }
}
