public class Postac {
    DodawanieBroni dodawanieBronii;

    public Postac(){
    }

    public Postac(DodawanieBroni dodawanieBroniii){
        this.dodawanieBronii = dodawanieBroniii;
    }

    public void dodawanieBroni(){ dodawanieBronii.dodaj();}

    public void nazwaPostaci(){ System.out.print(Postac.super.getClass().getName() + " - "); }
}
