public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingPrice = 150;
    private int backPackPrice =20;

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway =false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        this.price = this.veg ? 300 : 400;
    }
public void addExtraCheese(){
        isExtraCheeseAdded = true;
    this.price += extraCheesePrice;
}
public void addExtraToppings(){
        isExtraToppingsAdded = true;
    this.price += extraToppingPrice;
}

public void takeAway(){
        isOptedForTakeAway = true;
    this.price += backPackPrice;
}
public void getBill(){
    int basePizzaPrice = this.veg ? 300 : 400;
    String bill = "Base Pizza: " + basePizzaPrice + "\n";

    if (isExtraCheeseAdded){
        bill += "Extra Cheese Added : " +extraCheesePrice+ "\n";
    }
    if (isExtraToppingsAdded) {
        bill += "Extra Toppings Added : " +extraToppingPrice+ "\n";
    }
    if (isOptedForTakeAway) {
        bill += "Extra Away : " +backPackPrice+  "\n";
    }
    bill += "Bill : " +this.price + "\n";
    System.out.println(bill);
}
}
/**
 * Base Pizza : 300
 * Toppings : 150
 * Cheese : 100
 * Take Away :20
 */