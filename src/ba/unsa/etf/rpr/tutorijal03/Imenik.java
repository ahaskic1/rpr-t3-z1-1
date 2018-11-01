package ba.unsa.etf.rpr.tutorijal03;

public class Imenik {
    void dodaj(String ime, TelefonskiBroj broj);
    String dajBroj(String ime);
    String dajIme(TelefonskiBroj broj);
    String naSlovo(char s);
    Set<String> izGrada(Grad g);
    Set<TelefonskiBroj> izGradBrojevi(Grad g);
}
