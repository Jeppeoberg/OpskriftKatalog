package Ingredients;

public class Fruits extends Ingredients {
    public Fruits(String name, double amount, Units units) {
        super(name, amount, units);
    }

    @Override
    public String ShoppingList() {

        if (getUnits() == Units.PIECES && getAmount() >= 1000) {
            return getName() + " - " + (getAmount() / 1000) + " L";
        }

        return getName() + " - " + getAmount() + " " + getUnits();
    }
}