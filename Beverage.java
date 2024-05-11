public abstract class Beverage {
    String decription = "Unknown beverage";

    public String getDescription() {
        return decription;
    }

    public abstract double cost();
}
