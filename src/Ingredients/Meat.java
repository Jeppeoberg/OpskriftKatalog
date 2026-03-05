package Ingredients;

public class Meat extends Ingredients {

    public Meat(String name, double amount, Units units){
        super(name, amount, units);
    }
    @Override
    public String ShoppingList() {

        if (getUnits() == Units.GRAM && getAmount() >= 1000) {
            return getName() + " - " + (getAmount() / 1000) + " L";
        }

        return getName() + " - " + getAmount() + " " + getUnits();
    }
}
