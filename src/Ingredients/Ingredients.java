package Ingredients;

public abstract class Ingredients {

    private String name;
    private double amount;
    private Units units;

    public Ingredients(String name, double amount, Units units) {
        this.name = name;
        this.amount = amount;
        this.units = units;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Units getUnits() {
        return units;
    }

    public void setUnits() {
        this.units = units;
    }

    @Override
    public String toString() {
        return name + "," + amount + "," + units;
    }
}
