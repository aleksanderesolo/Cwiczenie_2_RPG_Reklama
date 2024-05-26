import java.util.ArrayList;

public class GlownaNadawaniaBroni {

    public static void main(String[] args) {

        ArrayList<Postac> postacie = new ArrayList<>();
        postacie.add(new Kanonier(new Armata()));
        postacie.add(new Lucznik(new LukKrotki()));
        postacie.add(new Rycerz(new Miecz()));
        postacie.add(new Strzelec(new Strzelba()));

        for (Postac postac : postacie) {
            postac.nazwaPostaci();
            postac.dodawanieBroni();
        }
    }
}