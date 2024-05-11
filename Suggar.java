public class Suggar extends CondimentDecorator {
    Beverage beverage;
    public Suggar(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription(){
        return beverage.getDescription() + ", Sugar";
    }

    @Override
    public double cost(){
        return 0.20 + beverage.cost();
    }
}
