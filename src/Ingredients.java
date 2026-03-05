public abstract class Ingredients {

    private String name;
    private double amount;
    private Units units;

    public Ingredients(String name, double amount, Units units){
        this.name = name;
        this.amount = amount;
        this.units = units;

    }
}
