public class Odbiorca {
    private DobieranieJezyka dobieranieJezyka;
    private WyborSposobuDostawy wyborSposobuDostawy;
    private String loginName;

    Odbiorca(String loginName){ this.loginName = loginName; }

    public void dobierzJezyka(){ dobieranieJezyka.dobierzJezyk(); }
    public void setDobieranieJezyka(DobieranieJezyka dobieranieJezyka){ this.dobieranieJezyka = dobieranieJezyka; }
    public void wybierzSposobDostawy(){ wyborSposobuDostawy.wybierzDostawe();}
    public void setWyborSposobuDostawy(WyborSposobuDostawy wyborSposobuDostawy){ this.wyborSposobuDostawy = wyborSposobuDostawy; }

    public String getLoginName(){ return loginName; }
    public void setLoginName(String loginName){ this.loginName = loginName; }
}
