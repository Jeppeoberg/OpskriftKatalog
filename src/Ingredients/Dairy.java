package Ingredients;

public class Dairy extends Ingredients {
    public Dairy(String name, double amount, Units units) {
        super(name, amount, units);
    }
    @Override
    public String ShoppingList() {

        // Example of behavior specific to liquids
        if (getUnits() == Units.DECILITRES && getAmount() >= 1000) {
            return getName() + " - " + (getAmount() / 1000) + " L";
        }

        return getName() + " - " + getAmount() + " " + getUnits();
    }
}