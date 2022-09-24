public class Calculator {
    public static void main(String[] args) {

        int itemPrice = 105;
        double shippingRate = 0.02;
        double shippingTotal = 0;
        double totalCost = 0;

        if (itemPrice >= 100){
            System.out.println("You get free shipping.");
            System.out.println("Your total cost is " + itemPrice);
        }else if (itemPrice < 100){
            shippingTotal = (itemPrice * shippingRate);
            totalCost = shippingTotal + itemPrice;
            System.out.println("Your shipping cost is " + shippingTotal);
            System.out.println("Your total cost is " + totalCost);
        }
    }
}
