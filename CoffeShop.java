import java.text.DecimalFormat;

public class CoffeShop {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args){
        Beverage kawka1 = new Espresso();

        System.out.println(kawka1.getDescription() + " " + kawka1.cost());
        kawka1 = new Milk(kawka1);
        System.out.println(kawka1.getDescription() + " " + kawka1.cost());
        kawka1 = new Milk(kawka1);
        System.out.println(kawka1.getDescription() + " " + kawka1.cost());

        kawka1 = new Suggar(kawka1);
        System.out.println(kawka1.getDescription() + " " + kawka1.cost());

        Beverage czekoladka1 = new Chocolate();

        System.out.println(czekoladka1.getDescription() + " " + df.format(czekoladka1.cost()));
        czekoladka1 = new Suggar(czekoladka1);
        System.out.println(czekoladka1.getDescription() + " " + df.format(czekoladka1.cost()));
    }
}
