import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Odbiorca> odbiorcy = new ArrayList<>(Arrays.asList(
                new Odbiorca("John"),
                new Odbiorca("Johan"),
                new Odbiorca("Huan")
        ));

        odbiorcy.get(0).setDobieranieJezyka(new JezykAngielski());
        odbiorcy.get(0).setWyborSposobuDostawy(new ListElektroniczny());

        odbiorcy.get(1).setDobieranieJezyka(new JezykNiemiecki());
        odbiorcy.get(1).setWyborSposobuDostawy(new SMS());

        odbiorcy.get(2).setDobieranieJezyka(new JezykHiszpanski());
        odbiorcy.get(2).setWyborSposobuDostawy(new PocztaGlosowa());

        List reklamy = new ArrayList<>(Arrays.asList(
                "domestos", "tiktak", "brp paribas", "lufthanza"
        ));

        int losOsoby = (int)(Math.random() * odbiorcy.size());
        int losReklamy = (int)(Math.random() * reklamy.size());

        System.out.println(odbiorcy.get(losOsoby).getLoginName());
        odbiorcy.get(losOsoby).dobierzJezyka();
        odbiorcy.get(losOsoby).wybierzSposobDostawy();
        System.out.println();
        System.out.println(reklamy.get(losReklamy));
    }
}